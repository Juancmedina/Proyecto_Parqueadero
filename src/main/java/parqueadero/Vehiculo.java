package parqueadero;

public class Vehiculo {
    private int id;
    private String matricula;
    private String modelo;
    private String color;

    public Vehiculo(int id, String matricula, String modelo, String color) {
        this.id = id;
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
