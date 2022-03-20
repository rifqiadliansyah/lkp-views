package com.example.lkpviews;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnBeliTiket,btnCuplikan;
    ImageButton btnGambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("NetCinema 21");
        btnBeliTiket =findViewById(R.id.btn_beli_tiket);
        btnCuplikan = findViewById(R.id.btn_cuplikan);
        btnGambar = findViewById(R.id.btnimg_bat);


        btnBeliTiket.setOnClickListener(this);
        btnCuplikan.setOnClickListener(this);
        btnGambar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;
        if(view.getId()==R.id.btn_beli_tiket){
            i = new Intent(this, BayarActivity.class);
            startActivity(i);
        }
        if(view.getId()==R.id.btn_cuplikan || view.getId()==R.id.btnimg_bat){
            i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=4mXF10vHmmQ"));
            startActivity(i);
        }

    }

}