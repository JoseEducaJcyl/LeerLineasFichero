import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //Declaramos variables para contar, palabras, caracteres y lineas
        int contador = 0;
        int caracteres = 0;
        int palabras = 0;
        //Leemos un fichero de texto, en este caso "datos.txt"
        try (BufferedReader reader = new BufferedReader(new
                FileReader("datos.txt"))) {
            String linea;
            //Se recorre cada linea, y se cuentas las lineas, palabras y caracteres 
            while ((linea = reader.readLine()) != null) {
                contador++;
                System.out.println(linea);
                caracteres += linea.length();
                palabras += linea.split(" ").length;
            }
            //Se muestra los resultados 
            System.out.println("\nNumero de lineas: " + contador);
            System.out.println("\nNumero de caracteres: " + caracteres);
            System.out.println("\nNumero de palabras: " + palabras);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " +
                    e.getMessage());
        }
    }
}
