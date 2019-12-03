package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn,btn1;
    TextView ekran1;
    int sayi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sayi =0;
        btn = findViewById(R.id.sayi);
        btn1 = findViewById(R.id.reset);
        ekran1 = findViewById(R.id.ekran);

    }

    public void SayiyaTikla(View view) {
        sayi++;
        ekran1.setText("00000"+sayi);

        Toast.makeText(getApplicationContext(),"+1 Sevap",Toast.LENGTH_SHORT).show();
    }

    public void SayıyıSıfırla(View view) {
        sayi = 0;
        ekran1.setText("00000"+sayi);
        Toast.makeText(getApplicationContext(),"ALLAH kabul etsin",Toast.LENGTH_LONG).show();
    }
}
