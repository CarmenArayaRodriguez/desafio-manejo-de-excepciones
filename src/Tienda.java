public class Tienda {
    // Atributos de la clase Tienda
    private Vendedor vendedor;
    private Vehiculo vehiculo;
    private int stock;

    // Constructor que inicializa todos los atributos
    public Tienda(Vendedor vendedor, Vehiculo vehiculo, int stock) {
        this.vendedor = vendedor;
        this.vehiculo = vehiculo;
        this.stock = stock;
    }

    // Getters y Setters para cada atributo
    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Método para verificar si existe stock y retornar la cantidad
    public String existeStock() {
        return "Cantidad de stock es: " + stock;
    }
}
