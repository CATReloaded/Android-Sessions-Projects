package com.example.myapplication.models;

import com.example.myapplication.R;

import java.util.HashMap;

public class DummyData {
    public static Instructor[] instructors = {
            new Instructor("Mohamed Hamdy", "Android Developer", R.drawable.img_hamdy),
            new Instructor("Sherif El-deep", "IOS Developer", R.drawable.img_sherif),
            new Instructor("Elsaeed", "Back-End Developer", R.drawable.img_elsaeed),
            new Instructor("Abbas Abbas", "Developer", R.drawable.img_abbas),
    };


    public static Session[] sessions = {
            new Session("Android Session", instructors[0] , new int[]{R.drawable.img_android}),
            new Session("IOS Session", instructors[1], new int[]{R.drawable.img_ios}),
            new Session("Back-End Session", instructors[2], new int[]{R.drawable.img_backend}),
            new Session("Session", instructors[3], new int[]{R.drawable.chaos})
    };

    public static Event[] events = {
            new Event(sessions, "Techy CAT-Shops", "24-2-2020", R.drawable.img_header_cide),
            new Event(sessions, "CAT SCOPE", "24-2-2020", R.drawable.img_cat_scope),
            new Event(sessions, "Techy CAT-Shops", "24-2-2020", R.drawable.img_header_cide),
    };
}
