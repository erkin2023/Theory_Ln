package HomeWork_Ln_18;

import java.util.Scanner;

public class Class {
    private WeekDay weekDay;

    public WeekDay getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(WeekDay weekDay) {
        this.weekDay = weekDay;

    }

    @Override
    public String toString() {
        return "Class{" +
                "weekDay=" + weekDay +
                '}';
    }
}
