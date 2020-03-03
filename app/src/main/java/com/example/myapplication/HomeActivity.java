package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.myapplication.models.DummyData;
import com.example.myapplication.models.Event;
import com.example.myapplication.models.Instructor;

public class HomeActivity extends AppCompatActivity {
    private EventAdapter adapter;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        rv = findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        adapter = new EventAdapter(DummyData.events, new EventClickListener() {
            @Override
            public void onEventClick(Event event, int position) {
                Intent intent = new Intent(HomeActivity.this, EventActivity.class);
                intent.putExtra("pos",position);
                startActivity(intent);
            }
        });
        rv.setAdapter(adapter);
        rv.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}
