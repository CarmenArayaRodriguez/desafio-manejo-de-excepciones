public class Vehiculo {
    // Atributos de la clase
    private String color;
    private String patente;

    // Constructor que inicializa los atributos color y patente
    public Vehiculo(String color, String patente) {
        this.color = color;
        this.patente = patente;
    }

    // Constructor que solo inicializa la patente
    public Vehiculo(String patente) {
        this.patente = patente;
    }

    // Método getter para color
    public String getColor() {
        return color;
    }

    // Método setter para color
    public void setColor(String color) {
        this.color = color;
    }

    // Método getter para patente
    public String getPatente() {
        return patente;
    }

    // Método setter para patente
    public void setPatente(String patente) {
        this.patente = patente;
    }
}
