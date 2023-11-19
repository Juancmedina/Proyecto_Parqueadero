package parqueadero;

public class Celda {
    private int numeroCelda;
    private boolean estaOcupada;

    public Celda(int numeroCelda) {
        this.numeroCelda = numeroCelda;
        this.estaOcupada = false;
    }

    public int getNumeroCelda() {
        return numeroCelda;
    }

    public boolean estaDisponible() {
        return !estaOcupada;
    }

    public void ocuparCelda() {
        this.estaOcupada = true;
    }

    public void liberarCelda() {
        this.estaOcupada = false;
    }
}
