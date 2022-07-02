//Herencia

// Protected : Sirve para que las clases hijas puedan acceder a ciertos atributos de la clase padre
// Object : Sirve para hacer referencia a la clase padre  'clase Object' 

package Domain;

public class Persona extends Object {
    protected String nombre;
    protected char genero;
    protected  int edad;
    protected  String direccion;

    
    
    // Constructor Vacio -> para construir objetos de tipo persona
    public Persona() {

    }

    // Constructor con Argumento -> para inicializar el atributo de nombre
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Constructor con Argumentos -> para inicializar cada uno de los atributos
    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    
    
    // Getter and Setter
    
    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    // Metodo toString -> para imprimir una cadena de atributos
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + '}';
    }
    
    

    
}
