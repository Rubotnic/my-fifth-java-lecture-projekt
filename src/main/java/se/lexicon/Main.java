package se.lexicon;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter your username below");
        System.out.print("> ");
        input = scanner.next();
        System.out.print ("Hello "+ input);

    }
}