package com.comkct.hospitalappointment;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fileupload extends AppCompatActivity implements View.OnClickListener {


    private static final int PICK_IMAGE_REQUEST = 234;
    private Button btndegimg,btndegupload;
    private Uri filepath;
    private StorageReference storageReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fileupload);
        storageReference = FirebaseStorage.getInstance().getReference();
        btndegimg = (Button)findViewById(R.id.btndegimg);
        btndegupload = (Button)findViewById(R.id.btndegupload);

        btndegimg.setOnClickListener(this);
        btndegupload.setOnClickListener(this);
    }
    private void uploadFile(){

    if(filepath !=null){
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Uploading...");
        progressDialog.show();








    }else{


    }



    }
    private void showFilechooser(){

        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent,"Select an Image"),PICK_IMAGE_REQUEST);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data !=null && data.getData() !=null){
        filepath = data.getData();
        }
    }

    @Override
    public void onClick(View view) {

        if (view == btndegimg){

            showFilechooser();

    }else if(view == btndegupload){
        }
    }
}
