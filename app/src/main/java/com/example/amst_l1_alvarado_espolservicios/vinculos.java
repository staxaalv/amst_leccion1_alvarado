package com.example.amst_l1_alvarado_espolservicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class vinculos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vinculos);
        Toast toast=Toast.makeText(getApplicationContext(),"Horario de atencion de lunes a viernes de 8 AM a 6 PM",Toast.LENGTH_SHORT);
        toast.show();
    }
}
