import java.util.Scanner;

public class test {

    public static ApiData callApi(String query) {
        // Simulate an API call
        System.out.println("Calling API with query: " + query);
        // In a real application, you would make an HTTP request to an API here.
        // For this example, we will return a hardcoded ApiData object.
        return new ApiData("INC-456", "456 Oak Ave", "This is a simulated API response for query: " + query);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your API query:");
        String userInput = scanner.nextLine();
        scanner.close();

        ApiData data = callApi(userInput);
        System.out.println(data);
    }
}
