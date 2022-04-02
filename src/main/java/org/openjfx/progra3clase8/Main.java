/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openjfx.progra3clase8;

/**
 *
 * @author jeant
 */
public class Main {
    public static void main(String[] args) {
        
        ClsLista<ClsAlumno> lista = new ClsLista<>(new ClsAlumno("465", "Antonio", 89.45));

        //LLENAR LISTA
        lista.insertarCabezaLista(new ClsAlumno("354", "Carlos", 79.35));        
        lista.insertarCabezaLista(new ClsAlumno("657", "Daniela", 65.10));
        lista.insertarCabezaLista(new ClsAlumno("835", "Linda", 85.50));
        lista.insertarCabezaLista(new ClsAlumno("254", "Jesus", 55.46));
        lista.insertarCabezaLista(new ClsAlumno("467", "Pamela", 69.57));
        lista.insertarCabezaLista(new ClsAlumno("765", "Juan", 48.54));
        lista.insertarCabezaLista(new ClsAlumno("276", "Jimena", 59.37));
        lista.insertarCabezaLista(new ClsAlumno("945", "Daniel", 66.75));
        lista.insertarCabezaLista(new ClsAlumno("234", "Rosa", 92.43));
        System.out.println("\n--------------------------------------------");
        System.out.println("*** LISTA INICIAL ***");
        lista.visualizar();
        
        //INSERTAR CABEZA
        ClsAlumno alumnoInsertarCabeza = new ClsAlumno("987", "Maria", 88.55);
        System.out.println("\n--------------------------------------------");
        lista.insertarCabezaLista(alumnoInsertarCabeza);
        System.out.println("*** INSERTAR EN CABEZA A "+ alumnoInsertarCabeza.nombre +" ***");
        lista.visualizar();

        //INSERTAR COLA
        ClsAlumno objetoInsertarCola = new ClsAlumno("376", "Eduardo", 78.87);
        lista.insertarUltimoLista(objetoInsertarCola);
        System.out.println("\n--------------------------------------------");
        System.out.println("*** INSERTAR EN COLA A "+ objetoInsertarCola.nombre +" ***");
        lista.visualizar();

        //INSERTAR ENMEDIO
        ClsAlumno objetoAnterior = new ClsAlumno("835", "Linda", 85.50);
        ClsAlumno objetoInsertarEnmedio = new ClsAlumno("254", "Victor", 77.45);
        lista.insertarLista(objetoAnterior, objetoInsertarEnmedio);
        System.out.println("\n--------------------------------------------");
        System.out.println("*** INSERTAR LUEGO DE "+ objetoAnterior.nombre +" A "+ objetoInsertarEnmedio.nombre +" ***");
        lista.visualizar();

        //BUSCAR NOMBRE
        ClsAlumno objetoBuscar = new ClsAlumno("657", "Daniela", 65.10);
        Nodo<ClsAlumno> objetoEncontrado = lista.buscarLista(objetoBuscar);
        System.out.println("\n--------------------------------------------");
        System.out.println("*** BUSCAR A "+ objetoBuscar.nombre +" ***");
        System.out.println(objetoEncontrado.getDato().toString());

        //BUSCAR POSICION
        int posicionBuscar = 4;
        Nodo<ClsAlumno> posicionEncontra = lista.buscarPosicion(posicionBuscar);
        System.out.println("\n--------------------------------------------");
        System.out.println("*** BUSCAR EN POSICION "+ posicionBuscar +" ***");
        System.out.println(posicionEncontra.getDato().toString());

        //ELIMINAR
        ClsAlumno alumnoEliminar = new ClsAlumno("254", "Jesus", 55.46);
        lista.eliminar(alumnoEliminar);
        System.out.println("\n--------------------------------------------");
        System.out.println("*** ELIMINAR A "+ alumnoEliminar.nombre +" ***");
        lista.visualizar();
    }
}
