package com.example.midtermais20210074;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class aisWeb extends AppCompatActivity {

    WebView webViewais;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ais_web);

        webViewais = findViewById(R.id.webViewais);
        webViewais.setWebViewClient(new WebViewClient());
        webViewais.loadUrl("https://ais.ac.nz");
    }
}