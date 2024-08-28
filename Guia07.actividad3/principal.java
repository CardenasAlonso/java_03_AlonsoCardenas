package Guia07.actividad3;

import javax.swing.JOptionPane;

public class principal {

    public static void main(String[] args) {
        
        operacion op = new operacion();
        
        int A = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        int B = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
        
        op.suma(A,B);
        op.resta(A,B);
        op.mult(A,B);
        op.mostrarDatos();
    }
    
}
