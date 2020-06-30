package com.comkct.hospitalappointment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.List;

public class Search_activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
     Spinner spinner_city,spinner_type;
     Button search_btn,search2_btn;
     SearchView search_people;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_activity);
        spinner_type = (Spinner)findViewById(R.id.spinner_type);
        spinner_city = (Spinner)findViewById(R.id.spinner_city);
        search_btn = (Button)findViewById(R.id.search_btn);
        search_people = (SearchView)findViewById(R.id.search_people);
        search2_btn=(Button)findViewById(R.id.search2_btn);
        spinner_type.setOnItemSelectedListener(this);
        List<String>categories = new ArrayList<String>();
        categories.add("Pathology Lab");
        categories.add("Ambulance");
        categories.add("Vaikunth Rath");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_type.setAdapter(dataAdapter);
        search2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Search_activity.this,);
                intent.putExtra("data",String.valueOf(spinner_type.getSelectedItem()));
                startActivity(intent);
            }
        });}}

