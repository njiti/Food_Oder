package com.example.food_oder;

public class DataModel {
    private String imageUrl;
    //Constructor
    public DataModel(String imageUrl){
        this.imageUrl = imageUrl;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }
}
