package com.example.myapplication.models;

import java.io.Serializable;

public class Instructor implements Serializable {

    private String name;
    private String details;
    private int imgResource;

    public Instructor(String name, String details, int imgResource) {
        this.name = name;
        this.details = details;
        this.imgResource = imgResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getImgResource() {
        return imgResource;
    }

    public void setImgResource(int imgResource) {
        this.imgResource = imgResource;
    }
}
