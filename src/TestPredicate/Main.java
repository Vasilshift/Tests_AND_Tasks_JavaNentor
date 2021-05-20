package TestPredicate;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
/*Дан предикат condition и две функции ifTrue и ifFalse.
Напишите метод ternaryOperator, который из них построит новую функцию, возвращающую значение функции ifTrue,
если предикат выполнен, и значение ifFalse иначе.*/

public class Main {
    public static void main(String[] args) {
        Predicate<Object> condition = Objects::isNull;
        TernaryOperator<Object, Integer> ifTrue = obj -> 0;
        TernaryOperator<CharSequence, Integer> ifFalse = t -> {
            return t.length();
        };
        //Function<CharSequence, Integer> ifFalse = CharSequence::length;

        TernaryOperator<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);
        System.out.println(safeStringLength);
    }

    static public <T, U> TernaryOperator<T, U> ternaryOperator(Predicate<? super T> condition,
                                                               TernaryOperator<? super T, ? extends U> ifTrue,
                                                               TernaryOperator<? super T, ? extends U> ifFalse) {
        //TernaryOperator<T, U> f;
        return t -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);

       }
}
