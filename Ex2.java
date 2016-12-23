/*
Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что

первый и второй члены последовательности равны единицам, а каждый следующий — сумме

двух предыдущих.
 */
package IslandUp;

public class Ex2 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;

        System.out.print(num1 + " " + num2 + " ");

        for (int i = 3; i <= 11; i++) {
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;


            System.out.print(num3 + " ");
        }
    }
}

