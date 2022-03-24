package com.example.class_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

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
    }
}