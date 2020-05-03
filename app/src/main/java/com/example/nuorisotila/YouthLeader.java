package com.example.nuorisotila;

public class YouthLeader {

    private String name;
    private int age;
    private String phone;
    private String place;
    public YouthLeader(String na, int ag, String pho, String pla) {
        this.name = na;
        this.age = ag;
        this.phone = pho;
        this.place = pla;
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
