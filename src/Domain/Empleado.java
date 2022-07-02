// extends : Significa que se extiende de la clase persona
// Variable estática : puede registrar el número de veces que una subrutina ha sido ejecutada
// super() : Nos lleva a la definicion del constructor o metodo de la clase padre
// appedn() : Agreda un elemento de cualquier tipo al final de una lista
// StringBuilder : Esta clase permite modificar internamente los valores 
// this : accede a los atributos de nuestra clase

package Domain;

public class Empleado extends Persona {

    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.idEmpleado = ++Empleado.contadorEmpleado; // Incrementa un objeto de tipo Empleado
        this.sueldo = sueldo;
    }

    
    
    public int getIdEmpleado() {
        return this.idEmpleado;
    }


    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado(idEmpleado = ").append(idEmpleado);
        sb.append(", sueldo = ").append(this.sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString(); // -> Manda llamar el metodo 'toString()' el cual regresa la cadena que se ha generado a partir de las llamadas del metodo 'append()'
    }
    

}

