public class Perros04 extends Mascotas {
    String raza;
    String nivelAdiestramiento;

    public Perros04(String nombre, int edad, String color, String raza, String nivelAdiestramiento) {
        super(nombre, edad, color);
        this.raza = raza;
        this.nivelAdiestramiento = nivelAdiestramiento;
    }

    public void ladrar() {
        System.out.println("Ladrando Guau Guau");
    }

    public void jugar(){
        System.out.println("Jugando con su pelota");
    }

    public void mostrarDato(){
        System.out.println("Raza: " + raza);
        System.out.println("Nivel de adiestramiento: " + nivelAdiestramiento);
    }
}
