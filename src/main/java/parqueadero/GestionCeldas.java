package parqueadero;
import java.util.ArrayList;
import java.util.List;

public class GestionCeldas {
    private List<Celda> listaCeldas;

    public GestionCeldas(int cantidadCeldas) {
        this.listaCeldas = new ArrayList<>();
        for (int i = 1; i <= cantidadCeldas; i++) {
            Celda celda = new Celda(i);
            listaCeldas.add(celda);
        }
    }

    public List<Celda> getCeldasDisponibles() {
        List<Celda> disponibles = new ArrayList<>();
        for (Celda celda : listaCeldas) {
            if (celda.estaDisponible()) {
                disponibles.add(celda);
            }
        }
        return disponibles;
    }

    public Celda asignarCeldaDisponible() {
        for (Celda celda : listaCeldas) {
            if (celda.estaDisponible()) {
                celda.ocuparCelda();
                return celda;
            }
        }
        return null;
    }

    public void liberarCelda(int numeroCelda) {
        for (Celda celda : listaCeldas) {
            if (celda.getNumeroCelda() == numeroCelda) {
                celda.liberarCelda();
                break;
            }
        }
    }
}
