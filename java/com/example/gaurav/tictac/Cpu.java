package com.example.gaurav.tictac;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Cpu extends AppCompatActivity implements  View.OnClickListener {
    int p=0;
    int [][] a=new int[][]{{2,2,2},{2,2,2},{2,2,2}};
    int i,j;
    int p11,p21,p12,p22;
    int img[]={R.drawable.x,R.drawable.o};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpu);
        TextView t1=(TextView)findViewById(R.id.t1);
        t1.setText("Player Turns");
        Button b1=(Button)findViewById(R.id.b1);
        ImageView img1=(ImageView)findViewById(R.id.img1);
        ImageView img2=(ImageView)findViewById(R.id.img2);
        ImageView img3=(ImageView)findViewById(R.id.img3);
        ImageView img4=(ImageView)findViewById(R.id.img4);
        ImageView img5=(ImageView)findViewById(R.id.img5);
        ImageView img6=(ImageView)findViewById(R.id.img6);
        ImageView img7=(ImageView)findViewById(R.id.img7);
        ImageView img8=(ImageView)findViewById(R.id.img8);
        ImageView img9=(ImageView)findViewById(R.id.img9);
        b1.setOnClickListener(this);
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
        img7.setOnClickListener(this);
        img8.setOnClickListener(this);
        img9.setOnClickListener(this);

    }
    void checkWin() {
        Intent intent=new Intent(Cpu.this,MainActivity.class);
        TextView t1=(TextView)findViewById(R.id.t1);
        for (i = 0; i < 3; i++) {
            p11 = 0;
            p21 = 0;
            p12 = 0;
            p22 = 0;
            for (j = 0; j < 3; j++) {
                if (a[i][j] == 0)
                    p11++;
                if (a[i][j] == 1)
                    p21++;
                if (a[j][i] == 0)
                    p12++;
                if (a[j][i] == 1)
                    p22++;
            }
            if (p11 == 3 || p12 == 3 || p21 == 3 || p22 == 3)
                break;
        }
        if (a[0][0] == 0 && a[1][1] == 0 && a[2][2] == 0) {
            Toast.makeText(Cpu.this,"Player wins",Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();
        } else if (a[0][0] == 1 && a[1][1] == 1 && a[2][2] == 1) {
            Toast.makeText(Cpu.this,"CPU wins",Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();
        }else if (a[0][2] == 0 && a[1][1] == 0 && a[2][0] == 0) {
            Toast.makeText(Cpu.this,"Player wins",Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();
        }else if (a[0][2]== 1 && a[1][1] == 1 && a[2][0] == 1) {
            Toast.makeText(Cpu.this,"CPU wins",Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();
        } else if (p11 == 3 || p12 == 3) {
            Toast.makeText(Cpu.this,"Player wins",Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();
        } else if (p21 == 3 || p22 == 3) {
            Toast.makeText(Cpu.this,"CPU wins",Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();
        } else {
            if (a[0][0] != 2 && a[0][1] != 2 && a[0][2] != 2 && a[1][0] != 2 && a[1][1] != 2 && a[1][2] != 2 && a[2][0] != 2 && a[2][1] != 2 && a[2][2] != 2 )
            {  Toast.makeText(Cpu.this,"No One wins",Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();}
        }
    }
    void perform() {
        ImageView img1 = (ImageView) findViewById(R.id.img1);
        ImageView img2 = (ImageView) findViewById(R.id.img2);
        ImageView img3 = (ImageView) findViewById(R.id.img3);
        ImageView img4 = (ImageView) findViewById(R.id.img4);
        ImageView img5 = (ImageView) findViewById(R.id.img5);
        ImageView img6 = (ImageView) findViewById(R.id.img6);
        ImageView img7 = (ImageView) findViewById(R.id.img7);
        ImageView img8 = (ImageView) findViewById(R.id.img8);
        ImageView img9 = (ImageView) findViewById(R.id.img9);
        Random rand = new Random();
        char ch = 'n';
        while (ch == 'n') {
            int n = rand.nextInt(10);
            switch (n) {
                case 1:
                    if (a[0][0] == 2) {
                        img1.performClick();
                        ch = 'y';
                    } else {
                        ch = 'n';
                    }
                    break;
                case 2:
                    if (a[0][1] == 2) {
                        img2.performClick();
                        ch = 'y';
                    } else {
                        ch = 'n';
                    }
                    break;
                case 3:
                    if (a[0][2] == 2) {
                        img3.performClick();
                        ch = 'y';
                    } else {
                        ch = 'n';
                    }
                    break;
                case 4:
                    if (a[1][0] == 2) {
                        img4.performClick();
                        ch = 'y';
                    } else {
                        ch = 'n';
                    }
                    break;
                case 5:
                    if (a[1][1] == 2) {
                        img5.performClick();
                        ch = 'y';
                    } else {
                        ch = 'n';
                    }
                    break;
                case 6:
                    if (a[0][2] == 2) {
                        img6.performClick();
                        ch = 'y';
                    } else {
                        ch = 'n';
                    }
                    break;
                case 7:
                    if (a[2][0] == 2) {
                        img7.performClick();
                        ch = 'y';
                    } else {
                        ch = 'n';
                    }
                    break;
                case 8:
                    if (a[2][1] == 2) {
                        img8.performClick();
                        ch = 'y';
                    } else {
                        ch = 'n';
                    }
                    break;
                case 9:
                    if (a[2][2] == 2) {
                        img9.performClick();
                        ch = 'y';
                    } else {
                        ch = 'n';
                    }
                    break;
                default:
                    ch = 'n';
            }
        }
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        MediaPlayer m1=MediaPlayer.create(Cpu.this,R.raw.s1);
        TextView t1=(TextView)findViewById(R.id.t1);
        switch(id)
        {
            case R.id.b1:
                t1.setText("New Game");
                p=0;
                Intent intent=new Intent(Cpu.this,Cpu.class);
                startActivity(intent);
                finish();
                break;
            case R.id.img1:
                final ImageView img1=(ImageView)findViewById(R.id.img1);
                m1.start();
                img1.setImageResource(img[p]);
                img1.setEnabled(false);
                a[0][0]=p;
                checkWin();
                if(p==0) {
                    p = 1;
                    t1.setText("CPU Turns");
                    perform();
                }
                else{
                    p=0;
                    t1.setText("Player Turns");}
                break;
            case R.id.img2:
                final ImageView img2=(ImageView)findViewById(R.id.img2);
                m1.start();
                img2.setImageResource(img[p]);
                img2.setEnabled(false);
                a[0][1]=p;
                checkWin();
                if(p==0){
                    p=1;
                    t1.setText("CPU Turns");
                    perform();}
                else{
                    p=0;
                    t1.setText("Player Turns");}
                break;
            case R.id.img3:
                final ImageView img3=(ImageView)findViewById(R.id.img3);
                m1.start();
                img3.setImageResource(img[p]);
                img3.setEnabled(false);
                a[0][2]=p;
                checkWin();
                if(p==0){
                    p=1;
                    t1.setText("CPU Turns");
                    perform();}
                else{
                    p=0;
                    t1.setText("Player Turns");}
                break;
            case R.id.img4:
                final ImageView img4=(ImageView)findViewById(R.id.img4);
                m1.start();
                img4.setImageResource(img[p]);
                img4.setEnabled(false);
                a[1][0]=p;
                checkWin();
                if(p==0){
                    p=1;
                    t1.setText("CPU Turns");
                    perform();}
                else{
                    p=0;
                    t1.setText("Player Turns");}
                break;
            case R.id.img5:
                final ImageView img5=(ImageView)findViewById(R.id.img5);
                m1.start();
                img5.setImageResource(img[p]);
                img5.setEnabled(false);
                a[1][1]=p;
                checkWin();
                if(p==0){
                    p=1;
                    t1.setText("CPU Turns");
                    perform();}
                else{
                    p=0;
                    t1.setText("Player Turns");}
                break;
            case R.id.img6:
                final ImageView img6=(ImageView)findViewById(R.id.img6);
                m1.start();
                img6.setImageResource(img[p]);
                img6.setEnabled(false);
                a[1][2]=p;
                checkWin();
                if(p==0){
                    p=1;
                    t1.setText("CPU Turns");
                    perform();}
                else{
                    p=0;
                    t1.setText("Player Turns");}
                break;
            case R.id.img7:
                final ImageView img7=(ImageView)findViewById(R.id.img7);
                m1.start();
                img7.setImageResource(img[p]);
                img7.setEnabled(false);
                a[2][0]=p;
                checkWin();
                if(p==0){
                    p=1;
                    t1.setText("CPU Turns");
                    perform();}
                else{
                    p=0;
                    t1.setText("Player Turns");}
                break;
            case R.id.img8:
                final ImageView img8=(ImageView)findViewById(R.id.img8);
                m1.start();
                img8.setImageResource(img[p]);
                img8.setEnabled(false);
                a[2][1]=p;
                checkWin();
                if(p==0){
                    p=1;
                    t1.setText("CPU Turns");
                    perform();}
                else{
                    p=0;
                    t1.setText("Player Turns");}
                break;
            case R.id.img9:
                final ImageView img9=(ImageView)findViewById(R.id.img9);
                m1.start();
                img9.setImageResource(img[p]);
                img9.setEnabled(false);
                a[2][2]=p;
                checkWin();
                if(p==0){
                    p=1;
                    t1.setText("CPU Turns");
                    perform();}
                else{
                    p=0;
                    t1.setText("Player Turns");}
                break;
        }
    }
}
