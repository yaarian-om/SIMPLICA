import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String args[]) {
        LocalTime time = LocalTime.now();
        System.out.println("Time Class = "+time);

        // Formatting Time (My choice)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String currentTime = time.format(formatter);
        System.out.println("Current Date(My choice format) : "+currentTime);
    }
}