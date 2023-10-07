package solution_1;

import java.util.Scanner;

/*

1. Составить алгоритм, если введенное число больше 7, то вывести «Привет».

Примеры для ввода:

//7
//7,01
//9
//8,8

*/

public class solution_1_over_seven
{

    public static void main(String[] args)
    {
        System.out.print("Input a number: ");
        Scanner in = new Scanner(System.in);
        float n = in.nextFloat();

        if(n > 7.0)
        {
            System.out.println("Привет");
        }

        in.close();
    }

}
