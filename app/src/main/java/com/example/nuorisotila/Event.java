package com.example.nuorisotila;

import java.util.Date;

public class Event {

    private String title;
    private String date;
    private String place;
    private String desc;
    private int image;

    public Event(String title, String date, String place,  String desc, int image) {
        this.title = title;
        this.date = date;
        this.place = place;
        this.desc = desc;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
