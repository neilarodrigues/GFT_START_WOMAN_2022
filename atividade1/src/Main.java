import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Escreva a primeira palavra:");
        String palavra1 = leitor.next();

        System.out.println("Escreva a segunda palavra:");
        String palavra2 = leitor.next();

        char[] arrPalavra1 = palavra1.toCharArray();
        char[] arrPalavra2 = palavra2.toCharArray();

        Arrays.sort(arrPalavra1);
        Arrays.sort(arrPalavra2);
        if (Arrays.equals(arrPalavra1, arrPalavra2)) {
            System.out.println("As palavras são anagramas!");
        } else {
            System.out.println("Não são anagramas!");
        }

    }
}
