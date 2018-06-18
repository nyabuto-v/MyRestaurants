
package com.app.honpaul.myrestaurants.models;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Restaurant implements Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("alias")
    @Expose
    private String alias;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("is_closed")
    @Expose
    private Boolean isClosed;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("review_count")
    @Expose
    private Integer reviewCount;
    @SerializedName("categories")
    @Expose
    private List<Category> categories = null;
    @SerializedName("rating")
    @Expose
    private Double rating;
    @SerializedName("coordinates")
    @Expose
    private Coordinates coordinates;
    @SerializedName("transactions")
    @Expose
    private List<Object> transactions = null;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("display_phone")
    @Expose
    private String displayPhone;
    @SerializedName("distance")
    @Expose
    private Double distance;
    public final static Parcelable.Creator<Restaurant> CREATOR = new Creator<Restaurant>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Restaurant createFromParcel(Parcel in) {
            return new Restaurant(in);
        }

        public Restaurant[] newArray(int size) {
            return (new Restaurant[size]);
        }

    }
    ;

    protected Restaurant(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.alias = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.imageUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.isClosed = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.reviewCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        in.readList(this.categories, (com.app.honpaul.myrestaurants.models.Category.class.getClassLoader()));
        this.rating = ((Double) in.readValue((Double.class.getClassLoader())));
        this.coordinates = ((Coordinates) in.readValue((Coordinates.class.getClassLoader())));
        in.readList(this.transactions, (java.lang.Object.class.getClassLoader()));
        this.price = ((String) in.readValue((String.class.getClassLoader())));
        this.location = ((Location) in.readValue((Location.class.getClassLoader())));
        this.phone = ((String) in.readValue((String.class.getClassLoader())));
        this.displayPhone = ((String) in.readValue((String.class.getClassLoader())));
        this.distance = ((Double) in.readValue((Double.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Restaurant() {
    }

    /**
     * 
     * @param transactions
     * @param phone
     * @param location
     * @param alias
     * @param imageUrl
     * @param url
     * @param displayPhone
     * @param id
     * @param distance
     * @param price
     * @param name
     * @param reviewCount
     * @param categories
     * @param rating
     * @param isClosed
     * @param coordinates
     */
    public Restaurant(String id, String alias, String name, String imageUrl, Boolean isClosed, String url, Integer reviewCount, List<Category> categories, Double rating, Coordinates coordinates, List<Object> transactions, String price, Location location, String phone, String displayPhone, Double distance) {
        super();
        this.id = id;
        this.alias = alias;
        this.name = name;
        this.imageUrl = imageUrl;
        this.isClosed = isClosed;
        this.url = url;
        this.reviewCount = reviewCount;
        this.categories = categories;
        this.rating = rating;
        this.coordinates = coordinates;
        this.transactions = transactions;
        this.price = price;
        this.location = location;
        this.phone = phone;
        this.displayPhone = displayPhone;
        this.distance = distance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Boolean getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(Boolean isClosed) {
        this.isClosed = isClosed;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public List<Object> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Object> transactions) {
        this.transactions = transactions;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDisplayPhone() {
        return displayPhone;
    }

    public void setDisplayPhone(String displayPhone) {
        this.displayPhone = displayPhone;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(transactions).append(phone).append(location).append(imageUrl).append(alias).append(url).append(displayPhone).append(id).append(distance).append(price).append(reviewCount).append(name).append(categories).append(rating).append(isClosed).append(coordinates).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Restaurant) == false) {
            return false;
        }
        Restaurant rhs = ((Restaurant) other);
        return new EqualsBuilder().append(transactions, rhs.transactions).append(phone, rhs.phone).append(location, rhs.location).append(imageUrl, rhs.imageUrl).append(alias, rhs.alias).append(url, rhs.url).append(displayPhone, rhs.displayPhone).append(id, rhs.id).append(distance, rhs.distance).append(price, rhs.price).append(reviewCount, rhs.reviewCount).append(name, rhs.name).append(categories, rhs.categories).append(rating, rhs.rating).append(isClosed, rhs.isClosed).append(coordinates, rhs.coordinates).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(alias);
        dest.writeValue(name);
        dest.writeValue(imageUrl);
        dest.writeValue(isClosed);
        dest.writeValue(url);
        dest.writeValue(reviewCount);
        dest.writeList(categories);
        dest.writeValue(rating);
        dest.writeValue(coordinates);
        dest.writeList(transactions);
        dest.writeValue(price);
        dest.writeValue(location);
        dest.writeValue(phone);
        dest.writeValue(displayPhone);
        dest.writeValue(distance);
    }

    public int describeContents() {
        return  0;
    }

}
