/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        // Prompt the user to enter the coefficients a, b, and c
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter the coefficients a, b, and c
            System.out.print("Enter the value of a: ");
            double a = scanner.nextDouble();
            
            System.out.print("Enter the value of b: ");
            double b = scanner.nextDouble();
            
            System.out.print("Enter the value of c: ");
            double c = scanner.nextDouble();
            
            // Calculate the discriminant
            double discriminant = b * b - 4 * a * c;
            
            // Check the nature of the discriminant
            if (discriminant > 0) {
                // Two distinct real roots
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("The roots are real and distinct:");
                System.out.println("Root 1: " + root1);
                System.out.println("Root 2: " + root2);
            } else if (discriminant == 0) {
                // One real root (repeated)
                double root = -b / (2 * a);
                System.out.println("The root is real and repeated:");
                System.out.println("Root: " + root);
            } else {
                // Complex roots
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                System.out.println("The roots are complex:");
                System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
                System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
            }
        }
    }
}

    

