public class Gatos05 extends Mascotas {
    String raza;
    String tipo;

    public Gatos05(String raza, String tipo) {
        this.raza = raza;
        this.tipo = tipo;
    }

    public Gatos05() {
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void maullar(){
        System.out.println("Maullando miau miau");
    }

    public void ronronear(){
        System.out.println("Ronroneando contento");
    }

    public void mostrarDato(){
        System.out.println("Raza: " + raza);
        System.out.println("Tipo: " + tipo);
    }
}
