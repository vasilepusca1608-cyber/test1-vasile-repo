import java.util.Scanner;

public class exe9Switch {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti un numar lunii (1 - 12): ");
        int luna = input.nextInt();

        switch (luna){
            case 1:
                System.out.println("Ianuarie este anotimpul iarna");
                break;
            case 2:
                System.out.println("Februarie este anotimpul iarna");
                break;
            case 3:
                System.out.println("Martie este anotimpul primavara");
                break;
            case 4:
                System.out.println("Aprilie este anotimpul primavara");
                break;
            case 5:
                System.out.println("Mai este anotimpul primavara");
                break;
            case 6:
                System.out.println("Iunie este anotimpul vara");
                break;
            case 7:
                System.out.println("Iulie este anotimpul vara");
                break;
            case 8:
                System.out.println("August este anotimpul vara");
                break;
            case 9:
                System.out.println("Septembrie este anotimpul toamna");
                break;
            case 10:
                System.out.println("Octombrie este anotimpul toamna");
                break;
            case 11:
                System.out.println("Noiembrie este anotimpul toamna");
                break;
            case 12:
                System.out.println("Decembrie este anotimpul iarna");
            default:
                System.out.println("Eroare");
                break;
        }
    }
}
