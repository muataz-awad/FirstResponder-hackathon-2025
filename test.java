import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class test {
    public static void main(String[] args) {
        String apiKey = System.getenv("API_KEY");
        if (apiKey != null) {
            try {
                // Create a URL object with the API endpoint
                URL url = new URL("https://newsdata.io/api/1/latest?apikey=" + apiKey + "&q=pizza");

                // Open a connection to the URL
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("GET");

                // Read the response from the server
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                in.close();

                // Print the response
                System.out.println(content.toString());

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("API Key not found.");
        }
    }
}
