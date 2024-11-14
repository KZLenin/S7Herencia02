public class Mascotas{
    String nombre;
    int edad;
    String color;

    public Mascotas(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    public Mascotas() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " meses");
        System.out.println("Color: " + color);
    }
}
