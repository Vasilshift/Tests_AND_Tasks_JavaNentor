package Task_7210;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        IntStream i = pseudoRandomStream(13);
        i.limit(10).forEach(x -> System.out.print(x + " "));
        //System.out.println(pseudoRandomStream(13));
    }
    public static IntStream pseudoRandomStream(int seed) {
        //твой код здесь
        return IntStream.iterate( seed, (n) -> {
            return ((n * n) / 10) % 1000;
        });
    }
}
