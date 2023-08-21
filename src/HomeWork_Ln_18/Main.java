package HomeWork_Ln_18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Class weekDay = new Class();
        //person.setGender(Gender.MALE);
        weekDay.setWeekDay(WeekDay.MONDAY);
        weekDay.setWeekDay(WeekDay.TUESDAY);
        weekDay.setWeekDay(WeekDay.WEDNESDAY);
        weekDay.setWeekDay(WeekDay.THURSDAY);
        weekDay.setWeekDay(WeekDay.SATURDAY);
        weekDay.setWeekDay(WeekDay.SUNDAY);
        Scanner scanner = new Scanner(System.in);
        WeekDay selectedDay = null;

        while (true) {
            System.out.println("Кундин санын жазыныз");
            int dayNumber = scanner.nextInt();

            switch (dayNumber) {
                case 1:
                    selectedDay = WeekDay.MONDAY;
                    weekDay.getWeekDay().method();
                    break;
                case 2:
                    selectedDay = WeekDay.TUESDAY;
                    weekDay.getWeekDay().method();
                    break;
                case 3:
                    selectedDay = WeekDay.WEDNESDAY;
                    weekDay.getWeekDay().method();
                    break;
                case 4:
                    selectedDay = WeekDay.THURSDAY;
                    weekDay.getWeekDay().method();
                    break;
                case 5:
                    selectedDay = WeekDay.FRIDAY;
                    weekDay.getWeekDay().method();
                    break;
                case 6:
                    selectedDay = WeekDay.SATURDAY;
                    weekDay.getWeekDay().method();
                    break;
                case 7:
                    selectedDay = WeekDay.SUNDAY;
                    weekDay.getWeekDay().method();
                    break;
            }
        }
    }

    }

