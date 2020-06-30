package com.comkct.hospitalappointment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Signup_doctor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_doctor);


        Spinner spinner=(Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
        List&lt;String&gt; categories=new ArrayList&lt;String&gt;();

        categories.add("Multispecialist");
        categories.add("Heart specialist");
        categories.add("Cancer specialist");
    }
}
