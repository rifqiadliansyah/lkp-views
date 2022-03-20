package com.example.lkpviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class BayarActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtjumlahTiket;
    RadioButton rbBiasa,rbVIP,rbSVIP;
    Button btnBayar;
    TextView edttotHarga;
    ImageButton imgBtnPlus;
    int startVal = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bayar);
        getSupportActionBar().setTitle("NetCinema 21");
        edtjumlahTiket = findViewById(R.id.edt_jumlahtiket);
        edttotHarga = findViewById(R.id.edt_totHarga);
        rbBiasa = findViewById(R.id.rb_biasa);
        rbVIP = findViewById(R.id.rb_vip);
        rbSVIP=findViewById(R.id.rb_svip);
        btnBayar = findViewById(R.id.btn_bayar);
        imgBtnPlus = findViewById(R.id.img_btn_plus);

        edtjumlahTiket.setOnClickListener(this);
        edttotHarga.setOnClickListener(this);
        rbBiasa.setOnClickListener(this);
        rbVIP.setOnClickListener(this);
        rbSVIP.setOnClickListener(this);
        btnBayar.setOnClickListener(this);
        imgBtnPlus.setOnClickListener(this);

        edtjumlahTiket.setText(String.valueOf(startVal));
    }

    @Override
    public void onClick(View view) {
        if(edtjumlahTiket.getText().toString().equals("0")){
            edtjumlahTiket.setText(String.valueOf(startVal));
        }
        if(view.getId()==R.id.img_btn_plus){
            int add = Integer.valueOf(edtjumlahTiket.getText().toString().trim());
            int plus = add + 1;
            edtjumlahTiket.setText(String.valueOf(plus));
        }
        int jml = Integer.valueOf(edtjumlahTiket.getText().toString().trim());

        if(view.getId()==R.id.rb_biasa){
            int hargaBiasa = 50000;
            int hargaTotal = hargaBiasa *jml;
            edttotHarga.setText("Harga Total = Rp."+(hargaTotal));
        }
        if(view.getId()==R.id.rb_vip){
            int hargaVIP = 70000;
            int hargaTotal = hargaVIP *jml;
            edttotHarga.setText("Harga Total = Rp."+(hargaTotal));
        }
         if(view.getId()==R.id.rb_svip){
            int hargaSVIP = 80000;
            int hargaTotal = hargaSVIP *jml;
            edttotHarga.setText("Harga Total = Rp."+(hargaTotal));
        }
         if(!TextUtils.isEmpty(edttotHarga.getText().toString())){
            if(view.getId()==R.id.btn_bayar){
                Toast.makeText(btnBayar.getContext(), "Tiket berhasil dibeli, Silahkan tunggu",
                     Toast.LENGTH_SHORT).show();
                 }
         }
    }
}