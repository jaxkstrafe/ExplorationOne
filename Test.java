import java.time.Duration;
import java.time.Instant;

public class Test {
    
    public static void main(String[] args) {
        Instant start = Instant.now();
        for (int i = 0; i <= 30; i++) {
            System.out.println(Compare.iterativeF(i));
        }
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time elapsed: " + timeElapsed);

        start = Instant.now();
        for (int i = 0; i <= 30; i++) {
            System.out.println(Compare.recursiveF(i));
        }
        Instant End = Instant.now();
        timeElapsed = Duration.between(start, End);
        System.out.println("time elapsed: " + timeElapsed);
        

    }
}