import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("MENU - Escolha uma opção digitando o numero");
        System.out.println("=============================================");
        System.out.println("1. Média aritmética");
        System.out.println("2. Média ponderada");
        System.out.println("3. Sair");
        System.out.println("=============================================");

        Integer opcao = scanner.nextInt();

        if (opcao == 1) {

            System.out.println("Informe a nota 1:");
            Double nota1 = scanner.nextDouble();

            System.out.println("Informe a nota 2:");
            Double nota2 = scanner.nextDouble();

            Double media = (nota1 + nota2) / 2;

            System.out.printf("A média aritmética é: %.1f", media);

        } else if (opcao == 2) {

            System.out.println("Informe a nota 1:");
            Double nota1 = scanner.nextDouble();

            System.out.println("Informe a nota 2:");
            Double nota2 = scanner.nextDouble();
            nota2 = nota2 * 2;

            System.out.println("Informe a nota 3:");
            Double nota3 = scanner.nextDouble();
            nota3 = nota3 * 3;

            Double media = (nota1 + nota2 + nota3) / 5;

            System.out.printf("A média ponderada para os pesos 1, 2 e 3 respectivamente é: %.1f", media);

        } else if (opcao == 3) {
            System.out.println("Bye bye...");
        } else {
            System.out.println("Opção não encontrada.");
        }

    }

}