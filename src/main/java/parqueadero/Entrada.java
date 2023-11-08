package parqueadero;

import java.util.Date;

public class Entrada {
    private int id;
    private Date fechaHoraEntrada;
    private Vehiculo vehiculo;
    private Usuario usuario;

    public Entrada(int id, Date fechaHoraEntrada, Vehiculo vehiculo, Usuario usuario) {
        this.id = id;
        this.fechaHoraEntrada = fechaHoraEntrada;
        this.vehiculo = vehiculo;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public Date getFechaHoraEntrada() {
        return fechaHoraEntrada;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}