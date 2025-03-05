public class Motorino {
    private String colore;
    private String tipo;
    private double velocità;
    private boolean antifurto;

    public Motorino(String colore, String tipo, double velocità, boolean antifurto) {
        this.colore = colore;
        this.tipo = tipo;
        this.velocità = velocità;
        this.antifurto = false;
    }

    public double getVelocità() {
        return velocità;
    }

    public void inserisciAntifurto(boolean antifurto) {
        this.antifurto = antifurto;
    }

    @Override
    public String toString() {
        return colore + ' ' + tipo + " " + velocità + ' ' + "antifurto:" + antifurto;
    }
}