import java.util.Scanner;

public class Main {

    static void infoScreen() {

        System.out.println("Welcome to Square App");
        System.out.println("Instructions are down below:\n");
        System.out.println("Type 'test' to test if app is running or not");
        System.out.println("Type 'square' to draw a 3x3 square");
        System.out.println("Type 'squareP' to draw a square with entering a parameter");
        System.out.println("Type 'quit' to close the app\n");
    }

    static void drawSquare(int edge) {

        for (int a=0; a < edge; a++) {
            for (int b=0; b < edge; b++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {

        infoScreen();

        System.out.println("Enter your command:");
        Scanner input1 = new Scanner(System.in); //input1 takes commands
        String command = input1.nextLine();

        boolean app = true;

        while (app) {
            switch (command) {
                case "test":
                    System.out.println("*-*-*-*-*-*");
                    break;

                case "square":
                    drawSquare(3);
                    break;

                case "squareP":
                    System.out.println("Enter edge number:");
                    Scanner input2 = new Scanner(System.in); //input2 takes integer for edges
                    int wantedEdge = input2.nextInt();
                    drawSquare(wantedEdge);
                    break;

                case "quit":
                    app = false;
                    break;

                default:
                    System.out.println("Please enter a valid command");
            }

            if (command.equals("quit")) {
                break;
            }
            else {
                System.out.println("Enter your new command:");
                Scanner input3 = new Scanner(System.in); //input3 takes new commands
                String newCommand = input3.nextLine();
                command = newCommand;
            }
        }
    }
}
