public class Bus extends Vehiculo {
    private int cantidadDeAsientos;

    // Constructor
    public Bus(String color, String patente, int cantidadDeAsientos) {
        super(color, patente);
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    // Getter y Setter para cantidadDeAsientos
    public int getCantidadDeAsientos() {
        return cantidadDeAsientos;
    }

    public void setCantidadDeAsientos(int cantidadDeAsientos) {
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    // Método para verificar si hay asientos disponibles
    public boolean asientosDisponibles() {
        // Retorna true si hay asientos, false si no hay
        return cantidadDeAsientos > 0;
    }
}

