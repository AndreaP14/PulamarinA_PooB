/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;
import ec.edu.intsuperior.modelo.Cliente;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class Aplicacion {
    public static void main(String[] args) {
       Cliente cli = new Cliente("Telefono : 0999524885","Nombre: Juan David Morales","Fecha Nacimiento: 07/05/2001");
     
        System.out.println(cli);
        JOptionPane.showMessageDialog(null, cli);
    }
    
}
