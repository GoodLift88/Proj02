/*
Подсчитайте, сколько раз потребуется повторно вычислить четвёртый элемент

последовательности Фибоначчи для вычисления пятнадцатого элемента.
 */
package IslandUp;

public class Ex10 {
    static int count;

    public static void main(String[] args) {
        System.out.println("пятнадцатый элемент равен "+countFibNum(15));
        System.out.println("Число повторных вычислений четвертого элемента равно " + count);


    }

    public static int countFibNum(int element) {

        if (element == 1)
            return 0;
        if (element == 2 || element == 3)
            return 1;
        if (element == 4)

            count++;
        {
            return countFibNum(element - 1) + countFibNum(element - 2);


        }


    }


}

