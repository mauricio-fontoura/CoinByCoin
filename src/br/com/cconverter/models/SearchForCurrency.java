package br.com.cconverter.models;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;


public class SearchForCurrency{
	
	
	private String findCoin;
		
	
	
	public Exchange searchCurrency() throws IOException, InterruptedException {
		URI currency = URI.create("https://v6.exchangerate-api.com/v6/0b4a8e67fbefd9f5b5131a71/latest/" + findCoin);
		
		HttpClient client = HttpClient.newBuilder().build();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(currency)
				.build();
		HttpResponse<String> response = client
				.send(request, HttpResponse.BodyHandlers.ofString());
		String dbExchange = response.body().toLowerCase();
		
		Gson json = new Gson();
		 JsonObject objectJson = json.fromJson(dbExchange, JsonObject.class)
				 .getAsJsonObject("conversion_rates");
		
		 return json.fromJson(objectJson, Exchange.class);
	}
	
	public void setFindCoin( String findCoin) {
		this.findCoin = findCoin;
	}
}
