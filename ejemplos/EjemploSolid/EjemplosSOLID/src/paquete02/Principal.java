/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Persona e1 = new Persona("Carolina Alvarado", 18);
        Persona e2 = new Persona("Valentina Jimenez", 19);
        Persona e3 = new Persona("Fernanda Robles", 19);
        Persona e4 = new Persona("Diego Ortega", 20);

        ArrayList<Persona> est = new ArrayList<>();
        est.add(e1);
        est.add(e2);
        est.add(e3);
        est.add(e4);
        
        OperacionesEstudiantes opEst = new OperacionesEstudiantes();
        opEst.establecerEstudiante(est);
        opEst.establecerPromedioEdades();
        
        System.out.printf("%s\n", opEst);
        

    }
}
