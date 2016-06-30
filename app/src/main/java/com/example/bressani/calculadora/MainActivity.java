package com.example.bressani.calculadora;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View view) {
        TextView num1 = (TextView) findViewById(R.id.Num1);
        TextView num2 = (TextView) findViewById(R.id.Num2);

        double resultado = Double.parseDouble(num1.getText().toString()) + Double.parseDouble(num2.getText().toString());

        AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);

        dialogo.setTitle("Resultado");
        dialogo.setMessage("O resultado é " + resultado);
        dialogo.setNeutralButton("Ok", null);
        dialogo.show();
    }
}
