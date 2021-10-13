package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your word! ");
        String catchphrase = scan.nextLine();

        String answerto = new StringBuilder(catchphrase).reverse().toString();
            System.out.println("Your word backwards is " + answerto );
            System.out.println("Thanks for playing!");

        }


}
