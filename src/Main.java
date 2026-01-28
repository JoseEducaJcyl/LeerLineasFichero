import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int contador = 0;
        int caracteres = 0;
        int palabras = 0;
        try (BufferedReader reader = new BufferedReader(new
                FileReader("datos.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                contador++;
                System.out.println(linea);
                caracteres += linea.length();
                palabras += linea.split(" ").length;
            }
            System.out.println("\nNumero de lineas: " + contador);
            System.out.println("\nNumero de caracteres: " + caracteres);
            System.out.println("\nNumero de palabras: " + palabras);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " +
                    e.getMessage());
        }
    }
}