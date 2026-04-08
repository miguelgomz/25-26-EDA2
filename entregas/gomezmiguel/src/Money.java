public class Money {
    private String letrasUnicas;
    private int[] asignacion;
    private boolean[] digitoUsado;

    public Money() {
        this.letrasUnicas = "SENDMORY";
        this.asignacion = new int[letrasUnicas.length()];
        this.digitoUsado = new boolean[10];
    }
}