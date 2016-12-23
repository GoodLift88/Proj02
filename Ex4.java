/*
Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько раз за

сутки случается так, что слева от двоеточия показывается симметричная комбинация для той,

что справа от двоеточия (например, 02:20, 11:11 или 15:51).
 */
package IslandUp;
public class Ex4 {
    public static void main(String [  ] args){
        int counter=0;
        int hour;
        int min;
        for( hour=1;hour<=24;hour++)
        {
            for( min=0;min<=59;min++)
            {

                if(hour/10%10==min%10&hour%10==min/10%10)
                {
                    counter++;
                }
            }
        }
        System.out.println(counter+" комбинаций ");
    }
}