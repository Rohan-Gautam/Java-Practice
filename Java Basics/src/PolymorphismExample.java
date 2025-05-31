class MathOps {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        MathOps m = new MathOps();
        System.out.println(m.add(10, 20));
        System.out.println(m.add(10.5, 20.5));
    }
}
