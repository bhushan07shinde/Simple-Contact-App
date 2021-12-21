package com.example.explicitimplicitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DataCollection extends AppCompatActivity {

    EditText etDA,etDP,etDW,etDN;
    ImageView btnD1,btnD2,btnD3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collection);

        etDA = findViewById(R.id.etDA);
        etDW = findViewById(R.id.etDW);
        etDP = findViewById(R.id.etDP);
        etDN = findViewById(R.id.etDN);

        btnD1 = findViewById(R.id.btnD1);
        btnD2 = findViewById(R.id.btnD2);
        btnD3 = findViewById(R.id.btnD3);

        btnD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(etDA.getText().toString().isEmpty()||etDN.getText().toString().isEmpty()||etDP.getText().toString().isEmpty()||etDW.getText().toString().isEmpty())
                {
                    Toast.makeText(DataCollection.this, "Please Fill All The Fields", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String name = etDN.getText().toString().trim();
                    String phone = etDP.getText().toString().trim();
                    String web = etDW.getText().toString().trim();
                    String address = etDA.getText().toString().trim();
                    String btn1 = "1";

                    Intent intent = new Intent();
                    intent.putExtra("name",name);
                    intent.putExtra("phone",phone);
                    intent.putExtra("web",web);
                    intent.putExtra("address",address);
                    intent.putExtra("2",btn1);
                    setResult(RESULT_OK,intent);
                    DataCollection.this.finish();
                }
                
            }
        });

        btnD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etDA.getText().toString().isEmpty()||etDN.getText().toString().isEmpty()||etDP.getText().toString().isEmpty()||etDW.getText().toString().isEmpty())
                {
                    Toast.makeText(DataCollection.this, "Please Fill All The Fields", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String name = etDN.getText().toString().trim();
                    String phone = etDP.getText().toString().trim();
                    String web = etDW.getText().toString().trim();
                    String address = etDA.getText().toString().trim();
                    String btn2 = "2";

                    Intent intent = new Intent();
                    intent.putExtra("name",name);
                    intent.putExtra("phone",phone);
                    intent.putExtra("web",web);
                    intent.putExtra("address",address);
                    intent.putExtra("2",btn2);
                    setResult(RESULT_OK,intent);
                    DataCollection.this.finish();
                }

            }
        });

        btnD3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(etDA.getText().toString().isEmpty()||etDN.getText().toString().isEmpty()||etDP.getText().toString().isEmpty()||etDW.getText().toString().isEmpty())
                {
                    Toast.makeText(DataCollection.this, "Please Fill All The Fields", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String name = etDN.getText().toString().trim();
                    String phone = etDP.getText().toString().trim();
                    String web = etDW.getText().toString().trim();
                    String address = etDA.getText().toString().trim();
                    String btn3 = "3";

                    Intent intent = new Intent();
                    intent.putExtra("name",name);
                    intent.putExtra("phone",phone);
                    intent.putExtra("web",web);
                    intent.putExtra("address",address);
                    intent.putExtra("2",btn3);
                    setResult(RESULT_OK,intent);
                    DataCollection.this.finish();
                }

            }
        });


    }
}