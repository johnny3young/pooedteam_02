package com.example.pooedteam_02;

import android.util.Log;

public class Persona {

    //Atributos
    private String nombre;
    private int edad;
    private float peso;
    private float estatura;


//Constructores

    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.peso = 0f;
        this.estatura = 0f;
    }

    //Segundo Constructor
    //Sobrecarga, escribir el mismo metodo pero con diferente firma
    public Persona (String n){
        this.nombre = n;
    }

    //Tercer Constructor

    public Persona (String n, int e) {
        this.nombre = n;
        this.edad = 36;
    }

    //Getter y Setter


    //Métodos

    public int getEdad() {
        return edad;
    }

    public void setEdad(int e) {
        if (e<0 || e>=150){
            Log.d("AVISO", "La edad ingresada NO es válida, por favor ingresarla nuevamente");
        }else
        this.edad = e;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

}
