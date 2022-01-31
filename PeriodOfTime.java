package com.company.homeWorkOOP;

public class PeriodOfTime {
    /*    Создать класс описывающие промежуток времени.
     *    Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
     *    Например 1 ч 5 мин 15 с, хранятся числа 1, 5, 15.
     *    Сделать методы для получения полного количества секунд в объекте (3915 с),
     *    полного количества минут в объекте(65 мин).
     *    Создать два конструктора:
     *    • получающий общее количество секунд
     *    • получающий часы, минуты и секунды по отдельности.*/

    private int hours;
    private int minutes;
    private int seconds;

    public PeriodOfTime(int seconds) {
        this.seconds = seconds % 60;
        this.minutes = seconds / 60;
        this.hours = seconds / 60 / 60;
    }

    public PeriodOfTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public static int calculateTotalSeconds(int hours, int minutes, int seconds) {
        int minutesFromHours = hours * 60 + minutes;
        int secondsFromMinutes = (minutesFromHours * 60) + seconds;
        return secondsFromMinutes;
    }

    public static int calculateTotalMinutes(int hours, int minutes, int seconds) {
        int minutesFromSeconds;
        if (seconds < 60) {
            minutesFromSeconds = 0;
        } else {
            minutesFromSeconds = seconds / 60;
            if (seconds % 60 > 30 && seconds % 60 < 60) {
                minutesFromSeconds++;
            }
        }
        int minutesFromHoursAndSeconds = hours * 60 + minutes + minutesFromSeconds;
        return minutesFromHoursAndSeconds;
    }

    public static void main(String[] args) {
        PeriodOfTime time = new PeriodOfTime(2, 15, 18);

        System.out.println(calculateTotalSeconds(time.hours, time.minutes, time.seconds) + " c.");
        System.out.println(calculateTotalMinutes(2, 15, 211) + " min.");
    }
}
