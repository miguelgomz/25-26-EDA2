public class Money {
    private String letrasUnicas;
    private int[] asignacion;
    private boolean[] digitoUsado;

    public Money() {
        this.letrasUnicas = "SENDMORY";
        this.asignacion = new int[letrasUnicas.length()];
        this.digitoUsado = new boolean[10];
    }

public void resolver() {
        if (ejecutarRecursion(0)) {
            imprimirResultado();
        } else {
            System.out.println("No se encontro solucion.");
        }
    }

    public static void main(String[] args) {
        Money examen = new Money();
        examen.resolver();
    }
}