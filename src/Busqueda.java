
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Busqueda {
    public Divisas tasasDeCambio(String busqueda){;
        URI direccion = URI.create ("https://v6.exchangerate-api.com/v6/ed325266606150b5c27c329e/latest/" + busqueda);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Divisas.class);
        } catch (Exception e){
            throw new RuntimeException("No se encontró el tipo de moneda.");
        }
    }
}
