package com.example.administrator.testz.model;

import java.util.List;

/**
 * Created by wrs on 2019/6/25,17:51
 * projectName: Testz
 * packageName: com.example.administrator.testz.model
 */
public class RestaurantWithMenu {
    String name;

    List<RestaurantMenuItem> menu;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RestaurantMenuItem> getMenu() {
        return menu;
    }

    public void setMenu(List<RestaurantMenuItem> menu) {
        this.menu = menu;
    }

    public RestaurantWithMenu(String future, List<RestaurantMenuItem> menuItems) {
        this.name = future;
        this.menu = menuItems;
    }
}
