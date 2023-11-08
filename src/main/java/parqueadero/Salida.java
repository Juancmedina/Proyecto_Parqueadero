package parqueadero;

import java.util.Date;

public class Salida {
    private int id;
    private Date fechaHoraSalida;
    private Entrada entrada;
    private double costo;

    public Salida(int id, Date fechaHoraSalida, Entrada entrada, double costo) {
        this.id = id;
        this.fechaHoraSalida = fechaHoraSalida;
        this.entrada = entrada;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public Date getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}