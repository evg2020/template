package com.company.ex.interfac;

public class LambdaApp02 {
    public static void main(String[] args) {

// Реализуем интрефайс с помощь ламда выражения
        Expression func = n -> n % 2 == 0;
        int[] nums = {1, 2, 3, 4, 5, 6};

        //преимуществ лямбд в java является то,
        // что их можно передавать в качестве параметров в методы.
        int as = sum(nums, func);
        System.out.println(as);
    }

    private static int sum(int[] numbers, Expression fanc) {
        int res = 0;
        for (int i : numbers) {
            if (fanc.isEqual(i))
                res += i;
        }
        return res;
    }

//Функциональный интерфейс Expression определяет метод isEqual(),
// который возвращает true,
// если в отношении числа n действует какое-нибудь равенство.

    interface Expression {
        boolean isEqual(int n);
    }
}
