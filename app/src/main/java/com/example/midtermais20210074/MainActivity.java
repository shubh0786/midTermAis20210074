package com.example.midtermais20210074;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView txtmyName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, DashPage.class));
                finish();
            }
        }, 4000);

        txtmyName = findViewById(R.id.txtmyName);

        txtmyName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),aisWeb.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Welcome to AIS WEB", Toast.LENGTH_SHORT).show();
            }
        });



    }
}