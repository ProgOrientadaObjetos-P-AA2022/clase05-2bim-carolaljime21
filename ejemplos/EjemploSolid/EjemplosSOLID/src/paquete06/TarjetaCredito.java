/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author SALAI
 */
public class TarjetaCredito {
    
    private String nombre;  
    private String codigo;
    private double cuposMax;
    
    public TarjetaCredito(String n, String c, double cp){
        nombre = n;
        codigo = c;
        cuposMax = cp;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerCodigo(String c){
        codigo = c;
    }
    
    public void establecerCuposMax(double x){
        cuposMax = x;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerCodigo(){
        return codigo;
    }
    
    public double obtenerCuposMax(){
        return cuposMax;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("\n\t\tNombre: %s\n"
                + "\t\tCodigo: %s\n"
                + "\t\tCupos Maximo: %.2f\n",
                obtenerNombre(),
                obtenerCodigo(),
                obtenerCuposMax());
        return cadena;
    }
    
}
