package backend;

import java.util.Scanner;

public class Exercise1 {
    Scanner scanner = new Scanner(System.in);

    enum Month {
        January(31), February(28), March(31), April(30), May(31), June(30), July(31), August(31), September(30), October(31), November(30), December(31);
        private int day;

        Month(int day) {
            this.day = day;
        }

        public int getDay() {
            return day;
        }

        private void Month(int i) {
            this.day = i;

        }
    }

    public static void menuExercise01() {
        System.out.println("------------------------------------------------------");
        System.out.println("Print the number of days of the month you just entered");
        System.out.println("( ^ - ^) Please choose 1 (^ - ^ )");
        System.out.println("1. Ways one ( use enum )");
        System.out.println("2. Ways two ( not use enum )");
        System.out.println("3. Back to Menu To");
    }

    public int findDayByMonth(int month) {
        switch (month) {
            case 1:
                return Month.January.getDay();
            case 2:
                return Month.February.getDay();
            case 3:
                return Month.March.getDay();
            case 4:
                return Month.April.getDay();
            case 5:
                return Month.May.getDay();
            case 6:
                return Month.June.getDay();
            case 7:
                return Month.July.getDay();
            case 8:
                return Month.August.getDay();
            case 9:
                return Month.September.getDay();
            case 10:
                return Month.October.getDay();
            case 11:
                return Month.November.getDay();
            case 12:
                return Month.December.getDay();
            default:
                System.out.println("Wrong format input");
                return 0;
        }
    }

    public int mainExercise01() {
        while (true) {
            menuExercise01();
            int choose = scanner.nextInt();
            switch (choose) {

                case 1:
                    int month, numDays;
                    System.out.println("Enter month: ");
                    month = scanner.nextInt();
                    numDays = findDayByMonth(month);
                    System.out.println("Month : " + month + " have : " + numDays);
                    break;
                case 2:
                int month2;
                System.out.println("Enter month: ");
                month2 = scanner.nextInt();

                switch (month2) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println("Month " + month2 + " have 31 days.");
                        break;

                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println("Month " + month2 + " have 30 days.");
                        break;

                    case 2:
                        int year;
                        System.out.println("Enter year: ");
                        year = scanner.nextInt();
                        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                            System.out.println("Month " + month2 + " in " + year + " have 29 days.");
                        } else {
                            System.out.println("Month " + month2 + " in " + year + " have 28 days.");
                        }
                        break;

                    default:
                        break;
                }
                break;
            case 3:
                Operators operators = new Operators();
                operators.main();
                break;
            }

        }
    }
}
