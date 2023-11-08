package parqueadero;
import java.util.Scanner;
import java.text.ParseException;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la fecha de entrada (en el formato dd/MM/yyyy HH:mm:ss): ");
        String fechaEntradaStr = scanner.nextLine();

        Date fechaEntrada;
        try {
            fechaEntrada = Utilidades.parsearFecha(fechaEntradaStr);
        } catch (ParseException e) {
            System.out.println("Error al analizar la fecha. Asegúrate de ingresar el formato correcto.");
            return;
        }
        scanner.close();

        Usuario usuario = new Usuario(1, "Nombre del Usuario", "123456789", "Dirección del Usuario");

        Vehiculo vehiculo = new Vehiculo(1, "ABC123", "Sedán", "Azul");

        Entrada entrada = new Entrada(1, fechaEntrada, vehiculo, usuario);

        Date fechaHoraSalida = new Date();
        double horasEstacionado = Utilidades.calcularHorasEstacionado(entrada.getFechaHoraEntrada(), fechaHoraSalida);
        double costo = Utilidades.calcularCostoEstacionamiento(horasEstacionado);

        Salida salida = new Salida(1, fechaHoraSalida, entrada, costo);


        System.out.println("Salida registrada para el vehículo con matrícula: " + salida.getEntrada().getVehiculo().getMatricula());
        System.out.println("Fecha y hora de entrada: " + salida.getEntrada().getFechaHoraEntrada());
        System.out.println("Fecha y hora de salida: " + salida.getFechaHoraSalida());
        System.out.println("Total de horas a facturar: " + horasEstacionado + " horas");
        System.out.println("Costo de estacionamiento: $" + salida.getCosto());
    }
}
