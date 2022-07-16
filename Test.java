import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int x, numberofCokes = 0, numberofChips = 0;
        char y = 'a';
        double price = 0;
        System.out.println("------------------------------ COKES ----------------------------------");
        System.out.println("                        Press 1 for COCACOLA                           |");
        System.out.println("                        Press 2 for PEPSI                              |");
        System.out.println("-----------------------------------------------------------------------");
        System.out.print("                        Enter your Choice >> ");
        x = input.nextInt();
        // If input type is numaric
        switch (x) {
            case 1: {
                System.out.println("COCACOLA SELECTED");
                System.out.println("Price is = 25/-");
                numberofCokes++;
                price = price + 25 * numberofCokes;

                break;
            }
            case 2: {
                System.out.println("PEPSI SELECTED");
                System.out.println("Price is = 15/-");
                numberofCokes++;
                price = price + 15 * numberofCokes;
                break;
            }
            default: {
                System.out.println("\nPLEASE ENTER A VALID INPUT");
                break;
            }
        }

        System.out.println("------------------------------ CHIPS ----------------------------------");
        System.out.println("                        Press a for KURKURE                            |");
        System.out.println("                        Press b for LAYS                               |");
        System.out.println("-----------------------------------------------------------------------");
        System.out.print("                        Enter your Choice >> ");
        y = input.next().charAt(0);
        // If input type is character
        switch (y) {
            case 'a': {
                System.out.println("KURKURE SELECTED");
                System.out.println("Price is = 25/-");
                numberofChips++;
                price = price + 25 * numberofChips;
                break;
            }
            case 'b': {
                System.out.println("KURKURE SELECTED");
                System.out.println("Price is = 20/-");
                numberofChips++;
                price = price + 20 * numberofChips;
                break;
            }
            default: {
                System.out.println("\nPLEASE ENTER A VALID INPUT");
                break;
            }
        }

        System.out.println("Your Bill is = " + price + " /- TK");

    }
}