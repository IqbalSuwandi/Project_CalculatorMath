package com.example.a1911501219_aplikasimatematika_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class JajarGenjangActivity extends AppCompatActivity {
    EditText alas,tinggi;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajar_genjang);
        alas = findViewById(R.id.alas);
        tinggi = findViewById(R.id.tinggi);
        hasil = findViewById(R.id.texthasil);

    }

    public void tombolhitung(View view){
        String inputalas = alas.getText().toString();
        String inputtinggi = tinggi.getText().toString();

        if(TextUtils.isEmpty(inputalas)){
            alas.setError("Alas harus di isi");;
            alas.requestFocus();
        }else if(TextUtils.isEmpty(inputtinggi)){
            tinggi.setError("Tinggi harus di isi");;
            tinggi.requestFocus();
        }else{
            Double nilaialas = Double.parseDouble((inputalas));
            Double nilaitinggi = Double.parseDouble((inputtinggi));
            Double hasilhitung = 0.5 * nilaialas * nilaitinggi;
            hasil.setText(hasilhitung.toString());
        }
    }
}



