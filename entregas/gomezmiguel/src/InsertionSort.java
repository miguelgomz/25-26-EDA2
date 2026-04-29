import java.util.Arrays;

public class InsertionSort {

    private static int nivelRecursion = 0;

    private static String getInd() {
        return "  ".repeat(Math.max(0, nivelRecursion));
    }

    public static void ordenar(int[] array) {
        System.out.println("=== INSERTION SORT ITERATIVO ===");
        System.out.println("Estado Inicial: " + Arrays.toString(array));
        
        for (int i = 1; i < array.length; i++) {
            int actual = array[i];
            int j = i - 1;
            System.out.println("\nIteracion " + i + " | Elemento a insertar: " + actual);
            
            while (j >= 0 && array[j] > actual) {
                System.out.println("  Comparando array[" + j + "] (" + array[j] + ") > actual (" + actual + ") -> SI");
                System.out.println("  Desplazando " + array[j] + " a la derecha.");
                array[j + 1] = array[j];
                j--;
                System.out.println("  Estado temporal: " + Arrays.toString(array));
            }
            
            if (j >= 0) {
                System.out.println("  Comparando array[" + j + "] (" + array[j] + ") > actual (" + actual + ") -> NO (Posicion encontrada)");
            } else {
                System.out.println("  Se alcanzo el limite izquierdo del array.");
            }
            
            array[j + 1] = actual;
            System.out.println("Resultado de la iteracion: " + Arrays.toString(array));
        }
        System.out.println("\nEstado Final: " + Arrays.toString(array) + "\n");
    }
}