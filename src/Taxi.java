public class Taxi extends Vehiculo {
    // Atributo adicional para Taxi
    private int valorPasaje;

    // Constructor que inicializa color, patente y valorPasaje
    public Taxi(String color, String patente, int valorPasaje) {
        super(color, patente);  // Llama al constructor de la clase Vehiculo
        this.valorPasaje = valorPasaje;
    }

    // Método getter para valorPasaje
    public int getValorPasaje() {
        return valorPasaje;
    }

    // Método setter para valorPasaje
    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    // Método para pagar el pasaje y recibir el vuelto si el monto es suficiente
    public int pagarPasaje(int montoUsuario) {
        if (montoUsuario >= valorPasaje) {
            int vuelto = montoUsuario - valorPasaje;  // Calcula el vuelto
            System.out.println("Su vuelto es: " + vuelto);
            return vuelto; // Devuelve el vuelto
        } else {
            System.out.println("El monto ingresado no es suficiente para cubrir el pasaje. Monto ingresado: " + montoUsuario);
            return montoUsuario; //Devuelve el monto que el pasajero tiene
        }
    }
}
