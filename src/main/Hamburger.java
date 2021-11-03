package main;

import java.util.Objects;
import java.util.Scanner;

public class Hamburger {


    private String name;
    private String breadRoll;
    boolean meat;
    private double price;
    private boolean dressing;
    private boolean cheese;
    private boolean kotleta;
    private boolean additionals;
    private int reviewAddons;

    public Hamburger() {
        this.name = "Hamburger";
        this.breadRoll = "Regular";
        this.meat = true;
        this.price = 50.00;
        this.dressing = false;
        this.cheese = false;
        this.kotleta = false;
        this.additionals = true;
        this.reviewAddons = 0;

    }

    Scanner scanner = new Scanner(System.in);

    public void setName(String name) {

        this.name = name;
    }

    public void setBreadRoll(String breadRoll) {

        this.breadRoll = breadRoll;
    }

    public double getPrice() {

        return price;
    }

    public void addPrice(double price) {

        this.price += price;
    }

    public String getName() {

        return name;
    }

    private void addDressing() {
        dressing = true;
        price += 10.00;
    }

    private void addCheese() {
        cheese = true;
        price += 20.00;
    }

    private void addKotleta() {
        kotleta = true;
        price += 30.00;
    }


    public void reset() {
        this.price = 50.00;
        this.dressing = false;
        this.cheese = false;
        this.kotleta = false;
    }

    public void addons() {
        int i;
        boolean hasNextInt;
        do {

            System.out.println();
            System.out.println("Do you want dressing in your " + getName() + "? ( 10.00)");
            System.out.println("Enter 1 to add dressing, 0 to move on.");
            hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                i = scanner.nextInt();
                if (i == 1) {
                    addDressing();
                    System.out.println("Dressing was added to your " + getName() + ".\n");
                }
            } else {
                System.out.println("Invalid option! Choosing to skip your addition.");
            }

            System.out.println("Do you want cheese in your " + getName() + "? ( 20.00)");
            System.out.println("Enter 1 to add cheese, 0 to move on.");
            hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                i = scanner.nextInt();
                if (i == 1) {
                    addCheese();
                    System.out.println("Cheese was added to your " + getName() + ". \n");
                }
            } else {
                System.out.println("Invalid option! Choosing to skip your addition.");
            }

            System.out.println("Do you want Kotleta in your " + getName() + "? ( 40.00)");
            System.out.println("Enter 1 to add Kotleta, 0 to move on.");
            hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                i = scanner.nextInt();
                if (i == 1) {
                    addKotleta();
                    System.out.println("Kotleta was added to your " + getName() + ".\n");
                }
            } else {
                System.out.println("Invalid option! Choosing to skip your addition.");
            }


            System.out.println("You have chosen to add:");
            if (dressing)
                System.out.println("dressing");
            if (cheese)
                System.out.println("cheese");
            if (kotleta)
                System.out.println("kotleta");
            System.out.println();
            System.out.println("Sub Total: " + getPrice());

            if (Objects.equals(getName(), "Hamburger")) {
                System.out.println("Enter 1 to change your addons, 0 to continue");
                hasNextInt = scanner.hasNextInt();
                if (hasNextInt) {
                    reviewAddons = scanner.nextInt();
                    if (reviewAddons == 1)
                        reset();
                }
            }
        } while (reviewAddons == 1);
        System.out.println();
        if (Objects.equals(getName(), "Hamburger")) {

            System.out.println("Order Successful");
            System.out.println("Order placed: " + getName() + " \nGrand Total: " + getPrice());
        }
    }

    public void displayMenu() {

        System.out.println();
        System.out.println();
        System.out.println("               You have selected \n               " + getName() + ":");
        System.out.println("Base price:              ---------------          50.00");
        System.out.println("Addons:");
        System.out.println("Dressing                  ---------------          10.00");
        System.out.println("Cheese                   ---------------           20.00");
        System.out.println("Kotleta                   ---------------          30.00");
        System.out.println();
        System.out.println("Total:                   ---------------          110.00");
        System.out.println();
    }
}