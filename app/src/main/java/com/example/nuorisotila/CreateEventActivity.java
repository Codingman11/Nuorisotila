package com.example.nuorisotila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class CreateEventActivity extends AppCompatActivity {


    Button addEvent, btnTest;
    EditText etTitle, etDate, etPlace, etDesc;
    TextView testView;
    EventList eList = EventList.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);

        etTitle = (EditText) findViewById(R.id.etTitle);
        etDate = (EditText) findViewById(R.id.etDate);
        etPlace = (EditText) findViewById(R.id.etPlace);
        etDesc = (EditText) findViewById(R.id.etDesc);
        addEvent = findViewById(R.id.addEvent);
        btnTest = findViewById(R.id.btnTest);
        testView = (TextView) findViewById(R.id.textView2);



        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testView.setText(etTitle.getText().toString() + "," + etDate.getText().toString() + "," + etPlace.getText().toString() + "," + etDesc.getText().toString());
            }
        });


        addEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateEventActivity.this, MainActivity.class);
                eList.AddToArray(new Event(etTitle.getText().toString(), etDate.getText().toString(), etPlace.getText().toString(), etDesc.getText().toString()));

                startActivity(intent);
            }
        });
    }
}
