package org.umittas;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2024,3,17);
        LocalDate ld3 = LocalDate.of(2015,3,16);

        //Invalid date will give an error on compile time.
        //LocalDate invalidDate = LocalDate.of(2022,13,1);

        System.out.println("LocalDate1: " +ld1);
        System.out.println("LocalDate2: " +ld2);
        System.out.println("LocalDate3: " +ld3);

        //Times
        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.of(10,5);

        System.out.println("LocalTime1: " +lt1);
        System.out.println("Localtime2: " +lt2);

        //datetimes

        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2022,2,1,2,3);
        LocalDateTime ldt3 = LocalDateTime.of(ld1,lt1);
        //Monthday

        MonthDay monthDay = MonthDay.of(7,8);
        LocalDate newLocalDate = monthDay.atYear(2022);
    }
}