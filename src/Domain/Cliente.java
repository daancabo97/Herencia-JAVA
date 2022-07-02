

package Domain;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Cliente extends Persona {
     private int idCliente;
     private boolean vip ;
     private Date fechaRegistro;
     private static int contadorCliente;
     

    public Cliente(boolean vip, Date fechaRegistro, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.vip = vip;
        this.fechaRegistro = fechaRegistro;
        
    }

   
    public int getIdCliente() {
        return this.idCliente;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
    
    
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String FechaFormateada(){
        SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/YYYY");
        String fechaFormateada = SDF.format(fechaRegistro);
        System.out.println(fechaFormateada);
    
        return fechaFormateada;
    }
    
@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente(idCliente = ").append(idCliente);
        sb.append(", fechaRegistro = ").append(FechaFormateada());
        sb.append(", vip = ").append(this.vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString(); // -> Manda llamar el metodo 'toString()' el cual regresa la cadena que se ha generado a partir de las llamadas del metodo 'append()'
    }    
}


