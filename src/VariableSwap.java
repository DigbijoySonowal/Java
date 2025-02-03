package variables;

public class VariableSwap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a += b;
        System.out.println(a);
        b = a - b;
        System.out.println(b);
        a -= b;
        System.out.println(a);
    }
}
