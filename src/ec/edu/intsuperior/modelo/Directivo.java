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
public class Directivo {
    
    private String categoria;
    
    

    public Directivo() {
    }

    public Directivo(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return getCategoria(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public static void mostrar(){
        System.out.println("Este es un metodo estatico de la clase:  Directivo");
    }
    
}
