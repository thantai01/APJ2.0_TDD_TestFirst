
import java.util.Scanner;

public class NextDayCalculator {
    static int day;
    static int month;
    static int year;

    public NextDayCalculator() {
        NextDayCalculator.day = inputDay();
        NextDayCalculator.month = inputMonth();
        NextDayCalculator.year = inputYear();
    }
    public static void isNextDay(int day, int month, int year) {
        if(day == 31 && month ==12) {
            day = 1;
            month = 1;
            year +=1;
            System.out.println("The next day is: " +
                    day + " / " + month + " / " + year + ".");
        }
        else if (day==isDayEnd(month,year)){
            day = 1;
            month +=1;
        } else day+=1;

    }
    public static int isDayEnd(int month, int year){
        int endDay = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                endDay=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                endDay=30;
                break;
            case 2:
                if(isLeapYear(year))
                    endDay = 29;
                endDay = 28;
                break;
        }
        return endDay;
    }
    public static boolean isLeapYear(int year){
        if(year%400==0 || (year%4==0 && year%100!=0))
            return true;
        return false;
    }
    public static int inputDay(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day :");
        return sc.nextInt();
    }
    public static int inputMonth(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a month :");
        return sc.nextInt();
    }
    public static int inputYear(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year :");
        return sc.nextInt();
    }

}
