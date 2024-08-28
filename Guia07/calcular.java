package Guia07.actividad4;

public class calcular {

    //Atributos
    int suma, resta, mult;

    //Métodos
    public void suma(int a, int b) {
        suma = a + b;
    }

    public void resta(int a, int b) {
        resta = a - b;
    }

    public void mult(int a, int b) {
        mult = a * b;
    }

    public void mostrarDatos() {
        System.out.println("La suma es: " + suma + "\n"
                + "La resta es: " + resta + "\n"
                + "La multiplicacion es: " + mult);
    }
}
