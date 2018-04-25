/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.aplicacion;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Ejer5 {
    public static void main(String[] args) {
        //Ejercicio 17
        int baldesA,baldesB,baldesC;
        int tiempoA,tiempoB,tiempoC,tiempoTotal;
        int horas,minutos,segundos;
        baldesA=Integer.parseInt(JOptionPane.showInputDialog("ingrese cuantos baldes Tipo A se van hacer:"));
        baldesB=Integer.parseInt(JOptionPane.showInputDialog("ingrese cuantos baldes Tipo B se van hacer:"));
        baldesC=Integer.parseInt(JOptionPane.showInputDialog("ingrese cuantos baldes Tipo C se van hacer:"));
        
        tiempoA = baldesA * 15;
        tiempoB = baldesB * 15;
        tiempoC = baldesC * 62;
        tiempoTotal = tiempoA +tiempoB + tiempoC;
        horas = tiempoTotal / 3600;
        minutos = tiempoTotal % 3600 / 60;
        segundos = tiempoTotal % 3600 % 60;
        
        JOptionPane.showMessageDialog(null, "El Tiempo de los baldes tipo A,B,C es: "+ tiempoTotal);
    }
    
}
