import java.util.Scanner;

class ForceCalculator {

    public void calculateForce() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mass of the object (in kg):");
        double mass = scanner.nextDouble();
        System.out.println("Enter the acceleration of the object (in m/s^2):");
        double acceleration = scanner.nextDouble();
        double force = mass * acceleration;
        System.out.println("The force acting on the object is " + force + " N.");
    }
}

