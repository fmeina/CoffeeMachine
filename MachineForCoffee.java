package machine;
import java.util.Scanner;

public class MachineForCoffee {

    public static Scanner scanner = new Scanner(System.in);
    private static int water = 400;
    private static int money = 550;
    private static int milk = 540;
    private static int coffee = 120;
    private static int cups = 9;

    public static void mainMenu() {

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit)");
            String action = scanner.nextLine();

            switch (action) {
                case "exit":
                    System.exit(0);
                    break;

                case "buy":
                    buy();
                    break;

                case "fill":
                    fill();
                    break;

                case "take":
                    take();
                    break;

                case "remaining":
                    coffeeMachineState();
                    break;
            }
        }
    }

    public static void take() {
        System.out.println("I gave you " + money);
        money = 0;
    }

    public static void fill() {
        System.out.println("Write how many ml of water do you want to add: ");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        coffee += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        cups += scanner.nextInt();
    }

    public static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2- latte, 3 - cappuccino, back - to main menu");
        String action = scanner.nextLine();


        switch (action) {
            case "1":
                makeEspresso();
                break;

            case "2":
                makeLatte();
                break;

            case "3":
                makeCappuccino();
                break;

            case "back":
                mainMenu();
                break;
        }
    }

    public static void makeCappuccino() {
        if (water - 200 < 0) {
            System.out.println("Sorry, not enough water");
        }
        else if (milk - 100 < 0) {
            System.out.println("Sorry, not enough milk");
        }
        else if (coffee - 12 < 0) {
            System.out.println("Sorry, not enough coffee");
        }
        else if (cups - 1 < 0) {
            System.out.println("Sorry, not enough cup");
        }
        else {
            water -= 200;
            milk -= 100;
            coffee -= 12;
            cups -= 1;
            money += 6;
            System.out.println("I have enough resources, making you a coffee!");
        }

    }

    public static void makeLatte() {
        if (water - 350 < 0) {
            System.out.println("Sorry, not enough water");
        }
        else if (milk - 75 < 0) {
            System.out.println("Sorry, not enough milk");
        }
        else if (coffee - 20 < 0) {
            System.out.println("Sorry, not enough coffee");
        }
        else if (cups - 1 < 0) {
            System.out.println("Sorry, not enough cup");
        }
        else {
            water -= 350;
            milk -= 75;
            coffee -= 20;
            cups -= 1;
            money += 7;
            System.out.println("I have enough resources, making you a coffee!");
        }
    }

    public static void makeEspresso() {
        if (water - 250 < 0) {
            System.out.println("Sorry, not enough water");
        }
        else if (coffee - 16 < 0) {
            System.out.println("Sorry, not enough coffee");
        }
        else if (cups - 1 < 0) {
            System.out.println("Sorry, not enough cup");
        }
        else {
            water -= 250;
            coffee -= 16;
            cups -= 1;
            money += 4;
            System.out.println("I have enough resources, making you a coffee!");
        }
    }

    public static void coffeeMachineState() {
        System.out.println("The coffee machine has: \n" +
                water + " of water\n" +
                milk + " of milk\n" +
                coffee + " of coffee beans\n" +
                cups + " of disposable cups\n" +
                money + " of money\n");

    }
}
