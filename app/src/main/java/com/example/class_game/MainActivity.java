package com.example.class_game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView pix_track,txt_timer,txt_timer2, txt_troop1, txt_troop2;
    private Toolbar mytopbar;
    Button play;
    int turn = 1, i = 0;
    character att = null,def = null;
    character S1_1,S2_1,S3_1,S1_2,S2_2,S3_2;
    character M1_1,M2_1,M3_1,M1_2,M2_2,M3_2;
    character T1_1,T2_1,T3_1,T1_2,T2_2,T3_2;
    public class character{
        int type;
        int att;
        int def;
        int hp;
        int price;
        int troops;

        public character(int ty,int a,int d, int h, int p, int t){
            this.type = ty;
            this.att = a;
            this.def = d;
            this.hp = h;
            this.price = p;
            this.troops = t;
        }

        public void setAtt(int att) {
            this.att = att;
        }

        public void setDef(int def) {
            this.def = def;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void setTroops(int troops) {
            this.troops = troops;
        }

        public void setType(int type) {
            this.type = type;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pix_track = findViewById(R.id.pixel_tracker);
        txt_timer = findViewById(R.id.timer);
        txt_timer2 = findViewById(R.id.timer2);
        txt_troop1 = findViewById(R.id.troop_remain1);
        txt_troop2 = findViewById(R.id.troop_remain2);
        play = findViewById(R.id.play);
        mytopbar = findViewById(R.id.topBar);
        setSupportActionBar(mytopbar);
        T1_1 = new character(1,35,75,70,100,10);
        T2_1 = new character(1,35,75,70,100,10);
        T3_1 = new character(1,35,75,70,100,10);
        T1_2 = new character(1,35,75,70,100,10);
        T2_2 = new character(1,35,75,70,100,10);
        T3_2 = new character(1,35,75,70,100,10);
        M1_1 = new character(1,35,75,70,100,7);
        M2_1 = new character(1,35,75,70,100,7);
        M3_1 = new character(1,35,75,70,100,7);
        M1_2 = new character(1,35,75,70,100,7);
        M2_2 = new character(1,35,75,70,100,7);
        M3_2 = new character(1,35,75,70,100,7);
        S1_1 = new character(2,90,30,45,130,7);
        S2_1 = new character(2,90,30,45,130,7);
        S3_1 = new character(2,90,30,45,130,7);
        S1_2 = new character(2,90,30,45,130,7);
        S2_2 = new character(2,90,30,45,130,7);
        S3_2 = new character(2,90,30,45,130,7);
        pix_track.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int x = (int)motionEvent.getX();
                int y = (int)motionEvent.getY();
                if(y > 770 && y < 1304)
                {
                    pix_track.setText("This is blank space");
                }
                else if(x <= 358 && y >= 183){
                    if(y <= 386){
                        if(turn==2&att!=null){
                            def = S1_1;
                        }
                        else{
                            att = S1_1;
                        }
                    }
                    else if(y <= 578){
                        if(turn==2&att!=null){
                            def = M1_1;
                        }
                        else{
                            att = M1_1;
                        }
                    }
                    else if(y <= 770){
                        if(turn==2&att!=null){
                            def = T1_1;
                        }
                        else{
                            att = T1_1;
                        }
                    }
                    else if(y <= 1496){
                        if(turn==1&att!=null){
                            def = T1_2;
                        }
                        else{
                            att = T1_2;
                        }
                    }
                    else if(y <= 1688){
                        if(turn==1&att!=null){
                            def = M1_2;
                        }
                        else{
                            att = M1_2;
                        }
                    }
                    else if(y <= 1880){
                        if(turn==1&att!=null){
                            def = S1_2;
                        }
                        else{
                            att = S1_2;
                        }
                    }
                }
                else if(x <= 720 && y >= 183){
                    if( y <= 386){
                        if(turn==2&att!=null){
                            def = S2_1;
                        }
                        else{
                            att = S2_1;
                        }
                    }
                    else if(y <= 578){
                        if(turn==2&att!=null){
                            def = M2_1;
                        }
                        else{
                            att = M2_1;
                        }
                    }
                    else if(y <= 770){
                        if(turn==2&att!=null){
                            def = T2_1;
                        }
                        else{
                            att = T2_1;
                        }
                    }
                    else if(y <= 1496){
                        if(turn==1&att!=null){
                            def = T2_2;
                        }
                        else{
                            att = T2_2;
                        }
                    }
                    else if(y <= 1688){
                        if(turn==1&att!=null){
                            def = M2_2;
                        }
                        else{
                            att = M2_2;
                        }
                    }
                    else if(y <= 1880){
                        if(turn==1&att!=null){
                            def = S2_2;
                        }
                        else{
                            att = S2_2;
                        }
                    }
                }
                else if(x <= 1082 && y>=183){
                    if(y <= 386){
                        if(turn==2&att!=null){
                            def = S3_1;
                        }
                        else{
                            att = S3_1;
                        }
                    }
                    else if(y <= 578){
                        if(turn==2&att!=null){
                            def = M3_1;
                        }
                        else{
                            att = M3_1;
                        }
                    }
                    else if(y <= 770){
                        if(turn==2&att!=null){
                            def = T3_1;
                        }
                        else{
                            att = T3_1;
                        }
                    }
                    else if(y <= 1496){
                        if(turn==1&att!=null){
                            def = T3_2;
                        }
                        else{
                            att = T3_2;
                        }
                    }
                    else if(y <= 1688){
                        if(turn==1&att!=null){
                            def = M3_2;
                        }
                        else{
                            att = M3_2;
                        }
                    }
                    else if(y <= 1880){
                        if(turn==1&att!=null){
                            def = S3_2;
                        }
                        else{
                            att = S3_2;
                        }
                    }
                }
                else{
                    pix_track.setText("tehe error");
                }
                if(att!=null && def!=null){
                    int lose1 = 0, lose2 = 0;
                    double lose22 = ((att.att * att.troops) - (def.def * def.troops))/def.hp;
                    lose2 = (int)lose22;
                    if(lose2 < 0){
                        lose2 = 0;
                    }
                    else if(lose2 > def.troops){
                        lose2 = def.troops;
                    }
                    def.troops = def.troops - lose2;
                    if(def.troops < 0){
                        def.troops = 0;
                    }
                    if((def.troops > 0) &&!(att.type == 2 && def.type == 1)){
                        lose1 = Math.round((def.att * def.troops)/att.hp);
                        if(lose1 < 0){
                            lose1 = 0;
                        }
                        else if(lose1 > att.troops){
                            lose1 = att.troops;
                        }
                        att.troops = att.troops - lose1;
                        if(att.troops < 0){
                            att.troops = 0;
                        }
                    }
                    if(turn == 1){
                        pix_track.setText("Player 1 lose " + lose1 + " Troops, while player 2 lose " + lose2 + " Troops ");
                    }
                    else{
                        pix_track.setText("Player 2 lose " + lose1 + " Troops, while player 1 lose " + lose2 + " Troops ");
                    }
                    if(S1_1.troops + S2_1.troops + S3_1.troops + M1_1.troops + M2_1.troops + M3_1.troops + T1_1.troops + T2_1.troops + T3_1.troops == 0){
                        pix_track.setText("Player 2 Wins");
                    }
                    else if(S1_2.troops + S2_2.troops + S3_2.troops + M1_2.troops + M2_2.troops + M3_2.troops + T1_2.troops + T2_2.troops + T3_2.troops == 0){
                        pix_track.setText("Player 1 Wins");
                    }
                    txt_troop1.setText("Player 1 Troops Remaining: \nS1 = " + S1_1.troops + ";  S2 = " + S2_1.troops + ";  S3 = " + S3_1.troops + "\nM1 = " + M1_1.troops + ";  M2 = " + M2_1.troops + ";  M3 = " + M3_1.troops + " \nT1 = " +T1_1.troops + ";  T2 = " + T2_1.troops + ";  T3 = " + T3_1.troops);
                    txt_troop2.setText("Player 2 Troops Remaining: \nT1 = " +T1_2.troops + ";  T2 = " + T2_2.troops + ";  T3 = " + T3_2.troops + "\nM1 = " + M1_2.troops + ";  M2 = " + M2_2.troops + ";  M3 = " + M3_2.troops + " \nS1 = " + S1_2.troops + ";  S2 = " + S2_2.troops + ";  S3 = " + S3_2.troops);
                    i = 0;
                    if(turn == 1){
                        txt_timer.setText("Player 1 : 0");
                        turn = 2;
                    }
                    else{
                        txt_timer2.setText("Player 2 : 0");
                        turn = 1;
                    }
                    att = null;
                    def = null;
                }
                return true;
            }
        });
    }

    public void play(View v){
        start_timer();
        play.setVisibility(View.INVISIBLE);
        pix_track.setVisibility(View.VISIBLE);
        txt_timer.setVisibility(View.VISIBLE);
        txt_timer2.setVisibility(View.VISIBLE);
        txt_troop1.setVisibility(View.VISIBLE);
        txt_troop2.setVisibility(View.VISIBLE);
    }
    public void start_timer(){
        boolean t = true;
        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            public void run(){
                while(t){
                    if(i >= 15){
                        if(turn == 1){
                            turn = 2;
                        }
                        else{
                            turn = 1;
                        }
                        i = 0;
                        att = null;
                        def = null;
                    }
                    try{
                        i++;
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            if(turn == 1){
                                txt_timer.setText("Player 1 : " + i);
                            }
                            else if(turn == 2){
                                txt_timer2.setText("Player 2 : " + i);
                            }
                        }
                    });
                }
            }
        };
        new Thread(runnable).start();
    }
}