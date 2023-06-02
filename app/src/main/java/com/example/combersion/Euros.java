package com.example.combersion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Euros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_euros);
    }

    //funcion de Finalizar
    public void Finalizar (View view){
        this.finish();
    }

    //Funcion de Conversion
    public void ConversionEuros(View view){
        EditText euros=(EditText) findViewById(R.id.txt_euros);
        float tipoCambio = 1.08f;

        Float total=Float.parseFloat(euros.getText().toString())*tipoCambio;
        TextView to=findViewById(R.id.txt_dolares);
        to.setText(total+"");
    }

    public void ConversionDolares(View view){
        EditText dolares=(EditText) findViewById(R.id.txt_dolaresP);
        float tipoCambio = 0.92f;

        Float total=Float.parseFloat(dolares.getText().toString())*tipoCambio;
        TextView to=findViewById(R.id.txt_euros2);
        to.setText(total+"");
    }
}