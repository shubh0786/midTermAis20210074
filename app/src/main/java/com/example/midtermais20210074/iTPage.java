package com.example.midtermais20210074;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class iTPage extends AppCompatActivity {

    Button btnBackIT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itpage);

        btnBackIT = findViewById(R.id.btnBackit);

        btnBackIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBack = new Intent(getApplicationContext(),DashPage.class);
                startActivity(intentBack);

            }
        });
    }
}