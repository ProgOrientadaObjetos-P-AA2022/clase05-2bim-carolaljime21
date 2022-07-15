package paquete10;


public class APIDirectivGo implements APIMovie {
    private String apiKey;
    @Override
    public void establecerApiKey(String ak){
        apiKey = ak+"154263";
    }
    
    @Override
    public String obtenerApiKey(){
        return apiKey;
    }
    
}
