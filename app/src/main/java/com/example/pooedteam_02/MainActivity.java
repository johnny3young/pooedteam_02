package com.example.pooedteam_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    Persona persona = new Persona();
    Persona otrapersona = new Persona("Johnny III Young");
    Persona tercerapersona = new Persona("Johnny IV", 36);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        persona.setEdad(-20);
        Log.d(String.valueOf(this),"La edad es: " + persona.getEdad());

        Log.d(String.valueOf(this),"Nombre: " + otrapersona.getNombre());

        Log.d(String.valueOf(this),"Nombre: " + tercerapersona.getNombre());
        Log.d(String.valueOf(this),"Edad: " + tercerapersona.getEdad());
    }
}
