package parqueadero;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilidades {
    public static Date parsearFecha(String fechaStr) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return formato.parse(fechaStr);
    }

    public static double calcularHorasEstacionado(Date fechaEntrada, Date fechaSalida) {
        long diferenciaMillis = fechaSalida.getTime() - fechaEntrada.getTime();
        return diferenciaMillis / (1000.0 * 60.0 * 60.0); // Convertir de milisegundos a horas
    }

    public static double calcularCostoEstacionamiento(double horasEstacionado) {
        double tarifaPorHora = 1000.0;
        return horasEstacionado * tarifaPorHora;
    }
}
