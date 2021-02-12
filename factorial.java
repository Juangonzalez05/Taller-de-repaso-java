package com.mycompany.Factorial;

import java.util.ArrayList;
import javax.swing.JOptionPane;
public class factorial {


    public static void main(String[] args) {
       ArrayList<String> Ejemplo = new ArrayList<>();
       int x = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero"));
       int Factorial=1;

       String EjemploEjemplificado = "1";
       for(int i=2; i<=x; i++){
           Factorial = Factorial*i;
       }
       for(int i = 1;i<=x; i++){
           Ejemplo.add("" + i);
       }
       for(int i=1; i<x; i++){
           EjemploEjemplificado+= "x" + Ejemplo.get(i);
       }
            JOptionPane.showMessageDialog(null,"El Factorial de "+x+ " ! = "+EjemploEjemplificado+ "= " +Factorial);
 
    }

}