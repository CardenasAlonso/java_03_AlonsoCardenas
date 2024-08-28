package Guia07.actividad3;

public class operacion {
    
    //Atributos
    int suma, resta, mult;

    //Métodos
    public int suma(int a, int b) {
        this.suma = a + b;
        return this.suma;
    }

    public int resta(int a, int b) {
        this.resta = a - b;
        return this.resta;
    }

    public int mult(int a, int b) {
        this.mult = a * b;
        return this.mult;
    }
    
    public  void mostrarDatos() {
        System.out.println("La suma es: "+suma+"\n"+
                            "La resta es: "+resta+"\n"+
                            "La multiplicacion es: "+mult);
    }
}
