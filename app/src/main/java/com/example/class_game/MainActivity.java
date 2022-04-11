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
    TextView pix_track,txt_timer, txt_troop1, txt_troop2, txtinfo1, txtinfo2;
    private Toolbar mytopbar;
    Button play, resetbtn;
    TextView piece1,piece2,piece3,piece4,piece5,piece6,piece7,piece8,piece9,piece10,piece11,piece12,piece13,piece14,piece15,piece16,piece17,piece18;
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
        int pos;

        public character(int ty,int a,int d, int h, int p, int t, int ps){
            this.type = ty;
            this.att = a;
            this.def = d;
            this.hp = h;
            this.price = p;
            this.troops = t;
            this.pos = ps;
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
        txt_troop1 = findViewById(R.id.troop_remain1);
        txt_troop2 = findViewById(R.id.troop_remain2);
        txtinfo1 = findViewById(R.id.info1);
        txtinfo2 = findViewById(R.id.info2);
        play = findViewById(R.id.play);
        resetbtn = findViewById(R.id.restartbtn);
        mytopbar = findViewById(R.id.topBar);
        piece1 = findViewById(R.id.btn1);
        piece2 = findViewById(R.id.btn2);
        piece3 = findViewById(R.id.btn3);
        piece4 = findViewById(R.id.btn4);
        piece5 = findViewById(R.id.btn5);
        piece6 = findViewById(R.id.btn6);
        piece7 = findViewById(R.id.btn7);
        piece8 = findViewById(R.id.btn8);
        piece9 = findViewById(R.id.btn9);
        piece10 = findViewById(R.id.btn10);
        piece11 = findViewById(R.id.btn11);
        piece12 = findViewById(R.id.btn12);
        piece13 = findViewById(R.id.btn13);
        piece14 = findViewById(R.id.btn14);
        piece15 = findViewById(R.id.btn15);
        piece16 = findViewById(R.id.btn16);
        piece17 = findViewById(R.id.btn17);
        piece18 = findViewById(R.id.btn18);
        setSupportActionBar(mytopbar);
        createCharacter();
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
                        lose1 = Math.round(((def.att * def.troops) - (att.def * att.troops))/att.hp);
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
                        pix_track.setText("Player 1 lose " + lose1 + " Troops, Player 2 lose " + lose2 + " Troops ");
                    }
                    else{
                        pix_track.setText("Player 2 lose " + lose1 + " Troops, Player 1 lose " + lose2 + " Troops ");
                    }
                    if(S1_1.troops + S2_1.troops + S3_1.troops + M1_1.troops + M2_1.troops + M3_1.troops + T1_1.troops + T2_1.troops + T3_1.troops == 0){
                        pix_track.setText("Player 2 Wins");
                        resetbtn.setVisibility(View.VISIBLE);
                        txt_timer.setVisibility(View.INVISIBLE);

                    }
                    else if(S1_2.troops + S2_2.troops + S3_2.troops + M1_2.troops + M2_2.troops + M3_2.troops + T1_2.troops + T2_2.troops + T3_2.troops == 0){
                        pix_track.setText("Player 1 Wins");
                        resetbtn.setVisibility(View.VISIBLE);
                        txt_timer.setVisibility(View.INVISIBLE);
                    }
                    txt_troop1.setText("Player 1 Troops Remaining: \nS1 = " + S1_1.troops + ";  S2 = " + S2_1.troops + ";  S3 = " + S3_1.troops + "\nM1 = " + M1_1.troops + ";  M2 = " + M2_1.troops + ";  M3 = " + M3_1.troops + " \nT1 = " +T1_1.troops + ";  T2 = " + T2_1.troops + ";  T3 = " + T3_1.troops);
                    txt_troop2.setText("Player 2 Troops Remaining: \nT1 = " +T1_2.troops + ";  T2 = " + T2_2.troops + ";  T3 = " + T3_2.troops + "\nM1 = " + M1_2.troops + ";  M2 = " + M2_2.troops + ";  M3 = " + M3_2.troops + " \nS1 = " + S1_2.troops + ";  S2 = " + S2_2.troops + ";  S3 = " + S3_2.troops);
                    switch (att.pos){
                        case 1:
                            piece1.setText("S1 \n(" + att.troops + ")");
                            break;
                        case 2:
                            piece2.setText("S2 \n(" + att.troops + ")");
                            break;
                        case 3:
                            piece3.setText("S3 \n(" + att.troops + ")");
                            break;
                        case 4:
                            piece4.setText("M1 \n(" + att.troops + ")");
                            break;
                        case 5:
                            piece5.setText("M2 \n(" + att.troops + ")");
                            break;
                        case 6:
                            piece6.setText("M3 \n(" + att.troops + ")");
                            break;
                        case 7:
                            piece7.setText("T1 \n(" + att.troops + ")");
                            break;
                        case 8:
                            piece8.setText("T2 \n(" + att.troops + ")");
                            break;
                        case 9:
                            piece9.setText("T3 \n(" + att.troops + ")");
                            break;
                        case 10:
                            piece10.setText("T1 \n(" + att.troops + ")");
                            break;
                        case 11:
                            piece11.setText("T2 \n(" + att.troops + ")");
                            break;
                        case 12:
                            piece12.setText("T3 \n(" + att.troops + ")");
                            break;
                        case 13:
                            piece13.setText("M1 \n(" + att.troops + ")");
                            break;
                        case 14:
                            piece14.setText("M2 \n(" + att.troops + ")");
                            break;
                        case 15:
                            piece15.setText("M3 \n(" + att.troops + ")");
                            break;
                        case 16:
                            piece16.setText("S1 \n(" + att.troops + ")");
                            break;
                        case 17:
                            piece17.setText("S2 \n(" + att.troops + ")");
                            break;
                        case 18:
                            piece18.setText("S3 \n(" + att.troops + ")");
                            break;
                    }
                    switch (def.pos){
                        case 1:
                            piece1.setText("S1 \n(" + def.troops + ")");
                            break;
                        case 2:
                            piece2.setText("S2 \n(" + def.troops + ")");
                            break;
                        case 3:
                            piece3.setText("S3 \n(" + def.troops + ")");
                            break;
                        case 4:
                            piece4.setText("M1 \n(" + def.troops + ")");
                            break;
                        case 5:
                            piece5.setText("M2 \n(" + def.troops + ")");
                            break;
                        case 6:
                            piece6.setText("M3 \n(" + def.troops + ")");
                            break;
                        case 7:
                            piece7.setText("T1 \n(" + def.troops + ")");
                            break;
                        case 8:
                            piece8.setText("T2 \n(" + def.troops + ")");
                            break;
                        case 9:
                            piece9.setText("T3 \n(" + def.troops + ")");
                            break;
                        case 10:
                            piece10.setText("T1 \n(" + def.troops + ")");
                            break;
                        case 11:
                            piece11.setText("T2 \n(" + def.troops + ")");
                            break;
                        case 12:
                            piece12.setText("T3 \n(" + def.troops + ")");
                            break;
                        case 13:
                            piece13.setText("M1 \n(" + def.troops + ")");
                            break;
                        case 14:
                            piece14.setText("M2 \n(" + def.troops + ")");
                            break;
                        case 15:
                            piece15.setText("M3 \n(" + def.troops + ")");
                            break;
                        case 16:
                            piece16.setText("S1 \n(" + def.troops + ")");
                            break;
                        case 17:
                            piece17.setText("S2 \n(" + def.troops + ")");
                            break;
                        case 18:
                            piece18.setText("S3 \n(" + def.troops + ")");
                            break;
                    }
                    i = 0;
                    if(turn == 1){
                        turn = 2;
                    }
                    else{
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
        txt_troop1.setVisibility(View.VISIBLE);
        txt_troop2.setVisibility(View.VISIBLE);
        txtinfo1.setVisibility(View.INVISIBLE);
        txtinfo2.setVisibility(View.INVISIBLE);
    }

    public void createCharacter(){
        T1_1 = new character(1,35,75,70,100,5,7);
        T2_1 = new character(1,35,75,70,100,5,8);
        T3_1 = new character(1,35,75,70,100,5,9);
        T1_2 = new character(1,35,75,70,100,5,10);
        T2_2 = new character(1,35,75,70,100,5,11);
        T3_2 = new character(1,35,75,70,100,5,12);
        M1_1 = new character(1,35,75,70,100,4,4);
        M2_1 = new character(1,35,75,70,100,4,5);
        M3_1 = new character(1,35,75,70,100,4,6);
        M1_2 = new character(1,35,75,70,100,4,13);
        M2_2 = new character(1,35,75,70,100,4,14);
        M3_2 = new character(1,35,75,70,100,4,15);
        S1_1 = new character(2,90,30,45,130,5,1);
        S2_1 = new character(2,90,30,45,130,5,2);
        S3_1 = new character(2,90,30,45,130,5,3);
        S1_2 = new character(2,90,30,45,130,5,16);
        S2_2 = new character(2,90,30,45,130,5,17);
        S3_2 = new character(2,90,30,45,130,5,18);
        piece1.setText("S1 \n(" + S1_1.troops + ")");
        piece2.setText("S2 \n(" + S2_1.troops + ")");
        piece3.setText("S3 \n(" + S3_1.troops + ")");
        piece4.setText("M1 \n(" + M1_1.troops + ")");
        piece5.setText("M2 \n(" + M2_1.troops + ")");
        piece6.setText("M3 \n(" + M3_1.troops + ")");
        piece7.setText("T1 \n(" + T1_1.troops + ")");
        piece8.setText("T2 \n(" + T2_1.troops + ")");
        piece9.setText("T3 \n(" + T3_1.troops + ")");
        piece10.setText("T1 \n(" + T1_2.troops + ")");
        piece11.setText("T2 \n(" + T2_2.troops + ")");
        piece12.setText("T3 \n(" + T3_2.troops + ")");
        piece13.setText("M1 \n(" + M1_2.troops + ")");
        piece14.setText("M2 \n(" + M2_2.troops + ")");
        piece15.setText("M3 \n(" + M3_2.troops + ")");
        piece16.setText("S1 \n(" + S1_2.troops + ")");
        piece17.setText("S2 \n(" + S2_2.troops + ")");
        piece18.setText("S3 \n(" + S3_2.troops + ")");
    }

    public void resetGame(View v){
        turn=1;
        i=0;
        createCharacter();
        txt_timer.setVisibility(View.VISIBLE);
        resetbtn.setVisibility(View.INVISIBLE);
        txt_timer.setVisibility(View.VISIBLE);
        pix_track.setText("Battle Log");
        txt_troop1.setText("Player 1 Troops Remaining: \nS1 = " + S1_1.troops + ";  S2 = " + S2_1.troops + ";  S3 = " + S3_1.troops + "\nM1 = " + M1_1.troops + ";  M2 = " + M2_1.troops + ";  M3 = " + M3_1.troops + " \nT1 = " +T1_1.troops + ";  T2 = " + T2_1.troops + ";  T3 = " + T3_1.troops);
        txt_troop2.setText("Player 2 Troops Remaining: \nT1 = " +T1_2.troops + ";  T2 = " + T2_2.troops + ";  T3 = " + T3_2.troops + "\nM1 = " + M1_2.troops + ";  M2 = " + M2_2.troops + ";  M3 = " + M3_2.troops + " \nS1 = " + S1_2.troops + ";  S2 = " + S2_2.troops + ";  S3 = " + S3_2.troops);
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
                            txt_timer.setText("Player " + turn + "\n" + i);
                        }
                    });
                }
            }
        };
        new Thread(runnable).start();
    }
}