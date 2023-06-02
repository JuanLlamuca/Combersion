package com.example.combersion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Conversion de Euros a dolares
    public void irEuro(View view){
        Intent intent=new Intent(this,Euros.class);
        view.getContext().startActivity(intent);
    }
}