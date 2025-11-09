import java.util.Scanner;

public class exe4MareMic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce primul numar: ");
        int numar1 = input.nextInt();
        System.out.println("Introduce al doilea numar: ");
        int numar2 = input.nextInt();

        if (numar1 > numar2) {
            System.out.println("Numarul este mai mare: " + numar1);
            System.out.println("Numarul este mai mic: " + numar2);
        } else if (numar2 > numar1) {
            System.out.println("Numarul este mai mare: " + numar2);
            System.out.println("Numarul este mai mic: " + numar1);
        } else {
            System.out.println("Numerele sunt egale!");
        }

    }
}
