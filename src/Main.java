import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int luckynumber = 3;
        Scanner scan = new Scanner(System.in);


        System.out.println("Meine Glückszahl lautet: " + luckynumber);
        System.out.println("Geben Sie bitte eine Zahl ein:");
        int number = scan.nextInt();

        System.out.println("Your number is: " + number);

        if (number % 2 == 0) {
            System.out.println("Die Zahl ist gerade");
        }

        if (number % 10 == 0) {
            System.out.println("Es ist eine runde Zahl");
        }

        if (number == luckynumber) {
            System.out.println();
        }

        if (number >= 10 && number < 100) {
            System.out.println("Die Nummer ist zweistellig");
        }

        scan.close();
    }
}