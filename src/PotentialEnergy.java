import java.util.Scanner;

class PotentialEnergyCalculator {

    public void calculatePotentialEnergy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mass of the object (in kg):");
        double mass = scanner.nextDouble();
        System.out.println("Enter the height of the object (in m):");
        double height = scanner.nextDouble();
        double potentialEnergy = 9.81 * mass * height;
        System.out.println("The potential energy of the object is " + potentialEnergy + " J.");
    }
}