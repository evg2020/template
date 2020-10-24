package com.company.func_interface;

import java.util.Scanner;
import java.util.function.*;
import java.util.function.Consumer;


public class LambdaAdd {
    public static void main(String[] args) {
        /*
// Функциональный интерфейс Predicate<T> проверяет соблюдение некоторого условия.
// Если оно соблюдается, то возвращается значение true
         public interface Predicate<T>{
    boolean test(T t);
}*/
        Predicate<Integer> pred = x -> x == 0;
        System.out.println(pred.test(5));

        /*BinaryOperator<T>  принимает в качестве параметра два объекта типа T, выполняет над ними бинарную операцию
        и возвращает ее результат также в виде объекта типа T:
public interface BinaryOperation<T>{
    T apply (T t1, T t2);
}*/
        BinaryOperator<Integer> multi = (x, y) -> 2 * x + y;
        System.out.println(multi.apply(2, 3));

       /* UnaryOperator<T> принимает в качестве параметра объект типа T,
        выполняет над ними операции и возвращает
        результат операций в виде объекта типа T:
        public interface UnaryOperator<T>{
            T apply (T t)
        }*/
        UnaryOperator<Integer> unOper = x -> x * x;
        System.out.println(unOper.apply(2));

        /*Function<T,R>
        Функциональный интерфейс
        Function<T,R>
        представляет функцию перехода от объекта типа T к объекту типа R:
        public interface Function<T, R>
        R apply (T t);
        */
        Function<Integer, String> convert = x -> String.valueOf(x) + " dollars";
        System.out.println(convert.apply(5));

        /*Consumer<T>
        Consumer<T> выполняет некоторое действие над объектом типа T,
        при этом ничего не возвращая:
        public interface Consumer<T>{
            void accept(T t);
        }*/


        Consumer<Integer> printer = x -> System.out.printf("%d Dollars", x);
        printer.accept(100);
/*

        Supplier<T>
        Supplier<T> не принимает никаких аргументов,
                но должен возвращать объект типа T:
        public interface Supplier<T>{
            T get();
        }
*/

        Supplier<User> userFactory = () -> {

            Scanner in = new Scanner(System.in);
            System.out.println("Введите имя: ");
            String name = in.nextLine();
            return new User(name);
        };
        User user = userFactory.get();
        System.out.println(user);
    }


}

class User {

    private String name;

    String getName() {
        return name;
    }

    User(String n) {
        this.name = n;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}


