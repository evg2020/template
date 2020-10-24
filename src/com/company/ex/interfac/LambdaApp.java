package com.company.ex.interfac;

public class LambdaApp {
    public static void main(String[] args) {

        //анонимный класс реализует интерфайс
        Interfac interfac01 = new Interfac() {
            @Override
            public int calculate(int x, int y) {
                return x + y;
            }
        };
        int z = interfac01.calculate(2, 4);
        System.out.println(z);

//лямбда класс реализует интерфайс
        Interfac interfac02;
        interfac02 = (x, y) -> x - y;
        int w = interfac02.calculate(4, 5);
        System.out.println(w);


        Interfac op = (x, y) -> {
            if (y == 0)
                return 0;
            else
                return x / y;
        };
        int we = op.calculate(12, 7);
        System.out.println(we);


        Operationable<Integer> op1 = (x, y) -> x + y;
        Operationable<String> op2 = (x, y) -> x + y;

        System.out.println(op1.calculate(20, 10)); //30
        System.out.println(op2.calculate("Hello", " word")); //2010

        }
    interface Operationable<T> {
        T calculate(T x, T y);
    }
    interface Interfac {
        int calculate(int x, int y);
    }
}
