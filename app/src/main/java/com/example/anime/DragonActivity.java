package com.example.anime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class DragonActivity extends AppCompatActivity {
    Button btnVideoDragon;
    ImageButton ibPaginaweb;
    TextView txtTexto, txtpagina;
    ImageView ivbaner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dragon);

        ibPaginaweb=(ImageButton)findViewById((R.id.ibPaginaweb)) ;
        btnVideoDragon=(Button)findViewById(R.id.btnVideoDragon);

        btnVideoDragon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent formvideodragon = new Intent(DragonActivity.this,Dragonvideo.class);
                startActivity(formvideodragon);
            }
        });

        ibPaginaweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagina= new Intent(Intent.ACTION_VIEW, Uri.parse("https://dragonball.fandom.com/es/wiki/Dragon_Ball_Wiki_Hispano"));
                startActivity(pagina);
            }
        });
    }
}