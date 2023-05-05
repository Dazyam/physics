import java.util.Scanner;

class KineticCalculator {

    public void calculateKineticenergy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mass acting on the object (in kg):");
        double mass = scanner.nextDouble();
        System.out.println("Enter the velocity of the object (in ms):");
        double velocity = scanner.nextDouble();
        double kineticenergy = mass * velocity * 0.5;
        System.out.println("The kinetic energy of the object is " + kineticenergy + " J.");
    }
}