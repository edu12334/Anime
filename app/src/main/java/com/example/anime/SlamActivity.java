package com.example.anime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SlamActivity extends AppCompatActivity {
    Button btnVideoSlam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slam);

        btnVideoSlam=(Button)findViewById(R.id.btnVideoSlam);

        btnVideoSlam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent formvideoslam = new Intent(SlamActivity.this,Slamvideo.class);
                startActivity(formvideoslam);
            }
        });
    }
}