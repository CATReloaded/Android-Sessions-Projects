package com.example.myapplication.models;

import java.io.Serializable;
import java.util.Date;

public class Event implements Serializable {
    private Session[] sessions;
    private String title;
    private String date;
    private int imgResource;

    public Event(Session[] sessions, String title, String date, int imgResource) {
        this.sessions = sessions;
        this.title = title;
        this.date = date;
        this.imgResource = imgResource;
    }

    public int getImgResource() {
        return imgResource;
    }

    public void setImgResource(int imgResource) {
        this.imgResource = imgResource;
    }

    public Session[] getSessions() {
        return sessions;
    }

    public void setSessions(Session[] sessions) {
        this.sessions = sessions;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
