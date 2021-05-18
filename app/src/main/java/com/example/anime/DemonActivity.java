package com.example.anime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DemonActivity extends AppCompatActivity {
    Button btnVideoDemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demon);

        btnVideoDemon=(Button)findViewById(R.id.btnVideoDemon);

        btnVideoDemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent formvideodemon = new Intent(DemonActivity.this,Demonvideo.class);
                startActivity(formvideodemon);
            }
        });
    }
}