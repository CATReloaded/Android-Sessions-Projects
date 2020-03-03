package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.models.DummyData;
import com.example.myapplication.models.SessionAdapter;

public class EventActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
//        RecyclerView rv = findViewById(R.id.rv);
//        rv.setLayoutManager(new LinearLayoutManager(this));
//        rv.setAdapter(new SessionAdapter(DummyData.events[getIntent().getIntExtra("pos", 0)].getSessions()));
    }
}
