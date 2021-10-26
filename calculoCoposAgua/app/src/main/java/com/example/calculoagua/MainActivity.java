package com.example.calculoagua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText peso = (EditText) findViewById(R.id.edtPeso);
        Button btnCalcular = (Button) findViewById(R.id.button);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Calculo.class);
                intent.putExtra("peso", peso.getText().toString());
                startActivity(intent);
            }
        });

    }
}