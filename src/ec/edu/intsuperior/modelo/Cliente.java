/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author user
 */
public class  Cliente extends Persona {
    
    private String telefono;

    public Cliente() {
    }

    public Cliente(String telefono, String nombre, String fechaNacimiento) {
        super(nombre, fechaNacimiento);
        this.telefono = telefono;
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return getNombre()+" "+getTelefono()+" "+getFechaNacimiento(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
  
    
    
     public static void mostrar(){
        System.out.println("Este es un metodo estatico de la clase: Cliente");
    }

}
