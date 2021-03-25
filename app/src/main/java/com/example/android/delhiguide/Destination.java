package com.example.android.delhiguide;

import java.io.Serializable;

public class Destination implements Serializable {
    private String destination;
    private  String location;
    private  String nearestMetroStation;
    private  String timings;
    private  String entryFee;
    private  String info;
    private  String moreInfo;
    private int imageId;

    public Destination(String destination,String location, String nearestMetroStation, String timings, String entryFee, String info, String moreInfo, int imageId) {
        this.destination = destination;
        this.location = location;
        this.nearestMetroStation = nearestMetroStation;
        this.timings = timings;
        this.entryFee = entryFee;
        this.info = info;
        this.moreInfo = moreInfo;
        this.imageId = imageId;
    }

    public String getDestination() {
        return destination;
    }

    public String getLocation() {
        return location;
    }

    public String getNearestMetroStation() {
        return nearestMetroStation;
    }

    public String getTimings() {
        return timings;
    }

    public String getEntryFee() {
        return entryFee;
    }

    public String getInfo() {
        return info;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public int getImageId() {
        return imageId;
    }

}
