import com.example.demo.UserDTO;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import org.junit.Test;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import static org.junit.Assert.assertEquals;

public class DemoApplicationTests {
    @Test
    public void test_get_by_1_jersey() {

        ClientConfig clientConfig = new DefaultClientConfig();
        Client client = Client.create(clientConfig);
        WebResource webResource =
                client.resource(UriBuilder.fromUri("http://jsonplaceholder.typicode.com/users/1").  build());
        String result =  webResource.path("").accept(String.valueOf(MediaType.APPLICATION_JSON)).get(String.class);

        Gson gson = new Gson();
        JsonObject jo = JsonParser.parseString(result).getAsJsonObject();
        UserDTO user = gson.fromJson(jo, UserDTO.class);

        assertEquals("Leanne Graham", user.name);
    }
}
