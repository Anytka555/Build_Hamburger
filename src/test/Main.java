package test;

import main.Hamburger;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int chooseBurger, i;
        boolean mainSelection, hasNextInt, UI = true;

        Hamburger hamburger = new Hamburger();

        while (UI) {

            System.out.println("                1. Regular Hamburger");
            System.out.println("    -> Press 1 to view Menu");
            System.out.println("    -> Press 0 to exit");

            mainSelection = scanner.hasNextInt();
            if (mainSelection) {
                chooseBurger = scanner.nextInt();
                switch (chooseBurger) {
                    case 1: {
                        hamburger.displayMenu();
                        System.out.println("\n Press 1 to Order a Regular Hamburger and select additional ingredients");
                        System.out.println(" Press 0 to back to main menu.");
                        hasNextInt = scanner.hasNextInt();
                        if (hasNextInt) {
                            i = scanner.nextInt();
                            if (i == 1) {
                                hamburger.addons();
                                System.out.println("Want to Order more? (Press 1)");
                                hasNextInt = scanner.hasNextInt();
                                if (hasNextInt) {
                                    i = scanner.nextInt();
                                    if (i != 1)
                                        UI = false;
                                }
                            } else
                                continue;
                        } else
                            continue;
                        break;
                    }


                    case 2: {

                        UI = false;
                        break;
                    }
                }
            }

        }

        System.out.println("Thanks for visiting our store! \n");
    }
}

