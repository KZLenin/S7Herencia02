public class Tortugas01 extends Mascotas {
    String habitat;
    String tamanio;

    public Tortugas01(String habitat, String tamanio) {
        this.habitat = habitat;
        this.tamanio = tamanio;
    }

    public Tortugas01() {
    }

    public void nadar(){
        System.out.println("Nadando en el agua");
    }

    public void esconderse(){
        System.out.println("Escondido en el caparazon");
    }

    public void mostrarDato(){
        System.out.println("Habitat: " + habitat);
        System.out.println("Tamaño: " + tamanio);
    }
}
