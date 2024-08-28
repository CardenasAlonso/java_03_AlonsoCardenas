package Guia07.actividad5;

public class perro {

    String nombre, raza;
    int edad;

    public perro(String nombre) {
        this.nombre = nombre;
    }

    public perro(String raza, int edad) {
        this.raza = raza;
        this.edad = edad;
    }

    public void mostrarDatos1() {
        System.out.println("El perro se llama: " + nombre);
    }
    
    public void mostrarDatos2() {
        System.out.println("El perro es de raza: " + raza);
        System.out.println("tiene " + edad + " años");
               
    }
}
