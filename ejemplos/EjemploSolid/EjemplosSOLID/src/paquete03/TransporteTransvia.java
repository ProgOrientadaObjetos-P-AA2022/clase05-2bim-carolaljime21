package paquete03;

public class TransporteTransvia {
    
    private String cooperativaTransvia;
    private double tarifa;
    
    public void establecerCooperativaTransvia(String n){
        cooperativaTransvia = n;
    }
    
    public void establecerTarifa(){
        tarifa = 0.50 + (0.50*0.5);
    }
    
    public String obtenerCooperativaTaxi(){
        return cooperativaTransvia;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
}
