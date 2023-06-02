package com.example.combersion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

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
}