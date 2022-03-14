package com.example.midtermais20210074;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class DashPage extends AppCompatActivity {

    Button btnIT, btnBuss;

    VideoView videoViewAis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_page);


        btnIT = findViewById(R.id.btnIT);
        btnBuss = findViewById(R.id.btnBussi);


        btnBuss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bsintent = new Intent(getApplicationContext(),bussPage.class);
                startActivity(bsintent);

                Toast.makeText(DashPage.this, "Welcome to Business Programme", Toast.LENGTH_SHORT).show();
            }
        });


        btnIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iTintent = new Intent(getApplicationContext(),iTPage.class);
                startActivity(iTintent);

                Toast.makeText(DashPage.this, "Welcome to Ais IT programmes", Toast.LENGTH_SHORT).show();
            }
        });


        VideoView videoViewAis = findViewById(R.id.videoViewAis);
        videoViewAis.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.ais);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoViewAis);
        videoViewAis.setMediaController(mediaController);
    }
}