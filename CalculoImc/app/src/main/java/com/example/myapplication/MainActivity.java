package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double IMC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtAltura = (EditText) findViewById(R.id.edtAltura);
        EditText edtPeso = (EditText) findViewById(R.id.edtPeso);
        Button btn1 = (Button) findViewById(R.id.imageButton2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double altura = Double.parseDouble(edtAltura.getText().toString());
                double peso = Double.parseDouble(edtPeso.getText().toString());
                double imc = peso / (altura * altura);
                IMC = imc;
                if (IMC < 18.5) {
                    Toast.makeText(getApplicationContext(), "Você esta abaixo do peso ideal consulte um nutricionista. \n" + "Seu IMC = " + imc + "\n",
                            Toast.LENGTH_LONG).show();
                }
                    else if (IMC < 24.9){
                    Toast.makeText(getApplicationContext(), "Você esta no peso ideal. \n" + "Seu IMC = " + imc + "\n",
                            Toast.LENGTH_LONG).show();
                }
                    else if (IMC < 29.9){
                        Toast.makeText(getApplicationContext(), "Você esta com SOBREPESO consulte um nutricionista. \n" + "Seu IMC = " + imc + "\n",
                                Toast.LENGTH_LONG).show();
                    }

                    else if (IMC < 39.9){
                        Toast.makeText(getApplicationContext(), "Você esta com OBESIDADE consulte um nutricionista. \n" + "Seu IMC = " + imc + "\n",
                                Toast.LENGTH_LONG).show();
                    }

                    else if (IMC > 39.9){
                        Toast.makeText(getApplicationContext(), "Você esta com OBESIDADE GRAVE consulte um nutricionista. \n" + "Seu IMC = " + imc + "\n",
                                Toast.LENGTH_LONG).show();
                    }




            }



        });
    }

}