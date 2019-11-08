package com.example.amst_l1_alvarado_espolservicios;

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
    public void entraAcademico (View view){
        Intent intent=new Intent(this,academico.class);
        startActivity(intent);
    }
    public void entraBienestar (View view){
        Intent intent=new Intent(this,bienestar.class);
        startActivity(intent);
    }
    public void entraSidweb (View view){
        Intent intent=new Intent(this,sidweb.class);
        startActivity(intent);
    }
    public void entravinculos (View view){
        Intent intent=new Intent(this,vinculos.class);
        startActivity(intent);
    }
}
