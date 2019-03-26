package app;

import clases.Persona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<Persona>();

        personas= Arrays.asList(new Persona("Maximiliano","Morales",41669179,20),
                new Persona("Agus","Nicoloso",40000000,22),
                new Persona("Cristian","Fontana",10000000,45),
                new Persona("Mauri","Goyeneche",41667150,17));


        System.out.println(String.format("Personas: %s",personas));
        List<Persona> persmayores= new ArrayList<>();
              persmayores=  personas.stream()
                .filter(persona ->persona.getEdad()>=21)
                .collect(Collectors.toList());



        System.out.println(String.format("Persona mayor a 21: %s",personas.stream()
                .filter(persona ->persona.getEdad()>=21)
                .collect(Collectors.toList())));

        System.out.println(String.format("Persona menor a 21: %s",personas.stream()
                .filter(persona ->persona.getEdad()<21)
                .collect(Collectors.toList())));

        System.out.println(String.format("Persona mayor a 21 con dni +20: %s",personas.stream()
                .filter(persona ->persona.getEdad()>=21)
                .filter(persona -> persona.getDni()>20000000)
                .collect(Collectors.toList())));


    }
}
