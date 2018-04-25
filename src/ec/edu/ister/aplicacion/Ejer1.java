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
public class Ejer1 {
    public static void main(String[] args) {
        //Ejercicioo numero 20
        //Calcule la nota final que ha obtenido un alumnoen el curso de programacion avanzada.
        //Utilice la siguiente formula nf = (n1 + n2 + n3 + ( n4 * 2 ))/5 Ingrese las notas por teclado
        int n1,n2,n3,n4,nf;
        n1=Integer.parseInt(JOptionPane.showInputDialog("ingrese nota 1:"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("ingrese nota 2:"));
        n3=Integer.parseInt(JOptionPane.showInputDialog("ingrese nota 3:"));
        n4=Integer.parseInt(JOptionPane.showInputDialog("ingrese nota 4:"));
        
        nf = (n1 + n2 + n3 + ( n4 * 2 ))/5;
        
        JOptionPane.showMessageDialog(null, "La Nota Final es: "+ nf);

    }
    
}
