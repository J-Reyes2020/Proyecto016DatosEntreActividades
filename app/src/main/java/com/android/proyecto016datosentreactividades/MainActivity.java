package com.android.proyecto016datosentreactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private EditText editTextV1;
    private EditText editTextV2;
    private Spinner spr1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextV1 = findViewById(R.id.etxt_num1);
        editTextV2 = findViewById(R.id.etxt_num2);

        spr1 = findViewById(R.id.spr_valor);

        String [] operaciones ={"Sumar","Restar","Multiplicar", "Dividir"};

        ArrayAdapter <String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,operaciones);
        spr1.setAdapter(adapter1);
    }

    public void onClickMostrarResultaddo(View view) {
        Intent i = new Intent(this,Actividad2.class);
        int valor1 = Integer.parseInt(editTextV1.getText().toString());
        int valor2 = Integer.parseInt(editTextV2.getText().toString());

        String operacion = spr1.getSelectedItem().toString();

        i.putExtra("valor_1",valor1);
        i.putExtra("valor_2",valor2);
        i.putExtra("op",operacion);
        startActivity(i);
    }
}