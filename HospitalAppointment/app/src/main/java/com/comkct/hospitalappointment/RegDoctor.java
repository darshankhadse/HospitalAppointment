package com.comkct.hospitalappointment;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputLayout;

public class RegDoctor extends AppCompatActivity implements AdapterView.OnItemSelectedListener,View.OnClickListener{

    String[] speciality={"Multispecialist","Cancer Specialist","Heart Specialist"};
    private static final int PICK_IMAGE_REQUEST = 234;
    private Uri filePath;
    private StorageRe
    TextInputLayout tvname,tvcontact,tvaddress;
    ImageView profilepic;
    Spinner spinspecialist,spinexp,spinedu;
    private Button btn_degreeimg,btn_uploaddeg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regdoctor);

        tvname = (TextInputLayout) findViewById(R.id.tvname);
        tvcontact = (TextInputLayout) findViewById(R.id.tvcontact);
        tvaddress = (TextInputLayout) findViewById(R.id.tvaddress);
        profilepic = (ImageView) findViewById(R.id.profilepic);
        spinspecialist = (Spinner) findViewById(R.id.spinspecialist);
        spinexp = (Spinner) findViewById(R.id.spinexp);
        spinedu = (Spinner) findViewById(R.id.spinedu);

        btn_degreeimg = (Button)findViewById(R.id.btn_degreeimg);
        btn_uploaddeg = (Button)findViewById(R.id.btn_uploaddeg);

        btn_degreeimg.setOnClickListener(this);
        btn_uploaddeg.setOnClickListener(this);

        spinspecialist.setOnItemSelectedListener(this);
        spinexp.setOnItemSelectedListener(this);
        spinedu.setOnItemSelectedListener(this);

        ArrayAdapter aa1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, speciality);
        aa1.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinspecialist.setAdapter(aa1);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    private void showFileChooser(){
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent,"Select an Image"),PICK_IMAGE_REQUEST);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data !=null && data.getData() !=null){

            filePath = data.getData();
        }
    }

    @Override
    public void onClick(View view) {
        if (view == btn_degreeimg){

            //openfilechooser
        showFileChooser();

    }else if(view == btn_uploaddeg){

            //upload

        }
}
}
