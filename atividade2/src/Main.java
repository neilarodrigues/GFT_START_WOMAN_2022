import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double ax2;
        double bx;
        double c;
        double delta;
        double x1;
        double x2;

        System.out.println("Informe o valor de ax2:");
        ax2 = scanner.nextDouble();

        System.out.println("Informe o valor de bx:");
        bx = scanner.nextDouble();

        System.out.println("Informe o valor de c:");
        c = scanner.nextDouble();

        delta = (bx * bx) - (4 * ax2 * c);

        if (delta < 0) {
            System.out.println("Delta negativo. Não é possível calcular");
        } else {

            x1 = ((-1 * bx) + Math.sqrt(delta)) / (2 * ax2);
            x2 = ((-1 * bx) - Math.sqrt(delta)) / (2 * ax2);

            System.out.println("========================");
            System.out.println("Resultado");
            System.out.print("X' = ");
            System.out.printf("%.5f", x1);
            System.out.print("\nX\" = ");
            System.out.printf("%.5f", x2);
            System.out.print("\n");

        }

    }
}
