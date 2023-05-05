import java.util.Scanner;

public class PhysicsCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the operation you want to perform:");
        System.out.println("1. Calculate Force");
        System.out.println("2. Calculate Work");
        System.out.println("3. Calculate Power");
        System.out.println("4. Calculate K.E");
        System.out.println("5. Calculate P.E");
        int operation = scanner.nextInt();

        switch (operation) {
            case 1 -> {
                ForceCalculator forceCalculator = new ForceCalculator();
                forceCalculator.calculateForce();
            }
            case 2 -> {
                WorkCalculator workCalculator = new WorkCalculator();
                workCalculator.calculateWork();
            }
            case 3 -> {
                PowerCalculator powerCalculator = new PowerCalculator();
                powerCalculator.calculatePower();
            }
            case 4 -> {
                KineticEnergyCalculator kineticEnergyCalculator = new KineticEnergyCalculator();
                kineticEnergyCalculator.calculateKineticEnergy();
            }
            case 5 ->{
                PotentialEnergyCalculator potentialEnergyCalculator = new PotentialEnergyCalculator();
                potentialEnergyCalculator.calculatePotentialEnergy();
            }
            default -> System.out.println("Invalid operation. Please enter a valid operation.");
        }
    }
    }