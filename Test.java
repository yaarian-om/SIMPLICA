import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st nmber >> ");
        int x = input.nextInt();
        System.out.print("Enter 2nd nmber >> ");
        int y = input.nextInt();
        do {
            System.out.println("Condition Is already wrong");
            x--;
        } while (x / y == 0);
    }
}