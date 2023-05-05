import java.util.Scanner;

public class physics {

    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the operation you want to perform:");
        System.out.println("1. Calculate Force");
        System.out.println("2. Calculate Work");
        System.out.println("3. Calculate Power");
        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                ForceCalculator forceCalculator = new ForceCalculator();
                forceCalculator.calculateForce();
                break;
            case 2:
                WorkCalculator workCalculator = new WorkCalculator();
                workCalculator.calculateWork();
                break;
            case 3:
                PowerCalculator powerCalculator = new PowerCalculator();
                powerCalculator.calculatePower();
                break;
            default:
                System.out.println("Invalid operation. Please enter a valid operation.");
        }
    }
}
