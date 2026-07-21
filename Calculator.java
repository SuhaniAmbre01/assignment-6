import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Simple Java Calculator ===");
    
        System.out.print("Enter the first number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: Invalid numeric input.");
            return;
        }
        double num1 = scanner.nextDouble();
        
        System.out.print("Choose an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Enter the second number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: Invalid numeric input.");
            return;
        }
        double num2 = scanner.nextDouble();
        
        double result;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.printf("Result: %.2f + %.2f = %.2f%n", num1, num2, result);
                break;
                
            case '-':
                result = num1 - num2;
                System.out.printf("Result: %.2f - %.2f = %.2f%n", num1, num2, result);
                break;
                
            case '*':
                result = num1 * num2;
                System.out.printf("Result: %.2f * %.2f = %.2f%n", num1, num2, result);
                break;
                
            case '/':
               
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.printf("Result: %.2f / %.2f = %.2f%n", num1, num2, result);
                }
                break;
                
            default:
                System.out.println("Error: Invalid operator chosen.");
                break;
        }
        scanner.close();
    }
}

