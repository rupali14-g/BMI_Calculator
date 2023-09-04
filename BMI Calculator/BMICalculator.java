import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weightKg = scanner.nextDouble();

        System.out.print("Enter your height in centimeters: ");
        double heightCm = scanner.nextDouble();

        // Convert height from cm to meters
        double heightM = heightCm / 100.0;

        double bmi = calculateBMI(weightKg, heightM);

        System.out.println("Your BMI is: " + bmi);
        interpretBMI(bmi);

        scanner.close();
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static void interpretBMI(double bmi) {
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 24.9) {
            System.out.println("Normal weight");
        } else if (bmi < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
