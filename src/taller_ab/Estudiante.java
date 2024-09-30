package taller_ab;

public class Estudiante {
    private String Nombre;
    private int CodigoUnico;
    private int Edad;

    public Estudiante(int CodigoUnico,String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.CodigoUnico = CodigoUnico;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCodigoUnico() {
        return CodigoUnico;
    }

    public void setCodigoUnico(int CodigoUnico) {
        this.CodigoUnico = CodigoUnico;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "Nombre=" + Nombre + ", CodigoUnico=" + CodigoUnico + ", Edad=" + Edad + '}';
    }
    
    
    
}
