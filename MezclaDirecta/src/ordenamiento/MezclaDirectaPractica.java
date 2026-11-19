package ordenamiento; // Paquete donde se organiza la clase del proyecto

// Librerías nativas de Java para leer y escribir archivos de texto
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class MezclaDirectaPractica {

    /**
     * Intercala bloques ordenados de tamaño L provenientes de dos archivos (F1 y F2)
     * y guarda el resultado ordenado en un archivo de salida.
     */
    public static void intercalarBloques(String archivoF1, String archivoF2,
                                         String archivoSalida, int L) {
        // Abre los archivos y los cierra automáticamente al terminar
        try (
                BufferedReader lector1 = new BufferedReader(new FileReader(archivoF1)); // Lector de F1
                BufferedReader lector2 = new BufferedReader(new FileReader(archivoF2)); // Lector de F2
                PrintWriter escritor = new PrintWriter(new FileWriter(archivoSalida))   // Escritor de salida
        ) {
            // Lee la primera línea (primer número) de cada archivo
            String linea1 = lector1.readLine();
            String linea2 = lector2.readLine();

            // Contadores de cuántos elementos se han sacado del bloque actual de tamaño L
            int elementosEscritos1 = 0;
            int elementosEscritos2 = 0;

            // Repite mientras ninguno de los dos archivos llegue al final (null)
            while (linea1 != null && linea2 != null) {

                // CASO 1: Aún quedan elementos por comparar en ambos bloques de tamaño L
                if (elementosEscritos1 < L && elementosEscritos2 < L) {
                    int val1 = Integer.parseInt(linea1.trim()); // Convierte la línea de F1 a entero
                    int val2 = Integer.parseInt(linea2.trim()); // Convierte la línea de F2 a entero

                    // TODO 1: Si el número de F1 es menor o igual al de F2
                    if (val1 <= val2) {
                        escritor.println(val1); // Escribe el número de F1 en la salida
                        linea1 = lector1.readLine(); // Lee el siguiente número de F1
                        elementosEscritos1++; // Suma 1 al contador del bloque de F1
                    } else {
                        // TODO 2: Si el menor fue el de F2
                        escritor.println(val2); // Escribe el número de F2 en la salida
                        linea2 = lector2.readLine(); // Lee el siguiente número de F2
                        elementosEscritos2++; // Suma 1 al contador del bloque de F2
                    }
                }
                // CASO 2: El bloque de F2 ya completó L elementos; vacía lo que falta de F1
                else if (elementosEscritos1 < L) {
                    escritor.println(linea1.trim()); // Escribe el número pendiente de F1
                    linea1 = lector1.readLine(); // Avanza a la siguiente línea de F1
                    elementosEscritos1++; // Suma 1 al contador de F1
                }
                // CASO 3: El bloque de F1 ya completó L elementos; vacía lo que falta de F2
                else {
                    // TODO 3: Vacía el elemento restante del bloque de F2
                    escritor.println(linea2.trim()); // Escribe el número pendiente de F2
                    linea2 = lector2.readLine(); // Avanza a la siguiente línea de F2
                    elementosEscritos2++; // Suma 1 al contador de F2
                }
            }

            // Confirma en consola que el proceso terminó correctamente
            System.out.println("Bloque intercalado con exito!");
        } catch (IOException e) {
            // Muestra un mensaje si no existen los archivos o hay error de lectura/escritura
            System.out.println("Error en E/S de archivos: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Ejecuta la mezcla usando f1.txt y f2.txt para generar f3.txt con bloques de tamaño 1
        intercalarBloques("f1.txt", "f2.txt", "f3.txt", 1);
    }
}