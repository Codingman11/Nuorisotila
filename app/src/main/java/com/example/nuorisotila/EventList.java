package com.example.nuorisotila;

import java.util.ArrayList;

public class EventList {

    private static EventList mInstace;
    private ArrayList<Event> eList = null;

    public static EventList getInstance() {
        if(mInstace == null) {
            mInstace = new EventList();
        }
        return mInstace;
    }

    public EventList() {
        this.eList = new ArrayList<>();
    }

    public ArrayList<Event> getArray() {
        return this.eList;
    }
    public void AddToArray(Event e) {
        eList.add(e);
    }
}
