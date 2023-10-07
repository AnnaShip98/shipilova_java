package solution_3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/*

3.	Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3.

Примеры для ввода:
 //1 2 3 4 5 6 7 8 9 13 15 25 30 33 45 55 88 99

 //1 2 3 4 5 6 7 8 9

*/

public class solution_3_multiple_three
{

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        System.out.println("Write your Array numbers, per space: ");
        String s = in.nextLine();

        List<Integer> listArrN = new ArrayList<Integer>();
        String[] strArr = s.split(" ");
        for(int i = 0; i < strArr.length; i ++)
        {

            if(Integer.parseInt(strArr[i]) % 3 == 0)
            {
                //System.out.print(Integer.parseInt(strArr[i]) + " ");
                listArrN.add(Integer.parseInt(strArr[i]));
            }

        }

        System.out.println("Array multiple 3: ");
        for (Integer ln : listArrN)
        {
            System.out.print(ln + " ");
        }
        //System.out.println(listArrN);

        in.close();

    }

}
