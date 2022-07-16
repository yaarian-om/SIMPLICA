import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int result = 0;
        System.out.println("1+2+3+4+5+.......+n");
        System.out.print("Enter the last number of the linear series : ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            result = result + i;
        }
        System.out.println("The Addtion result of the whole series is = " + result);
    }
}