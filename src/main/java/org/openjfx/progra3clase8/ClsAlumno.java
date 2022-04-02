package org.openjfx.progra3clase8;

/**
 *
 * @author jeant
 */
public class ClsAlumno {
    public String carnet;
    public String nombre;
    public double promedio;

    public ClsAlumno(String carnet, String nombre, double promedio) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno [ " + this.carnet + " | " + this.nombre + " | " + this.promedio + " ]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ClsAlumno)) return false;
        ClsAlumno tmpAlumno = (ClsAlumno) obj;
        return this.carnet.equals(tmpAlumno.carnet) && this.nombre.equals(tmpAlumno.nombre);
    }
}
