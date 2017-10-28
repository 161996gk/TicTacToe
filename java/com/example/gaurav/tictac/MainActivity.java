package com.example.gaurav.tictac;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer m1,m2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m2=MediaPlayer.create(MainActivity.this,R.raw.s3);
        m1=MediaPlayer.create(MainActivity.this,R.raw.s2);
        m2.setLooping(true);
        m2.start();
        LinearLayout t1=(LinearLayout)findViewById(R.id.t1);
        LinearLayout t2=(LinearLayout)findViewById(R.id.t2);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m2.stop();
                m1.start();
                Intent intent=new Intent(MainActivity.this,Vs.class);
                startActivity(intent);
                finish();
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m2.stop();
                m1.start();
                Intent intent=new Intent(MainActivity.this,Cpu.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        m2.stop();
    }

    @Override
    protected void onStop() {
        super.onStop();
        m2.stop();
    }

    @Override
    protected void onResume() {
        super.onResume();
        m2.start();
    }
}
