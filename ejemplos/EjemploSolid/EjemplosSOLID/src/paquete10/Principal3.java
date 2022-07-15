/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

/**
 *
 * @author UTPL
 */
public class Principal3 {
    
     public static void main(String[] args) {
        String nombreArchivo = "Generadores.data";
        
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        
        lectura.establecerGeneradores();
        System.out.println(lectura);

    }
    
}
