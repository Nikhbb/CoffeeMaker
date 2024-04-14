package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Scanner sc = new Scanner(System.in);

        printMenu();
        getDrink(coffeeMachine, sc.nextInt());
    }

    private static void printMenu() {
        System.out.print("""
                  МЕНЮ
                  1 - Espresso
                  2 - Cappuccino
                  3 - Latte
                  Ваш вибір:""");
    }

    private static void getDrink(CoffeeMachine coffeeMachine, int userNumber) {
        switch (userNumber) {
            case 1:
                coffeeMachine.setDrink(new Espresso());
                coffeeMachine.startCook();
                break;
            case 2:
                coffeeMachine.setDrink(new Cappuccino());
                coffeeMachine.startCook();
                break;
            case 3:
                coffeeMachine.setDrink(new Latte());
                coffeeMachine.startCook();
                break;
            default:
                System.out.println("\nОберіть напій з меню.");
        }
    }
}
