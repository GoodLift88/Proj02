/*
Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из

отрезка [-5;5]. Вывести массив на экран. Определить и вывести на экран индекс строки с

наибольшим по модулю произведением элементов. Если таких строк несколько, то вывести

индекс первой встретившейся из них.
 */

package IslandUp;

public class Ex6 {
    public static void main(String[] args) {
        int[][] mass01 = new int[7][4];
        int[] mass02 = new int[mass01.length];
        for (int i = 0; i < mass01.length; i++) {
            System.out.println("индекс " + i + " ");
            for (int j = 0; j < mass01[i].length; j++) {
                mass01[i][j] = (int) (Math.random() * 11) - 5;
                System.out.print(mass01[i][j] + " ");
                if (j == 0)
                    mass02[i] = mass01[i][j];
                else
                    mass02[i] *= mass01[i][j];
                if (j == mass01[i].length - 1)
                    System.out.println(" ");
            }
        }

        int maxMod = 0;
        int max_indexLength = 0;

        for (int i = 0; i < mass02.length; i++) {
            if (Math.abs(mass02[i]) > maxMod) {
                maxMod = mass02[i];
                max_indexLength = i;
            }
        }

        System.out.println("Строка с наибольшим по модулю произведением элементов (" + maxMod + ") имеет индекс - " + max_indexLength);
    }

}

