package question4;

import java.util.Scanner;

public class DCMotorSpeed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Voltage (V): ");
        double voltage = input.nextDouble();

        System.out.print("Enter Back EMF (V): ");
        double backEMF = input.nextDouble();

        System.out.print("Enter Motor Constant: ");
        double motorConstant = input.nextDouble();

        if (motorConstant <= 0) {
            throw new IllegalArgumentException("Motor constant must be positive.");
        }

        double speed = (voltage - backEMF) / motorConstant;

        if (speed < 0) {
            throw new IllegalArgumentException("Speed calculation resulted in a negative value, check inputs.");
        }

        System.out.println("Speed: " + speed + " RPM");
        input.close();
    }
}
