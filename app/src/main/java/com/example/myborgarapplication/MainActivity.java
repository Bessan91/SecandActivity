package com.example.myborgarapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Animation top, bottom;
    private TextView txt;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        top= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottom=AnimationUtils.loadAnimation(this,R.anim.button_animation);
        txt = findViewById(R.id.textView);
        img = findViewById(R.id.imageView);
        txt.setAnimation(bottom);
        img.setAnimation(top);

        Handler hand=new Handler();
        hand.postDelayed(new Runnable() {
            @Override
            public void run() {
               Intent intent=new Intent(MainActivity.this, MainActivity2.class);
               startActivity(intent);
               finish();

            }

        }, 5000);
        

    }


}