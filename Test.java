import java.util.ArrayList;
import java.util.Scanner;

import javax.print.attribute.standard.NumberUp;
        public class Test {
            public static void main(String args[]) {
                Scanner input = new Scanner(System.in);
                ArrayList<Integer>number = new ArrayList<>();
                System.out.println("Size = "+number.size());
                number.add(10);
                number.add(20);
                number.add(30);
                number.add(40);
                System.out.println(number); // Horizontal Print
                //using for each loop
                for(int x: number){
                    System.out.println(x);
                }
                System.out.println("Size = "+number.size());
                // Removing Elements
                number.set(3,50);
                System.out.println("After Removing, Number = "+number);
                // REmoving all elements
                int x = number.get(3);
                System.out.println("Getting Value is = "+x);





                
            }
        }