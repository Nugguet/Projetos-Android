package com.example.inss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edt = (EditText) findViewById(R.id.edtSalario);
        Button btn = (Button) findViewById(R.id.btnCalcular);

        btn.setOnClickListener(v -> {
            double salario = Double.parseDouble(edt.getText().toString());
            Intent intent = new Intent(getApplicationContext(), CalculoActivity.class);
            intent.putExtra("salario", salario);
            startActivity(intent);
        });

    }
}