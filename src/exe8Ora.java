import java.util.Scanner;

public class exe8Ora {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduceti ora :");
        int ora = input.nextInt();

        if (ora >= 0 && ora < 6) {
            System.out.println("Este prima parte a zilei noaptea.");
        } else if (ora >= 6 && ora < 12) {
            System.out.println("Este a doua parte a zilei dimineata.");
        } else if (ora >= 12 && ora < 18) {
            System.out.println("Este a treia parte a zile dupa-amiaza.");
        } else if (ora >= 18 && ora < 24) {
            System.out.println("Este a patra parte a zilei seara.");
        }

    }
}
