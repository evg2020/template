package com.company.ex.interfac;

//ссылку на другой метод.


//Начиная с JDK 8 в Java можно в качестве параметра
// в метод передавать ссылку на другой метод.

//Ссылка на метод передается в виде
// имя_класса::имя_статического_метода (если метод статический)
// объект_класса::имя_метода

// класс, в котором определены методы
public class ExpressionHelper {

    // статические методы

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static boolean isPositive(int n) {
        return n > 1;
    }

    // нестатические методы
    boolean isNon(int n){
        return n%2 != 0;
    }
}
/////////////////////////////////
// функциональный интерфейс///////
interface Expresso {
    boolean fun(int n);
}


 // класс для выполнения
class LamdaApp {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        // При этом методы, на которые идет ссылка,
        // должны совпадать по параметрам и результату с методом функционального интерфейса.
        int lew = sum(nums, ExpressionHelper::isEven);
        System.out.println(lew);

        //отдельно создается объект Expression, который затем передается в метод
        Expresso exp = ExpressionHelper::isPositive;

        System.out.println(sum(nums, exp));

        //нестатические методы,
        // то в ссылке вместо имени класса применяется имя объекта этого класса
        ExpressionHelper exHelper = new ExpressionHelper();
        System.out.println(sum(nums,exHelper::isNon));
    }

    private static int sum(int[] numbers, Expresso expres) {
        int res = 0;
        for (int i : numbers) {
            if (expres.fun(i))
                res += 1;
        }
        return res;
    }
}



