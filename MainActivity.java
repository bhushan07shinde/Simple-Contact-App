package com.example.explicitimplicitapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnM;
    ImageView call,web,loc,changeIMG;
    TextView tvnm;
    final int NEXTACT = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnM = findViewById(R.id.btnM);
        call = findViewById(R.id.call);
        web = findViewById(R.id.web);
        loc = findViewById(R.id.loc);
        tvnm = findViewById(R.id.tvnm);
        changeIMG = findViewById(R.id.changeIMG);


        call.setVisibility(View.GONE);
        web.setVisibility(View.GONE);
        loc.setVisibility(View.GONE);
        changeIMG.setVisibility(View.GONE);


        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,com.example.explicitimplicitapp.DataCollection.class);
                startActivityForResult(intent,NEXTACT);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        call.setVisibility(View.VISIBLE);
        web.setVisibility(View.VISIBLE);
        loc.setVisibility(View.VISIBLE);
        changeIMG.setVisibility(View.VISIBLE);
        if(requestCode==NEXTACT)
        {

            if(resultCode==RESULT_OK)
            {
                tvnm.setText(data.getStringExtra("name"));
                if(data.getStringExtra("2").equals("2"))
                {
                    changeIMG.setImageResource(R.drawable.ic_baseline_sentiment_satisfied_24);
                }
               else if(data.getStringExtra("2").equals("3"))
                {
                    changeIMG.setImageResource(R.drawable.ic_baseline_tag_faces_24);
                }

                else if(data.getStringExtra("2").equals("1"))
                {
                    changeIMG.setImageResource(R.drawable.ic_baseline_mood_bad_24);
                }

//



                call.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String phone = "tel:"+data.getStringExtra("phone");
                        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(phone));
                        startActivity(intent);
                    }
                });

                web.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String web = "http://"+data.getStringExtra("web");
                        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(web));
                        startActivity(intent);
                    }
                });

                loc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "geo:0,0?q="+data.getStringExtra("address");
                        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(address));
                        startActivity(intent);
                    }
                });
            }
        }
    }
}