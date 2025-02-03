import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int b = scanner.nextInt();
            System.out.println(a+" / "+b+" = " +a/b);
        } catch (ArithmeticException e) {
            System.out.println("Please enter a value greater than 0. \n");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer. \n");
            e.printStackTrace();
        }
        finally {
            scanner.close();
        }
    }
}