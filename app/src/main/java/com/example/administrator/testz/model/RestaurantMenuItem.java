package com.example.administrator.testz.model;

/**
 * Created by wrs on 2019/6/25,17:51
 * projectName: Testz
 * packageName: com.example.administrator.testz.model
 */
public class RestaurantMenuItem {
    String description;
    float price_wrs;

    public RestaurantMenuItem() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice_wrs() {
        return price_wrs;
    }

    public void setPrice_wrs(float price_wrs) {
        this.price_wrs = price_wrs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public RestaurantMenuItem(String description, float price,String mName) {
        this.description = description;
        this.price_wrs = price;
        this.name = mName;
    }

    public RestaurantMenuItem(String description, float price) {
        this.description = description;
        this.price_wrs = price;
    }
}
