public class test {
    public static void main(String[] args) {
        String apiKey = System.getenv("API_KEY");
        if (apiKey != null) {
            System.out.println("API Key: " + apiKey);
        } else {
            System.out.println("API Key not found.");
        }
    }
}
