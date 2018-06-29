package com.example.ayanbadejo.quizapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        int SPLASH_TIME_OUT = 4000;
        new Handler ().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent HomeIntent  = new Intent(MainActivity.this, QuizQuestions.class );
                startActivity(HomeIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
