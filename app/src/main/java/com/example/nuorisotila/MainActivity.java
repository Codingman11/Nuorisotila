package com.example.nuorisotila;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    List<Event> eventsList;
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
        eventsList = new ArrayList<>();

        eventsList.add(
                new Event(
                    "Koripallo",
                        "21.12.2020, 19:30-22:00",
                        "Hakaniemen nuorisotila",
                        "Tervetuloa pelaamaan",
                        R.drawable.basketball
                ));
        eventsList.add(
                new Event(
                        "Koripallo",
                        "21.12.2020, 19:30-22:00",
                        "Hakaniemen nuorisotila",
                        "Tervetuloa pelaamaan",
                        R.drawable.basketball
                ));

        EventAdapter adapter = new EventAdapter(this, eventsList);
        recyclerView.setAdapter(adapter);


        //Login

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });



    }


}
