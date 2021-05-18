package com.example.anime;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Onevideo extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onevideo);

        videoView= (VideoView) findViewById(R.id.vvOne);
        videoView.setVideoURI(Uri.parse("android.resource://"+ getPackageName()+"/"+R.raw.one));
        MediaController mediaController= new MediaController(this);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}