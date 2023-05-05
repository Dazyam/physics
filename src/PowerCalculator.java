import java.util.Scanner;

class PowerCalculator {

    public void calculatePower() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the work done on the object (in J):");
        double work = scanner.nextDouble();
        System.out.println("Enter the time taken to do the work (in s):");
        double time = scanner.nextDouble();
        double power = work / time;
        System.out.println("The power output is " + power + " W.");
    }
}