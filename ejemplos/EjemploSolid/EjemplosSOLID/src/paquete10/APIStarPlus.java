package paquete10;

public class APIStarPlus implements APIMovie {

    private String apiKey;

    @Override
    public void establecerApiKey(String c) {
        apiKey = c + "658465";
    }

    @Override
    public String obtenerApiKey() {
        return apiKey;
    }

    public String toSting() {
        return String.format("Star PLus: , %s", obtenerApiKey());
    }
}
