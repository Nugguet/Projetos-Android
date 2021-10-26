package com.example.calculopassos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText distanciaPercorrida = (EditText) findViewById(R.id.edtDistanciaPercorrida);
        EditText passos = (EditText) findViewById(R.id.edtDistancia);


        Button btnResultado = (Button) findViewById(R.id.btnResultado);
        btnResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double aux = Double.parseDouble(distanciaPercorrida.getText().toString());
                passos.setText(calculateDistance(aux) + "");
            }
        });
    }

    private double calculateDistance (double distancia){
        return distancia * 0.9;
    }
}