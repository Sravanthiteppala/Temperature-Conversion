import java.util.Scanner;

/**
 * A self-contained, professional Temperature Converter application.
 * Perfect for a quick GitHub repository upload.
 */
public class TemperatureConverterApp {

    // =========================================================================
    // 1. CORE LOGIC (Utility Methods)
    // =========================================================================
    
    /**
     * Converts Celsius to Fahrenheit.
     * Formula: (C * 9/5) + 32
     */
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Converts Fahrenheit to Celsius.
     * Formula: (F - 32) * 5/9
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // =========================================================================
    // 2. USER INTERFACE & APPLICATION ENTRY POINT
    // =========================================================================
    public static void main(String[] args) {
        // Try-with-resources ensures the scanner closes automatically, preventing leaks
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Professional Temperature Converter ===");
            
            while (true) {
                System.out.println("\nSelect an option:");
                System.out.println("1. Celsius to Fahrenheit");
                System.out.println("2. Fahrenheit to Celsius");
                System.out.println("3. Exit");
                System.out.print("Enter choice (1-3): ");

                String choice = scanner.next();

                // Handle Application Exit
                if (choice.equals("3")) {
                    System.out.println("Thank you for using the Temperature Converter. Goodbye!");
                    break;
                }

                // Menu Selection Validation
                if (!choice.equals("1") && !choice.equals("2")) {
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    continue;
                }

                System.out.print("Enter the temperature value to convert: ");
                
                // Numeric Input Validation
                if (!scanner.hasNextDouble()) {
                    System.out.println("Error: Please enter a valid decimal number.");
                    scanner.next(); // Discard the invalid input token
                    continue;
                }

                double inputTemp = scanner.nextDouble();
                
                // Perform Conversion and Print Formatted Results
                if (choice.equals("1")) {
                    double result = celsiusToFahrenheit(inputTemp);
                    System.out.printf("Result: %.2f°C is equal to %.2f°F\n", inputTemp, result);
                } else {
                    double result = fahrenheitToCelsius(inputTemp);
                    System.out.printf("Result: %.2f°F is equal to %.2f°C\n", inputTemp, result);
                }
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
