package solution_2;

import java.util.Scanner;

/*

2. Составить алгоритм, если введенное имя совпадает с Вячеслав, то вывести «Привет, Вячеслав»,
если нет,то вывести «нет такого имени».

Примеры для ввода:
//Ann

//Вячеслав

*/

public class solution_2_hello_name
{

    public static void main(String[] args)
    {
        System.out.print("Input a name: ");
        Scanner in = new Scanner(System.in);
        String s = in.next();

        System.out.print("Your name: " + s);
        System.out.println();

        if(s.equals("Вячеслав"))
        {
            System.out.println("Привет, " + s);
        }
        else
        {
            System.out.println("нет такого имени");
        }

        in.close();
    }

}
