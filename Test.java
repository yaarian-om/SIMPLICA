import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import javax.print.attribute.standard.NumberUp;
        public class Test {
            public static void main(String args[]) {
                String message2 = "We_are_Learning";
                String message = "We_Are_Learning";
                System.out.println("Length = "+message.length());
                System.out.println("Equals = "+message.equals(message2));
                System.out.println("Equals Ingnoring Case = "+message.equalsIgnoreCase(message2));
                System.out.println("Contains = "+message.contains("Learning"));
                System.out.println("is Empty = "+message.isEmpty());
                System.out.println("Concat = "+message.concat("_Java"));
                System.out.println("To Upper Case = "+message.toUpperCase());
                System.out.println("To Lower Case = "+message.toLowerCase());
                System.out.println("Start With = "+message.startsWith("We"));
                System.out.println("Ends With = "+message.endsWith("Learning"));

                System.out.println("Trim = "+message.trim());
                System.out.println("Char At = "+message.charAt(5));
                System.out.println("Index Of = "+message.indexOf("Are"));
                System.out.println("Last index of = "+message.lastIndexOf("e"));
                System.out.println("Replace A -> a = "+message.replace('A','a'));
                String[] words = message.split("_");
                for (String string : words) {
                    System.out.println(string);
                }



            }
        }