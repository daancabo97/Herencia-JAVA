
package test;


import Domain.Cliente;
import Domain.Empleado;
import java.util.Date;


public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Daniel", 4000000.0);   
        System.out.println("empleado1 = " + empleado1);
        
        Cliente cliente1 = new Cliente(true, new Date(), "Andres", 'M', 25, "Cra 4ta No 19 - 34");
        System.out.println("cliente1 = " + cliente1);
        
        Cliente cliente2 = new Cliente(true, new Date(), "Caicedo", 'M', 25, "Cra 4ta No 19 - 34");
        System.out.println("cliente2 = " + cliente2);
         
       
        
    }
}
