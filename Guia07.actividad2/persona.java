package Guia07.actividad2;

public class persona {
    
    //Atributos
    String nombre = "alonso";
    String apellido = "cardenas";
    int edad = 16;
    Double altura = 160.2;
    String direccion = "imperial";
    String deporte = "basquet";
    String comida = "casi todo";
    
    //Metodos
    public void presentarse() {
        System.out.println("Yo me llamo "+nombre+"\n"+
                            "Me apellido "+apellido+"\n"+
                            "Tengo "+edad+" años"+"\n"+
                            "Y mido "+altura+" cm");
    }
    
    public void prefrencias() {
        System.out.println("Yo vivo en "+direccion+"\n"+
                            "mi deporte favorito es el "+deporte+"\n"+
                            "mi comida favorita es "+comida);
    }
}
