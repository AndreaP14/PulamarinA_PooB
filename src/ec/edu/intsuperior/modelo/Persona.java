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
public class Persona {
    
    private String nombre;
    private String fechaNacimiento;
    
    

    public Persona() {
    }

    public Persona(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return getNombre()+""+getFechaNacimiento(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public static void mostrar(){
        System.out.println("Este es un metodo estatico de la clase: Persona");
    }
    
    
}
