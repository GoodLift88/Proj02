/*
Написать метод, который для данного числа n (заданного с клавиатуры) вычисляет сумму

чисел от 1 до n;
 */

package IslandUp;
import java.util.*;
public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.println(SumNumb(n));
    }
        public static int SumNumb(int n)
    {
      if(n==1)
          return 1 ;
        {
            return SumNumb(n-1)+n;
        }
    }
    }

