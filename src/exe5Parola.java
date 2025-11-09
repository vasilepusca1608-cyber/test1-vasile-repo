import javax.swing.*;
import java.util.Scanner;

public class exe5Parola {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input password: ");
        String parola = input.nextLine();
        System.out.println("Password was: " + parola);

    }
}
