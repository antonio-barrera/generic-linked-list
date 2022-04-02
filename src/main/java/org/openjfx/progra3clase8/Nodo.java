package org.openjfx.progra3clase8;

public class Nodo<T> {
    T dato;
    Nodo<T> enlace;

    public Nodo(T dato) {
        this.dato = dato;
        enlace = null;
    }

    public Nodo(T dato, Nodo<T> n) {
        this.dato = dato;
        enlace = n;
    }

    public T getDato() {
        return this.dato;
    }

    public Nodo<T> getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo<T> enlace) {
        this.enlace = enlace;
    }
}
