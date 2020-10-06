package bel.enavarrete.auto.Tools;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class ReadAPI {

    public  List<Map<String, String>>   MyGETRequest() throws IOException {
         List<Map<String, String>>  data = null;

        try {
            URL urlForGetRequest = new URL("https://jsonplaceholder.typicode.com/todos");
            String readLine = null;
            HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
            conection.setRequestMethod("GET");
            conection.setRequestProperty("userId", "a1bcdef"); // set userId its a sample here
            int responseCode = conection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(conection.getInputStream()));
                StringBuffer response = new StringBuffer();
                while ((readLine = in .readLine()) != null) {
                    response.append(readLine);
                } in .close();

               // System.out.println("JSON String Result " + response.toString());

                String json = response.toString();
                ObjectMapper mapper = new ObjectMapper();

                data = mapper.readValue(json, new TypeReference<List<Map<String, String>>>(){});



              //  System.out.println("JSON array to Array objects...");


            } else {
                System.out.println("GET NOT WORKED");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return data;
    }

}



