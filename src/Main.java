import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int contador = 0;
        try (BufferedReader reader = new BufferedReader(new
                FileReader("datos.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                contador++;
                System.out.println(linea);
            }
            System.out.println("Contador: " + contador);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " +
                    e.getMessage());
        }
    }
}