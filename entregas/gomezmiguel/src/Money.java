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
    private boolean ejecutarRecursion(int indice) {
        if (indice == letrasUnicas.length()) {
            return esSumaCorrecta();
        }

        for (int digito = 0; digito <= 9; digito++) {
            if (esAsignacionValida(indice, digito)) {
                asignacion[indice] = digito;
                digitoUsado[digito] = true;

                if (ejecutarRecursion(indice + 1)) {
                    return true;
                }

                digitoUsado[digito] = false;
            }
        }
        return false;
    }
    

    public static void main(String[] args) {
        Money examen = new Money();
        examen.resolver();
    }
}