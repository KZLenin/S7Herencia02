public class Conejos03 extends Mascotas {
    String pelaje;
    String raza;

    public Conejos03(String pelaje, String raza) {
        this.pelaje = pelaje;
        this.raza = raza;
    }

    public void salto(){
        System.out.println("Saltando alegremente");
    }
    public void roer(){
        System.out.println("Royendo una zanahoria");
    }

    public void mostrarDato(){
        System.out.println("Pelaje: " + pelaje);
        System.out.println("Raza: " + raza);
    }
}
