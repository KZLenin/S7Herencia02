public class Pajaros02 extends Mascotas {
    String plumaje;
    double alturaMaxVuelo;

    public Pajaros02(String plumaje, double alturaMaxVuelo) {
        this.plumaje = plumaje;
        this.alturaMaxVuelo = alturaMaxVuelo;
    }

    public Pajaros02(String nombre, int edad, String color) {
        super(nombre, edad, color);
    }

    public void cantar(){
        System.out.println("Cantando en la mañana");
    }

    public void volar(){
        System.out.println("Volando por los aires");
    }

    public void mostrarDato(){
        System.out.println("Plumaje: " + plumaje);
        System.out.println("Altura: " + alturaMaxVuelo);
    }
}
