package com.example.midtermais20210074;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bussPage extends AppCompatActivity {

    Button btnBackbs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buss_page);

        btnBackbs = findViewById(R.id.btnBackit);

        btnBackbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBack = new Intent(getApplicationContext(),DashPage.class);
                startActivity(intentBack);

            }
        });
    }
}