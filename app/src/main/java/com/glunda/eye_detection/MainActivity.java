package com.glunda.eye_detection;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.pd.lookatme.LookAtMe;

public class MainActivity extends AppCompatActivity {

    LookAtMe lookAtMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        lookAtMe = findViewById(R.id.lookme);
        lookAtMe.init(this);
        lookAtMe.setVideoPath("https://pixabay.com/videos/christmas-holiday-background-100286/");
       // lookAtMe.setVideoURI(Uri.parse("android.resource://"+ getPackageName() + "/" +R.raw.video));

        lookAtMe.start();
        lookAtMe.setLookMe();
    }
}