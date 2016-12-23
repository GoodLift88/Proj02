/*
Создайте код, который выводит все простые числа из интервала от 2 до n (заданного с

клавиатуры). Результат должен быть: 2,3,5,7 ...
 */
package IslandUp;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        System.out.print("Введите конечное число итервала -  ");
        int n = new Scanner(System.in).nextInt();


        System.out.println("Простые числа на интервале от 2 до  " + n);
        for (int number = 2; number <= n; number++) {

            if (isPrime(number)) {
                System.out.println(number + "\n");
            }
        }

    }


    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}


