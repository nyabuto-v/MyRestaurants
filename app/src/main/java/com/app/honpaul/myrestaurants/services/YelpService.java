package com.app.honpaul.myrestaurants.services;

import android.util.Log;

import com.app.honpaul.myrestaurants.Constants;
import com.app.honpaul.myrestaurants.models.Restaurant;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class YelpService {
    private static OkHttpClient client = new OkHttpClient();

    public static void findRestaurants(String location, Callback callback) {
        //construct the url
        HttpUrl.Builder urlBuilder = HttpUrl.parse(Constants.YELP_BASE_URL).newBuilder();
        urlBuilder.addQueryParameter(Constants.YELP_LOCATION_QUERY_PARAMETER_KEY, location);
        String url = urlBuilder.build().toString();

        // constructing the request
        Request request = new Request.Builder()
                .header("Authorization", "Bearer " + Constants.YELP_ACCESS_TOKEN)
                .url(url)
                .build();

        //making the request
        Call call = client.newCall(request);

        //schedule the request to be executed at some point in the future and the call back
        call.enqueue(callback);
    }

    public List<Restaurant> processResults(Response response){
        List<Restaurant> restaurants = new ArrayList();

        try{
            String jsonData = response.body().string();
            Log.d("RestaurantsActivity", "processResults: " + jsonData);

            if(response.isSuccessful()){
                JSONObject yelpJSON = new JSONObject(jsonData);
                JSONArray businessesJSON = yelpJSON.getJSONArray("businesses");

                Gson gson = new GsonBuilder().create();
                Type collectionType = new TypeToken<List<Restaurant>>() {}.getType();
                restaurants = gson.fromJson(businessesJSON.toString(), collectionType);

//                Restaurant restaurant = gson.fromJson(businessesJSON.get(0).toString(), Restaurant.class);

            }
        }catch (JSONException | NullPointerException | IOException e){
            e.printStackTrace();
        }

        return restaurants;
    }


}
