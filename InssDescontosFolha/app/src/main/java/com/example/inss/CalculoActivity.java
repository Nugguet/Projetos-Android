package com.example.inss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CalculoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado);

        Bundle bdl = getIntent().getExtras();
        double salario = bdl.getDouble("salario");
        String valorIR = "";
        String aliquota = "";
        String aliquotaINSS = "";
        String percentINSS = "";
        double valorINSS = 0;
        double salarioLiquido = 0;

        if(salario <= 1903.98) {
            aliquota = "0%";
            valorIR = "0";
        }else if(salario >= 1903.99 && salario <= 2826.65) {
            aliquota = "7,5%";
            valorIR = "142.80";
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            aliquota = "15%";
            valorIR = "354.80";
        } else if (salario >= 3751.06  && salario <= 4664.68) {
            aliquota = "22,5%";
            valorIR = "636.13";
        } else if (salario >= 4664.68) {
            aliquota = "27,5%";
            valorIR = "869.36";
        }

        if(salario <= 1045.00) {
            percentINSS = "14";
            aliquotaINSS = "0.14";
        } else if (salario >= 1045.01 && salario <= 2089.60) {
            percentINSS = "12";
            aliquotaINSS = "0.12";
        } else if (salario >= 2089.61 && salario <= 3134.40) {
            percentINSS = "9";
            aliquotaINSS = "0.09";
        } else if (salario >= 3134.41 && salario <= 6101.06) {
            percentINSS = "7.5";
            aliquotaINSS = "0.075";
        }

        valorINSS = salario * Double.parseDouble(aliquotaINSS);
        salarioLiquido = salario - (Double.parseDouble(valorIR) + valorINSS);
        TextView resultado = (TextView) findViewById(R.id.idPerfil);
        StringBuilder sb = new StringBuilder();
        sb.append("Salario Bruto: R$ " + salario);
        sb.append("\n");
        sb.append("\n");
        sb.append("\n");
        sb.append("Descontos");
        sb.append("\n");
        sb.append("\n");
        sb.append("Imposto de Renda: " + aliquota + "  -  R$" + valorIR);
        sb.append("\n");
        sb.append("\n");
        sb.append("INSS:  " + percentINSS + "%   -  R$" + valorINSS);
        sb.append("\n");
        sb.append("\n");
        sb.append("\n");
        sb.append("Salario Liquido: " + salarioLiquido);
        resultado.setText(sb.toString());
    }
}