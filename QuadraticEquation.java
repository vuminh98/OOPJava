import java.util.Scanner;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input value a: ");
        double a = input.nextDouble();
        System.out.print("Input value b: ");
        double b = input.nextDouble();
        System.out.print("Input value c: ");
        double c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        System.out.println("Delta = " + quadraticEquation.getDiscriminant());
        if (delta < 0) {
            System.out.println("The equation has no roots");
        } else if (delta == 0) {
            System.out.println("Equation has 2 roots same result are: " + quadraticEquation.getRoot2());
        } else {
            System.out.println("The first root of the equation is: " + quadraticEquation.getRoot1());
            System.out.println("The second root of the equation is: " + quadraticEquation.getRoot3());
        }
    }
    private QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return ((b * b) - (4 * a * c));
    }
    public double getRoot1() {
          return ((-b) - Math.sqrt(getDiscriminant()))/(2*a);
    }

    public double getRoot3() {
        return ((-b) + Math.sqrt(getDiscriminant()))/(2*a);
    }

    public double getRoot2() {
            return  ((-b) / (2*a));
    }
}

