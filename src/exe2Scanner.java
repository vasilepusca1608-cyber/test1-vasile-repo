import java.util.Scanner;

public class exe2Scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Introdu primul numar: ");
        int numar1 = input.nextInt();

        System.out.println("Introdu doilea numar: ");
        int numar2 = input.nextInt();

        int rezultat = numar1 * numar2;
        System.out.println("Rezultatul final: "+rezultat);
    }
}
