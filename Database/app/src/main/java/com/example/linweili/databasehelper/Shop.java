package com.example.linweili.databasehelper;

/**
 * Created by linweili on 6/12/17.
 */

public class Shop {
    public String shopname;
    public String description;
    public String picureurl;
    public String lat;
    public String lng;
    public Shop() {

    }
    public Shop (String shopname, String description, String picureurl,String lat,String lng) {
        this.shopname = shopname;
        this.description = description;
        this.picureurl = picureurl;
        this.lat = lat;
        this.lng = lng;
    }
}
