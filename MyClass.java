public class MyClass {
    static int add(int a, int b) {
        return a + b;
    }
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 10));       // int version
        System.out.println(add(5.5, 6.5));    // double version
    }
}
