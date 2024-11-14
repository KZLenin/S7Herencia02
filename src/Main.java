public class Main {
    public static void main(String[] args) {
        System.out.println("--------------Primera Clase------------");
        Tortugas01 tortuga = new Tortugas01();
        tortuga.nadar();
        tortuga.esconderse();
        tortuga.mostrarDato();
        tortuga.mostrarDatos();

        System.out.println("--------------------Segunda Clase----------------------");
        Pajaros02 pajaro = new Pajaros02("Piolin",8, "Verde multicolor");
        pajaro.cantar();
        pajaro.volar();
        pajaro.mostrarDato();
        pajaro.mostrarDatos();

        System.out.println("-----------------Tercera Clase---------------");
        Conejos03 conejo = new Conejos03("Corto", "Cabeza de Leon");
        conejo.salto();
        conejo.roer();
        conejo.mostrarDato();
        conejo.mostrarDatos();

        System.out.println("---------------Cuarta Clase-------------");
        Perros04 perro = new Perros04("Firulais", 24, "Blanco y negro","Pug", "Basico");
        perro.ladrar();
        perro.jugar();
        perro.mostrarDato();
        perro.mostrarDatos();

        System.out.println("--------------Quinta Clase-------------");
        Gatos05 gato = new Gatos05();
        gato.maullar();
        gato.ronronear();
        gato.setRaza("Siamez");
        gato.setTipo("De casa");
        gato.setColor("Naranja");
        gato.setEdad(18);
        gato.setNombre("Mango");
        gato.mostrarDato();
        gato.mostrarDatos();
    }
}