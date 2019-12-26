package com.example.retrofit2_my_study;

public class Post {
    private int office_id;
    private String office_name;
    private String office_location;
    private float lat;
    private float lon;
    private int umbrella_count;

//    @SerializedName("body")
//    private String text;

    public Post(int office_id, String office_name, String office_location, float lat, float lon, int umbrella_count) {
        this.office_id = office_id;
        this.office_name = office_name;
        this.office_location = office_location;
        this.lat = lat;
        this.lon = lon;
        this.umbrella_count = umbrella_count;
    }

    public int getOffice_id() {
        return office_id;
    }

    public void setOffice_id(int office_id) {
        this.office_id = office_id;
    }

    public String getOffice_name() {
        return office_name;
    }

    public void setOffice_name(String office_name) {
        this.office_name = office_name;
    }

    public String getOffice_location() {
        return office_location;
    }

    public void setOffice_location(String office_location) {
        this.office_location = office_location;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public int getUmbrella_count() {
        return umbrella_count;
    }

    public void setUmbrella_count(int umbrella_count) {
        this.umbrella_count = umbrella_count;
    }
}
