/*
Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его

цифр (заранее не известно сколько цифр будет в числе).
 */
package IslandUp;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        {
            Scanner scanner = new Scanner(System.in);
            int j;
            int sum = 0;
            System.out.print("enter the number here -  ");

            for (j = scanner.nextInt();
                 j != 0; j /= 10)
            {
                sum = sum + (j % 10);
            }
            System.out.println("the sum is " + sum);
        }
    }
}