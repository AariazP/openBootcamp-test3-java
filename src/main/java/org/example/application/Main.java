package org.example.application;

import org.example.model.Persona;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setNombre("Juan");
        persona.setTelefono("123456789");
        persona.setEdad(25);
        

        System.out.println(persona);
    }
}