package com.example.demo;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);

		String user_json = "{ \"Id\": 1,\n" +
				"  \"Name\": \"Leanne Graham\",\n" +
				"  \"Username\": \"Bret\",\n" +
				"  \"Email\": \"Sincere@april.biz\" }";

		String company_json = "{ \"Name\": \"Romaguera-Crona\",\n" +
				"    \"CatchPhrase\": \"Multi-layered client-server neural-net\",\n" +
				"    \"Bs\": \"harness real-time e-markets\"}";
		Gson gson = new Gson();
		JsonObject jo = JsonParser.parseString(user_json).getAsJsonObject();
		UserDTO u = gson.fromJson(jo, UserDTO.class);
		CompanyDTO c = gson.fromJson(jo, CompanyDTO.class);
		System.out.println(u);
		System.out.println(c);

		UserDTO u2 = new UserDTO(2, "Marizza", "mmil", "marizza.mil90@gmail.com");
		CompanyDTO c2 = new CompanyDTO("bla", "blabla", "blablabla");
		System.out.println(gson.toJson(u2));
		System.out.println(gson.toJson(c2));
	}
}
