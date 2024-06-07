package challenge.java.alura;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorAPI {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    private static final String API_KEY = "sua key"; // Substitua pela sua chave da API

    public Moedas BuscaMoedas(String moedaBase, String moedaDestino, double valor) {
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + moedaBase + "/" + moedaDestino);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(endereco).build();

        HttpResponse<String> response;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Não foi possível obter os dados da API.", e);
        }

        Moedas newMoedas = gson.fromJson(response.body(), Moedas.class);
        newMoedas.setConversion_result(newMoedas.getConversion_rate() * valor);
        return newMoedas;
    }
}
