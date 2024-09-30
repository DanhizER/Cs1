package taller_ab;

public class Nodo {
    private Nodo der;
    private Nodo izq;
    private Estudiante Dato; 

    public Nodo(Estudiante Key) {
        this.der = null;
        this.izq = null;
        this.Dato = Key;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Estudiante getDato() {
        return Dato;
    }

    public void setDato(Estudiante Dato) {
        this.Dato = Dato;
    }

      
}
