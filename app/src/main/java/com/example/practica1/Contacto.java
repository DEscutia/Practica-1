package com.example.practica1;

import java.io.Serializable;

public class Contacto implements Serializable {
    private String nombre;
    private String email;
    private String twitter;
    private String telefono;
    private String fechaDeNacimiento;

    public Contacto(String nombreN, String emailN, String twitterN, String telefonoN, String fechaDeNacimientoN){
            nombre = nombreN;
            email = emailN;
            twitter = twitterN;
            telefono = telefonoN;
            fechaDeNacimiento = fechaDeNacimientoN;
    }

    public String getNombre(){
        return nombre;
    }

    public String getEmail(){return email;}

}
