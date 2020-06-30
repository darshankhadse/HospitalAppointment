package com.comkct.hospitalappointment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class demo extends AppCompatActivity {
    CheckBox checkamb;
    TextView textamb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);


        checkamb = (CheckBox)findViewById(R.id.checkambl);
        textamb = (TextView)findViewById(R.id.textambl);
        checkamb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {

                if (b){
                    textamb.setVisibility(View.VISIBLE);
                }else {
                    textamb.setVisibility(View.INVISIBLE);
                }

            }
        });

            }

    }

