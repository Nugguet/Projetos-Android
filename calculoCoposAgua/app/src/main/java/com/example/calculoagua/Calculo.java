package com.example.calculoagua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Calculo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        Bundle bdl = getIntent().getExtras();
        String peso = bdl.getString("peso");
        double calculo = (Double.parseDouble(peso) * 35) / 1000;
        DecimalFormat df = new DecimalFormat("#,###.00");
        TextView resultado = (TextView) findViewById(R.id.txtResultado);
        TextView garrafa = (TextView) findViewById(R.id.txtGarrafa);
        TextView copos = (TextView) findViewById(R.id.txtCopos);
        resultado.setText(df.format(calculo));
        garrafa.setText(df.format(calculo / 0.50));
        copos.setText(df.format(calculo / 0.31));

    }
}