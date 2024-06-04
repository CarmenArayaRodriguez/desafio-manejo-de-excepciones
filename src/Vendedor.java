public class Vendedor extends Persona {
    // Atributo específico para Vendedor
    private String direccion;

    // Constructor
    public Vendedor(String rut, String nombre, int edad, String direccion) {
        super(rut, nombre, edad);  // Llama al constructor de la clase Persona
        this.direccion = direccion;
    }

    // Getter y Setter para dirección
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
