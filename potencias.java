package com.mycompany.potencias;

import javax.swing.JOptionPane;
public class potencias {


    public static void main(String[] args) {

        int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor"));
        int d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la potencia"));
        int Contador = c;
        int Solucion=0;

        for(int i= 1; i<=d; i++){
            int Q = 0;
            for(int z = 1; z<=Contador; z++){
                Q = Q + c;
            }
            Solucion = c;
            c = Q;

        }

        JOptionPane.showMessageDialog(null,"el resultado de la potencia es  " + Solucion);


    }

}