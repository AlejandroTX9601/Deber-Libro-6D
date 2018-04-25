/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.aplicacion;

import javax.swing.JOptionPane;

/**
 *
 * @author PANCHI
 */
public class Ejer4 {
    public static void main(String[] args) {
  // Desarrollar una solucion que permita mostrar los mensajes "Feliz cumpleaños","Hoy sera un buen dia" y "Felices fiestas Patrias".
 // Utilice las constante de caracter de barra invertida "\n" y "\t" de los lenguajes de programacion para mejorar la forma como se muestra la informacion
 String msj1= " Feliz cumpleaños\n ";
    String msj2 = "Hoy será un buen dia ";
    String msj3 = "\nFelices Fiestas Patrias";
        JOptionPane.showMessageDialog(null , msj1 + " " + msj2 + " " + "\ty"  +  msj3);
    }
    
}
