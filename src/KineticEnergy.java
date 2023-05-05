import java.util.Scanner;

class KineticEnergyCalculator {

    public void calculateKineticEnergy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mass of the object (in kg):");
        double mass = scanner.nextDouble();
        System.out.println("Enter the velocity of the object (in m/s):");
        double velocity = scanner.nextDouble();
        double kineticEnergy = 0.5 * mass * velocity * velocity;
        System.out.println("The kinetic energy of the object is " + kineticEnergy + " J.");
    }
}
