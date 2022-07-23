public class Test {
     public static void main(String args[]) {
        String s1 = "boys";
       StringBuilder message = new StringBuilder("We");
        System.out.println("String = "+message);
        message.append(" are learning");
        System.out.println("String updated = "+message);
        message.delete(2, 6);
        System.out.println(message);
    }
}