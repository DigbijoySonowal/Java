public class Scope {
    static int x = 5;

    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        System.out.println(Scope.x);
    }
}
