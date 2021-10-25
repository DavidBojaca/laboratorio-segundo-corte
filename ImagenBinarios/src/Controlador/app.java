package Controlador;

import java.util.Scanner;

import Modelo.logica;

public class app {
    
    public static void main(String[] args) {
        logica pruebasLogica = new logica();
        Scanner leer = new Scanner(System.in);

        pruebasLogica.lecturaArchivo();

        System.out.println("Ingrese la contraseña");
         String contraseña =leer.next();
        pruebasLogica.encriptacion(contraseña);

        pruebasLogica.Desencriptacion();

        
    }
}
