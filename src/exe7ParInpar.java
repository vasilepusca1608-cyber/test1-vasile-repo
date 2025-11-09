import java.util.Scanner;

public class exe7ParInpar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numar =input.nextInt();
        if (numar % 2 == 0) {
            System.out.println(numar + " Numarul este par.");
        }else {
            System.out.println(numar + " Numarul este inpar.");
        }
    }
}
