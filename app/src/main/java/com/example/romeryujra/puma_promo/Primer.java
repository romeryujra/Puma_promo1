package com.example.romeryujra.puma_promo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Primer extends Activity {
    Intent move;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primer);
        move=new Intent(Primer.this, Menu.class);
        startActivity(move);
    }
}
