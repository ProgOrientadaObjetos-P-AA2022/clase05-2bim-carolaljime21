/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    // private double edadminima;

    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma = suma + e.obtenerEdad();
        }
        promedioEdades = suma / obtenerEstudiante().size();
    }

    public double obtenerPromedioEdades() {

        return promedioEdades;
    }

    @Override
    public String toString() {
        String cadena = String.format("Lista estudiantes \n");
        for (Persona est : obtenerEstudiante()) {
            cadena = String.format("%s"
                    + "Nombre: %s\n: ",
                    cadena,
                    est.obtenerNombre());
        }
        cadena = String.format("%s"
                + "Promedio edades: %.2f\n",
                cadena,
                obtenerPromedioEdades());

        return cadena;
    }
}
