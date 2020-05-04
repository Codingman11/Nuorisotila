package com.example.nuorisotila;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    EventList eList = EventList.getInstance();

    private Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) { //test
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Setting all attributes
        Login = (Button) findViewById(R.id.btnLogin1);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //Eventlist initializing







        EventAdapter adapter = new EventAdapter(this);
        recyclerView.setAdapter(adapter);


        //Login

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        //Add event
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setAlpha(0.7f);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CreateEventActivity.class);
                startActivity(intent);
            }
        });



    }


}
