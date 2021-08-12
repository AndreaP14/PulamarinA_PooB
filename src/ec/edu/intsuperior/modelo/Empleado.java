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
public class Empleado {
    
    private String sueldoBruto;
    
    
    

    public Empleado() {
    }

    public Empleado(String sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public String getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(String sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    @Override
    public String toString() {
        return getSueldoBruto(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public static void mostrar(){
        System.out.println("Este es un metodo estatico de la clase: Empleado");
    }
    
    public static void salarioNeto(){
        System.out.println("El salario neto del Emopleado es:");
    }
}
