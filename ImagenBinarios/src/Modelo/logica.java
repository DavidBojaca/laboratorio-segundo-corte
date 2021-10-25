package Modelo;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class logica {
   
        private File archivo;
        private byte[] mapaBytes;
        private byte[] auxiliar;
        private byte[] contraseña;
        private int rmd;

        public void lecturaArchivo() {
            try {
                archivo = new File("Data/world.jpg");
                mapaBytes = Files.readAllBytes(archivo.toPath());
               
                for (int i = 0; i < 200; i++) {
                    System.out.print((char)mapaBytes[i] + ", ");
                }
                /*System.out.println("\n");
                for (int i = 0; i < 2000; i++) {
                    System.out.print((char) mapaBytes[i]);
                }*/
                // System.out.println(Arrays.toString(mapaBytes));
                // System.out.println(mapaBytes.length);
            } catch (Exception e) {
                System.out.println("Error al leer archivo: " + e.getMessage());
            }
        
        }


        public void encriptacion(String pass) {
            contraseña = pass.getBytes();
            rmd= new Random().nextInt(20);

            int posicion = rmd;

            auxiliar= new byte[contraseña.length];
    
            System.out.println("\n contraseña: "+ Arrays.toString(contraseña));
           
            for (int i = 0; i <contraseña.length ; i++) {

                   auxiliar[i]=mapaBytes[posicion];
                    mapaBytes[posicion]=contraseña[i];
                    System.out.println("Conteo: "+ i);
                    posicion++;
                   
                    
                    //System.out.println("Contraseña: "+ contraseña[conteo]);
                
            }
           
            
            System.out.println("\nEncriptacion exitosa");

            for (int i = 0; i < 200; i++) {
            System.out.print((char)mapaBytes[i] + ", ");
            }
        }

        public void Desencriptacion() {
            int posicion =rmd;


            for (int i = 0; i <contraseña.length; i++) {
                mapaBytes[posicion]=auxiliar[i];
                posicion++;
            }

            System.out.println("\ndesencriptacion completada");
            for (int i = 0; i < 200; i++) {
                System.out.print((char)mapaBytes[i] + ", ");
            }
        }
    



















    }

   
