public class MiniBus extends Bus{
    // Atributo de la clase MiniBus
    private String tipoViaje;

    // Constructor de la clase MiniBus
    public MiniBus(String color, String patente, int cantidadDeAsientos, String tipoViaje) {
        super(color, patente, cantidadDeAsientos);  // Llama al constructor de la clase Bus
        // Inicializa el atributo tipoViaje con el valor proporcionado en el argumento del constructor
        this.tipoViaje = tipoViaje;
    }

    public String getTipoViaje() {
        return tipoViaje;
    }

    // Establece un nuevo valor para el tipo de viaje de un objeto MiniBus
    public void setTipoViaje(String tipoViaje) {
        // Actualiza el valor del atributo tipoViaje con el nuevo valor proporcionado
        this.tipoViaje = tipoViaje;
    }

    // Método para imprimir todos los atributos del MiniBus
    public void imprimeBus() {
        System.out.println("Color: " + getColor());
        System.out.println("Patente: " + getPatente());
        System.out.println("Cantidad de Asientos: " + getCantidadDeAsientos());
        System.out.println("Tipo de Viaje: " + tipoViaje);
    }
}
