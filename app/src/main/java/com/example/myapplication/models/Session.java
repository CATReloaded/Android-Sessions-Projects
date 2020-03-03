package com.example.myapplication.models;

import java.io.Serializable;

public class Session implements Serializable {
    private String title;
    private Instructor instructor;
    private int[] resources;

    public Session(String title, Instructor instructor, int[] resources) {
        this.title = title;
        this.instructor = instructor;
        this.resources = resources;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public int[] getResources() {
        return resources;
    }

    public void setResources(int[] resources) {
        this.resources = resources;
    }
}
