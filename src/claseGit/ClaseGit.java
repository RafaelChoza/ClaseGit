package claseGit;

import java.security.Permission;

public class ClaseGit {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.metodo("Enrique", 33);
    }
    static class Persona {
        static String name;
        static int edad;

        static void metodo(String name, int edad) {
            System.out.println("EL nombre de la persones es " + name + " y su edad es " + edad);
        }
    }
}