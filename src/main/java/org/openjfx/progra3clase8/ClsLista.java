package org.openjfx.progra3clase8;

public class ClsLista<T> {
    public Nodo<T> primero;

    public ClsLista(T dato) {
        primero = new Nodo<T>(dato, primero);
    }
    
    public ClsLista<T> insertarCabezaLista(T entrada) {
        Nodo<T> nuevo;
        nuevo = new Nodo<T>(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
        return this;
    }
    
    public ClsLista<T> insertarUltimoLista(T entrada) {
        Nodo<T> ultimo = buscarCola();
        ultimo.enlace = new Nodo<T>(entrada);
        ultimo = ultimo.enlace;
        return this;
    }
    
    public ClsLista<T> insertarLista(T valorBuscarInsertar, T entrada) {
        Nodo<T> nuevo, anterior;
        anterior = buscarLista(valorBuscarInsertar);
        if (anterior != null) {
            nuevo = new Nodo<T>(entrada);
            nuevo.enlace = anterior.enlace;
            anterior.enlace = nuevo;
        }
        return this;
    }

    public Nodo<T> buscarCola() {
        Nodo<T> actual = this.primero;
        while(actual != null && actual.getEnlace() != null) {
            actual = actual.getEnlace();
        }
        return actual;
    }
    
    public Nodo<T> buscarLista(T objetoBuscar) {
        Nodo<T> indice;
        for (indice = primero; indice != null; indice = indice.enlace) {
            if (indice.getDato().equals(objetoBuscar)) {
                return indice;
            }
        }
        return null;
    }
    

    public Nodo<T> buscarPosicion(int posicion) {
        Nodo<T> indice;
        int i;
        if (posicion < 0) return null;
        indice = primero;
        for (i = 1; (i < posicion) && (indice != null); i++) {
            indice = indice.enlace;
        }
        return indice;
    }

    public void eliminar(T entrada) {
        Nodo<T> actual, anterior;
        boolean encontrado;
        actual = primero;
        anterior = null;
        encontrado = false;
        while ((actual != null) && (!encontrado)) {
            encontrado = actual.getDato().equals(entrada);
            if (!encontrado) {
                anterior = actual;
                actual = actual.enlace;
            }
        }
        if (actual != null) {
            if (actual == primero) {
                primero = actual.enlace;
            } else {
                anterior.enlace = actual.enlace;
            }
            actual = null;
        }
    }
    
    public void visualizar() {
        Nodo<T> n;
        int k = 0;
        n = primero;
        while (n != null) {
            System.out.println(n.getDato().toString() + " ");
            n = n.enlace;
            k++;
            System.out.print(k % 15 != 0 ? " " : "\n");
        }
    }
    
}
