package com.android.proyecto016datosentreactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {


    TextView tv1;
    private Button btnR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        tv1 = findViewById(R.id.txt_vista1);
        btnR = findViewById(R.id.id_btn_retornar);

        Bundle datos = getIntent().getExtras();

        int valor1 = datos.getInt("valor_1");
        int valor2 = datos.getInt("valor_2");
        String ope = datos.getString("op");

        switch (ope){
            case "Sumar":
                int suma = valor1 + valor2;
                tv1.setText(valor1 + "+" + valor2 + "= " + suma);
                break;
            case "Resta":
                int resta = valor1 - valor2;
                tv1.setText(valor1 + " - " + valor2 + "= " + resta);
                break;
            case "Multiplicar":
                int mul = valor1 * valor2;
                tv1.setText(valor1 + " * " + valor2 + "= " + mul);
                break;
            case "Dividir":
                int div = valor1 / valor2;
                tv1.setText(valor1 + "/" + valor2 + "= " + div);
                break;
        }

        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivityForResult(i,0);
            }
        });
    }
}