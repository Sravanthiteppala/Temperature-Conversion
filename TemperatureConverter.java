import java.util.Scanner;
public class TemperatureConverter {
   // Conversion methods
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    public static double celsiusToKelvin(double c) {
        return c + 273.15;
    }
    public static double kelvinToCelsius(double k) {
        return k - 273.15;
    }
    public static double fahrenheitToKelvin(double f) {
        return celsiusToKelvin(fahrenheitToCelsius(f));
    }
    public static double kelvinToFahrenheit(double k) {
        return celsiusToFahrenheit(kelvinToCelsius(k));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🌡️ Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Choose an option (1-6): ");
        int choice = sc.nextInt();
        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();
        switch (choice) {
            case 1:
                System.out.printf("%.2f °C = %.2f °F%n", temp, celsiusToFahrenheit(temp));
                break;
            case 2:
                System.out.printf("%.2f °F = %.2f °C%n", temp, fahrenheitToCelsius(temp));
                break;
            case 3:
                System.out.printf("%.2f °C = %.2f K%n", temp, celsiusToKelvin(temp));
                break;
            case 4:
                System.out.printf("%.2f K = %.2f °C%n", temp, kelvinToCelsius(temp));
                break;
            case 5:
                System.out.printf("%.2f °F = %.2f K%n", temp, fahrenheitToKelvin(temp));
                break;
            case 6:
                System.out.printf("%.2f K = %.2f °F%n", temp, kelvinToFahrenheit(temp));
                break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
}
