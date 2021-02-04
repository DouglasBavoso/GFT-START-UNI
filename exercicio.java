import java.util.Scanner;

public class exercicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("A = ");
        double A = Double.parseDouble(sc.nextLine());

        System.out.print("B = ");
        double B = Double.parseDouble(sc.nextLine());

        System.out.print("C = ");
        double C = Double.parseDouble(sc.nextLine());

        double delta = (Math.pow(B, 2) - 4 * A * C);

        if (delta == 0 || delta < 0) {
            System.out.println("Impóssivel fazer esse cálculo");
        }

        double x1 = (-B + Math.sqrt(delta)) / (2 * A);
        double x2 = (-B - Math.sqrt(delta)) / (2 * A);


        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);

    }

}