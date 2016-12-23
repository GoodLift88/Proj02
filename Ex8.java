/*
Имеется три стержня, на один из которых нанизаны N колец, причем кольца отличаются

размером и лежат меньшее на большем. Требуется перенести пирамиду из N колец с одного

стержня на другой за наименьшее число ходов. За один раз разрешается переносить только

одно кольцо, причём нельзя класть большее кольцо на меньшее.
 */
package IslandUp;
import java.util.*;
public class Ex8 {
    public static void move(int N, int firstRod, int thirdRod) {
        if (N== 0){
            return;
        }
        int secondRod = 6 - firstRod - thirdRod;
        move(N-1, firstRod, secondRod);
        System.out.println("Перемещение  " +N+" кольца" + " с  " + firstRod+" стержня" + " на  " +thirdRod);
        move(N-1, secondRod, thirdRod);
    }


    public static void main(String[] args) {
        System.out.println("Введите количество колец в пирамиде " );
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        move(N,1,3);


    }
}









