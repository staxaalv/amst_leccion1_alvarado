package com.example.amst_l1_alvarado_espolservicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class academico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academico);
        Toast toast=Toast.makeText(getApplicationContext(),"Horario de atencion siempre via iNTERNET",Toast.LENGTH_SHORT);
        toast.show();
    }
}
