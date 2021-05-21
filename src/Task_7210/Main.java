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

        return IntStream.iterate(seed, g -> ( (g * g) / 10) % 1000);

    }
}
/*
Напишите метод, возвращающий стрим псевдослучайных целых чисел. Алгоритм генерации чисел следующий:
 Берется какое-то начальное неотрицательное число (оно будет передаваться в ваш метод проверяющей системой).
 Первый элемент последовательности устанавливается равным этому числу.
 Следующие элементы вычисляются по рекуррентной формуле Rn+1=mid(Rn2), где mid — это функция, выделяющая второй,
 третий и четвертый разряд переданного числа. Например, mid(123456)=345.
 Алгоритм, конечно, дурацкий и не выдерживающий никакой критики, но для практики работы со стримами сойдет :)
 Пример ввода: 13
 Пример вывода: 13, 16, 25, 62, 384, 745, 502, 200, 0, ... (дальше бесконечное количество нулей)*/