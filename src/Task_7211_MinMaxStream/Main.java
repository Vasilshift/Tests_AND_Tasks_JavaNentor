package Task_7211_MinMaxStream;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import static java.lang.System.out;
public class Main {
    public static void main(String[] args) {
        Stream<Integer> stream = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 44, 13, 21)).stream();
        findMinMax(
                stream,
                (x, y) -> x.compareTo(y),
                (x, y) -> System.out.println(String.format("min: %s, max: %s", x, y))
        );
        stream.close();
    }
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> arr = stream.sorted(order).collect(Collectors.toList());
        if (!arr.isEmpty()) {
            minMaxConsumer.accept(arr.get(0), arr.get(arr.size() - 1));
        } else {
            minMaxConsumer.accept(null, null);
        }
    }

}

/*    Напишите метод, находящий в стриме минимальный и максимальный элементы в соответствии порядком, заданным Comparator'ом.

        Найденные минимальный и максимальный элементы передайте в minMaxConsumer следующим образом:

        minMaxConsumer.accept(min, max);
        Если стрим не содержит элементов, то вызовите:

        minMaxConsumer.accept(null, null);*/