import java.util.Arrays;

public class QuickSort {

    private static int nivelRecursion = 0;

    private static String getInd() {
        return "  ".repeat(Math.max(0, nivelRecursion));
    }

    public static void ordenar(int[] array, int izquierda, int derecha) {
        if (nivelRecursion == 0) {
            System.out.println("=== QUICK SORT ===");
            System.out.println("Estado Inicial: " + Arrays.toString(array));
        }
        
        System.out.println(getInd() + "Llamada recursiva: rango [" + izquierda + " a " + derecha + "]");
        
        if (izquierda >= derecha) {
            System.out.println(getInd() + "CASO BASE: izquierda (" + izquierda + ") >= derecha (" + derecha + "). Subarray de tamano <= 1.");
            return;
        }
        
        int indicePivote = particionar(array, izquierda, derecha);
        
        System.out.println(getInd() + "Rama Izquierda (menores al pivote):");
        nivelRecursion++;
        ordenar(array, izquierda, indicePivote - 1);
        nivelRecursion--;
        
        System.out.println(getInd() + "Rama Derecha (mayores al pivote):");
        nivelRecursion++;
        ordenar(array, indicePivote + 1, derecha);
        nivelRecursion--;
        
        if (nivelRecursion == 0) {
            System.out.println("\nEstado Final: " + Arrays.toString(array) + "\n");
        }
    }

    private static int particionar(int[] array, int izquierda, int derecha) {
        // Logica de particion pendiente
        return izquierda; 
    }
}