import java.time.Duration;
import java.time.Instant;

public class Test {
    
    public static void main(String[] args) {
        Instant start = Instant.now();
        System.out.println(Compare.iterativeF(0));
        System.out.println(Compare.iterativeF(1));
        System.out.println(Compare.iterativeF(2));
        System.out.println(Compare.iterativeF(3));
        System.out.println(Compare.iterativeF(4));
        System.out.println(Compare.iterativeF(5));
        Instant End = Instant.now();
        Duration timeElapsed = Duration.between(start, End);
        System.out.println("time elapsed: " + timeElapsed);

        start = Instant.now();
        System.out.println(Compare.recursiveF(0));
        System.out.println(Compare.recursiveF(1));
        System.out.println(Compare.recursiveF(2));
        System.out.println(Compare.recursiveF(3));
        System.out.println(Compare.recursiveF(4));
        System.out.println(Compare.recursiveF(5));
        End = Instant.now();
        timeElapsed = Duration.between(start, End);
        System.out.println("time elapsed: " + timeElapsed);

    }
}
