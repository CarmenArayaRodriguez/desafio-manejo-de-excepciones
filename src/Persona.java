public class Persona {
    // Atributos generales de Persona
    private String rut;
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String rut, String nombre, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor solo con nombre y edad
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor solo con edad
    public Persona(int edad) {
        this.edad = edad;
    }

    // Constructor solo con nombre
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Constructor sin parámetros
    public Persona() {
    }

    // Getters y Setters
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
