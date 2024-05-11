import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the currency (USD, EUR, JPY, INR): ");
        String currency = scanner.next();

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        double convertedAmount = 0.0;

        switch (currency.toUpperCase()) {
            case "USD":
                convertedAmount = amount * 0.014; // Convert to dollars
                break;
            case "EUR":
                convertedAmount = amount * 0.012; // Convert to euros
                break;
            case "JPY":
                convertedAmount = amount * 1.54; // Convert to yen
                break;
            case "INR":
                convertedAmount = amount * 1.0; // No conversion needed for rupee
                break;
            default:
                System.out.println("Invalid currency choice.");
                return;
        }

        System.out.println("Converted amount: " + convertedAmount);
    }
}