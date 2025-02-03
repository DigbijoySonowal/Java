import java.util.Scanner;

public class Method3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers.");
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();

        System.out.println("Sum: " +sum(a, b));

        Method3 val = new Method3();
        System.out.println("Multiply: "+val.mul(a,b));
    }

//    static method
    public static int sum(int a, int b){
        return a+b;
    }

//    instance method
    public int mul(int a, int b){
        return a*b;
    }
}
