import java.util.Scanner;

public class exe3Scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introdu primul numar: ");
        double a = input.nextDouble();

        System.out.print("Introdu al doilea numar: ");
        double b = input.nextDouble();

        System.out.print("Alege operatia (+, -, *, /, %): ");
        char operatie = input.next().charAt(0);

        double rezultat;

        switch (operatie) {
            case '+':
                rezultat = a + b;
                System.out.println("Rezultatul adunarii: " + rezultat);
                break;
            case '-':
                rezultat = a - b;
                System.out.println("Rezultatul scaderii: " + rezultat);
                break;
            case '*':
                rezultat = a * b;
                System.out.println("Rezultatul inmultirii: " + rezultat);
                break;
            case '/':
                if (b != 0)
                    System.out.println("Rezultatul impartirii: " + (a / b));
                else
                    System.out.println("Eroare: impartire la zero!");
                break;
            case '%':
                if (b != 0)
                    System.out.println("Restul impartirii: " + (a % b));
                else
                    System.out.println("Eroare: impartire la zero!");
                break;
            default:
                System.out.println("Operatie invalida!");
        }
    }
}

