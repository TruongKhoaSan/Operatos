package backend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Operators {
    Scanner scanner;
    Exercise1 exercise1 = new Exercise1();

    Exercise3 exercise3 = new Exercise3();

    public Operators() {
        scanner = new Scanner(System.in);
    }

    public void menu() {
        System.out.println("");
        System.out.println("Please choose 1");
        System.out.println("1. Print the number of days of the month you just entered");
        System.out.println("2. Print the number of days between the two days you just entered");
        System.out.println("3. Sum integer from 1 to the number you just entered");
        System.out.println("4. Exit");
    }

    public int main() {
        while (true) {
            menu();
            int choose = scanner.nextInt();
            switch (choose) {
//                Print the number of days of the month you just
                case 1:
                    exercise1.mainExercise01();
                    break;

//                Print the number of days between the two days you just entered
                case 2:
                    Scanner scannerDate = new Scanner(System.in);

                    System.out.println("Enter start day ( like yyyy-MM-dd )");
                    String date1 = scannerDate.nextLine();

                    System.out.println("Enter end day ( likeyyyy-MM-dd )");
                    String date2 = scannerDate.nextLine();

                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

                    try {
                        Date dateStart = dateFormat.parse(date1);
                        Date dateEnd = dateFormat.parse(date2);

                        long startValue  = dateStart.getTime();
                        long endValue  = dateEnd.getTime();
                        long tmp = Math.abs(startValue - endValue);
                        long result = tmp/(24*3600*1000);

                        System.out.println("noDay between " + date1 + " and " + date2 + " is :" + result);

                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    break;

//                Sum integer from 1 to the number you just entered
                case 3:
                    exercise3.mainExrcise03();
                    break;
                default:
                    System.out.println("Bye Bye ( ^ _ ^) ");
                    break;
            }
            return 0;
        }
    }
}


