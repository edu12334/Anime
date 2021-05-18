package com.example.anime;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.GenericLifecycleObserver;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class Splash1 extends AppCompatActivity {
    public static final long SPLASH_SCREEN_DELAY = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash1);

        TimerTask time= new TimerTask() {
            @Override
            public void run() {
                Intent intent=new Intent().setClass(Splash1.this, Splash2.class);
                startActivity(intent);
                finish();
            }
        };
        //se ejecurata una vez cerrado
        Timer timer = new Timer();
        timer.schedule(time,SPLASH_SCREEN_DELAY);

    }

}