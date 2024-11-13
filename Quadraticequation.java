import java.util.Scanner;

class Coeff {
    double a;
    double b;
    double c;
}
public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Coeff coeff = new Coeff();

        System.out.println("Enter the coefficients of a, b, c:");

        System.out.print("Enter coefficient a: ");
        coeff.a = scanner.nextDouble();
        while (coeff.a == 0) {
            System.out.println("Not a quadratic equation. Please enter a non-zero value for a:");
            coeff.a = scanner.nextDouble();
        }

        System.out.print("Enter coefficient b: ");
        coeff.b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        coeff.c = scanner.nextDouble();

        double d = coeff.b * coeff.b - 4 * coeff.a * coeff.c;

        if (d == 0) {
            double r1 = -coeff.b / (2 * coeff.a);
            System.out.println("Roots are real and equal.");
            System.out.println("Root 1 and Root 2: " + r1);
        } else if (d > 0) {
            double r1 = (-coeff.b + Math.sqrt(d)) / (2 * coeff.a);
            double r2 = (-coeff.b - Math.sqrt(d)) / (2 * coeff.a);
            System.out.println("Roots are real and unique.");
            System.out.println("Root 1: " + r1);
            System.out.println("Root 2: " + r2);
        } else {
            double realPart = -coeff.b / (2 * coeff.a);
            double imaginaryPart = Math.sqrt(-d) / (2 * coeff.a);
            System.out.println("Roots are imaginary.");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
        scanner.close();
    }
}
