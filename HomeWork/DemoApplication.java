package com.example.demo;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import java.util.ArrayList;


public class DemoApplication {

	public static void main(String[] args) {
		ArrayList<UserDTO> m_users = new ArrayList<>();

		ClientConfig clientConfig = new DefaultClientConfig();

		Client client = Client.create(clientConfig);
		WebResource webResource = client.resource(UriBuilder.fromUri("http://jsonplaceholder.typicode.com/users/").build());
		String result =  webResource.path("").path("").accept(String.valueOf(MediaType.APPLICATION_JSON)).get(String.class);

		Gson gson = new Gson();
		JsonArray ja = JsonParser.parseString(result).getAsJsonArray();
		UserDTO[] users = gson.fromJson(ja, UserDTO[].class);

		for (int i = 0; i < 5; i++){
			m_users.add(users[i]);
		}
		m_users.forEach((n) -> System.out.println(n));
	}
}
