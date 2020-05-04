package com.example.nuorisotila;

public class YouthLeader {

    private String name;
    private int age;
    private String phone;
    private String place;
    public YouthLeader(String na, int age, String phone, String place) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getPlace() {
        return place;
    }
}
