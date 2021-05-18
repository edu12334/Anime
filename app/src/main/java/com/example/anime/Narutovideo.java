package com.example.anime;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Narutovideo extends AppCompatActivity {
    VideoView videoView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_narutovideo);

        videoView= (VideoView) findViewById(R.id.vvNaruto);
        videoView.setVideoURI(Uri.parse("android.resource://"+ getPackageName()+"/"+R.raw.naruto));
        MediaController mediaController= new MediaController(this);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}