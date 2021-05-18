package com.example.aplicacion_redireccionamiento_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton facebook,instagram,youtube,chrome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        facebook=findViewById(R.id.btnFacebook);
        instagram=findViewById(R.id.btnInstagram);
        youtube=findViewById(R.id.btnYoutube);
        chrome=findViewById(R.id.btnChrome);

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facebook=getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
                startActivity(facebook);
            }
        });

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent instagram=getPackageManager().getLaunchIntentForPackage("com.instagram.android");
                startActivity(instagram);
            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent youtube=getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
                startActivity(youtube);
            }
        });
        chrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri google = Uri.parse("http://www.google.com");
                Intent intent=new Intent(Intent.ACTION_VIEW,google);
                startActivity(intent);
            }
        });
    }
}