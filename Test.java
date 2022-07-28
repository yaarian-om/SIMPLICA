import java.util.Random;

public class Test {
    public static void main(String args[]) {
        // By using Random Class
        Random rand = new Random();
        int randomNumber = rand. nextInt(10);// from 0 --> 10
        System.out.println("Random Value 1 = "+randomNumber+50);
        int randomNumber1 = rand. nextInt(10)+50;
        System.out.println("Random Value 2 = "+randomNumber1); // from 50 --> (50+10 = 60)

        // By using Math Class
        int randomNumber2 = (int) (Math.random()*20); // from 0 --> 20
        System.out.println("Random Value 2 = "+randomNumber2); 
        int randomNumber3 = (int) (Math.random()*20)+30; // from 30 --> (30+20 = 50)
        System.out.println("Random Value 4 = "+randomNumber3); 


    }
}