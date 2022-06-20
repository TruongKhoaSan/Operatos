package backend;

import java.util.Scanner;

public class Exercise3 {

    Scanner scanner = new Scanner(System.in);


    public static void menuExercise03() {
        System.out.println("-------------------------------------------------");
        System.out.println("Sum integer from 1 to the number you just entered");
        System.out.println("( ^ - ^) Please choose 1 (^ - ^ )");
        System.out.println("1. Ways 1 ( use for )");
        System.out.println("2. Ways 2 ( use while )");
        System.out.println("3. Ways 3 ( use do while )");
        System.out.println("4. Back to Menu To");
    }

    public int mainExrcise03() {
        while (true) {
            menuExercise03();
            int choose = scanner.nextInt();
            switch (choose) {

//                USE FOR
                case 1:
                    int num , sum = 0;
                    System.out.println("Enter your number");
                    num = scanner.nextInt();

                    for (int i = 1; i <= num; ++i) {
                        sum +=i;
                        }
                    System.out.println("Sum integers from 1 to " + num + " is " + sum);
                    break;

//                    USE WHILE
                case 2:
                    int num2, sum2 = 0, i = 1;
                    System.out.println("Enter your number");
                    num2 = scanner.nextInt();
                    while(i <= num2)
                    {
                        sum2 += i;
                        i++;
                    }
                    System.out.println("Sum integers from 1 to "+ num2 +" is: "+sum2);
                    break;

//                    USE DO WHILE
                case 3:
                    int sum3 = 0, num3 , i3 = 1;
                    System.out.println("Enter your number");
                    num3 = scanner.nextInt();
                    do {
                        sum3 += i3;
                        i3++;
                    } while (i3 <= num3);
                    System.out.println("Sum integers from 1 to : " + num3 + " is : " + sum3);
                    break;
                case 4:
                    Operators operators = new Operators();
                    operators.main();
                    break;
            }
        }
    }



}
