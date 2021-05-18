package com.example.anime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NarutoActivity extends AppCompatActivity {
    Button btnVideoNaruto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naruto2);

        btnVideoNaruto=(Button)findViewById(R.id.btnVideoNaruto);

        btnVideoNaruto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent formnaruto = new Intent(NarutoActivity.this, Narutovideo.class);
                startActivity(formnaruto);
            }
        });
    }
}