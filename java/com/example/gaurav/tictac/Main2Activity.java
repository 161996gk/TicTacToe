package com.example.gaurav.tictac;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
    ImageView i1;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        i1=(ImageView)findViewById(R.id.i1);
        i1.setBackgroundResource(R.drawable.animation);
        Thread thread=new Thread(){
            @Override
            public void run() {
                super.run();
                    AnimationDrawable  animationDrawable=(AnimationDrawable)i1.getBackground();
                    animationDrawable.start();
                try {
                    Thread.sleep(2600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                startActivity(new Intent(Main2Activity.this,MainActivity.class));
                finish();
            }
        };
        thread.start();
    }
}
