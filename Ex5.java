/*
Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из

отрезка [10;99]. Вывести массив на экран.
 */

package IslandUp;
public class Ex5 {
    public static void main(String[] args) {
        int[][] arrMas = new int[8][5];
        for (int i = 0; i < arrMas.length; i++) {
            for (int j = 0; j < arrMas[i].length; j++) {
                arrMas[i][j] = (int) (Math.random() * 90+10);
            }
        }
        for (int[] arrMa : arrMas) { //  for (int i = 0; i < arrMas.length; i++)
            for (int anArrMa : arrMa) { //  for (int j = 0; j < arrMa.length; j++)
                System.out.print(anArrMa + "\t"); // вывод в виде матрицы для удобства при просмотре
            }
            System.out.println();// Smoke weed Everyday
        }
    }
}