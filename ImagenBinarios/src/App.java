import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        File archivo;
        byte[] mapaBytes;

        try {
            archivo = new File("E:\\Algoritmos\\ImagenBinarios\\src\\world.jpg");
            mapaBytes = Files.readAllBytes(archivo.toPath());
            String contraseña = "contraseña";
            byte[] pass = contraseña.getBytes();
            System.out.println(pass.length);
            
            mapaBytes[0] = pass[0];
            mapaBytes[1] = 'a';
            for (int i = 0; i < 200; i++) {
                System.out.print(mapaBytes[i] + ", ");
            }
            System.out.println("\n");
            for (int i = 0; i < 2000; i++) {
                System.out.print((char) mapaBytes[i]);
            }
            // System.out.println(Arrays.toString(mapaBytes));
            // System.out.println(mapaBytes.length);
        } catch (Exception e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
    }
}
