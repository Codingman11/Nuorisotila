package com.example.nuorisotila;
import java.util.ArrayList;
public class YouthCenter {

    private static YouthCenter nuTi = null;


    public static YouthCenter getInstance() {
        if (nuTi == null) {
            nuTi = new YouthCenter();
        }

        return nuTi;
    }

    public YouthCenter() {
        ArrayList<YouthLeader> youthLeaders = new ArrayList<>();
    }




}
