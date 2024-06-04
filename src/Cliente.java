public class Cliente extends Persona {

    // Constructores
    public Cliente( String rut, String nombre, int edad) {
        // Llama al constructor de la clase Persona
        super(rut, nombre, edad);
    }

    // Contructor nombre y edad
    public Cliente(String nombre, int edad) {
        super(nombre, edad);
    }

    // Constructor edad
    public Cliente(int edad) {
        super(edad);
    }

    // Constructor nombre
    public Cliente(String nombre) {
        super(nombre);
    }

    // Constructor vacío
    public Cliente() {
        super();
    }

    // Sobreescritura del método getter para edad
    @Override
    public int getEdad() {
        return super.getEdad(); // Llama al método de la clase base para obtener la edad
    }

    // Sobreescritura del método setter para edad
    @Override
    public void setEdad(int edad) {
        super.setEdad(edad); // Llama al método de la clase base para establecer la edad
    }
}
