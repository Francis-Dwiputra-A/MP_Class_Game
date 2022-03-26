package com.example.class_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView pix_track,txt_timer;
    Button play;
    public class character {
        int att_melee, att_ranged, def_melee, def_ranged;
        public character(int att_m, int att_r, int def_m, int def_r){
            this.att_melee = att_m;
            this.att_ranged = att_r;
            this.def_melee = def_m;
            this.def_ranged = def_r;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pix_track = findViewById(R.id.pixel_tracker);
        txt_timer = findViewById(R.id.timer);
        play = findViewById(R.id.play);
        pix_track.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int x = (int)motionEvent.getX();
                int y = (int)motionEvent.getY();
                if(y > 770 && y < 1150)
                {
                    pix_track.setText("This is blank space");
                }
                else if(x <= 358){
                    if(y >= 194 && y <= 386){
                        pix_track.setText("This is top S1");
                    }
                    else if(y <= 578){
                        pix_track.setText("This is top M1");
                    }
                    else if(y <= 770){
                        pix_track.setText("This is top T1");
                    }
                    else if(y <= 1342){
                        pix_track.setText("This is bottom T1");
                    }
                    else if(y <= 1534){
                        pix_track.setText("This is bottom M1");
                    }
                    else if(y <= 1726){
                        pix_track.setText("This is bottom S1");
                    }
                }
                else if(x <= 720){
                    if(y >= 194 && y <= 386){
                        pix_track.setText("This is top S2");
                    }
                    else if(y <= 578){
                        pix_track.setText("This is top M2");
                    }
                    else if(y <= 770){
                        pix_track.setText("This is top T2");
                    }
                    else if(y <= 1342){
                        pix_track.setText("This is bottom T2");
                    }
                    else if(y <= 1534){
                        pix_track.setText("This is bottom M2");
                    }
                    else if(y <= 1726){
                        pix_track.setText("This is bottom S2");
                    }
                }
                else if(x <= 1082){
                    if(y >= 194 && y <= 386){
                        pix_track.setText("This is top S3");
                    }
                    else if(y <= 578){
                        pix_track.setText("This is top M3");
                    }
                    else if(y <= 770){
                        pix_track.setText("This is top T3");
                    }
                    else if(y <= 1342){
                        pix_track.setText("This is bottom T3");
                    }
                    else if(y <= 1534){
                        pix_track.setText("This is bottom M3");
                    }
                    else if(y <= 1726){
                        pix_track.setText("This is bottom S3");
                    }
                }
                else{
                    pix_track.setText("tehe error");
                }
                return true;
            }
        });
    }

    public void play(View v){
        start_timer();
        play.setVisibility(View.INVISIBLE);
    }
    public void start_timer(){
        boolean t = true;
        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            public void run(){
                int i = 0;
                while(t){
                    if(i >= 10){
                        i = 0;
                    }
                    try{
                        i++;
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    int finalI = i;
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            txt_timer.setText(""+ finalI);
                        }
                    });
                }
            }
        };
        new Thread(runnable).start();
    }
}