import java.util.Scanner;

class WorkCalculator {

    public void calculateWork() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the force acting on the object (in N):");
        double force = scanner.nextDouble();
        System.out.println("Enter the displacement of the object (in m):");
        double displacement = scanner.nextDouble();
        double work = force * displacement;
        System.out.println("The work done on the object is " + work + " J.");
    }
}
