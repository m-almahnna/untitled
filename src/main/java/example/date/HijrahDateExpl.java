package example.date;

import java.time.LocalDate;
import java.time.chrono.HijrahChronology;
import java.util.Calendar;
import java.util.Date;
// i copy it
// i copy it
public class HijrahDateExpl {
    public static void main(String[] args) {
        Date date = new Date(); // Gregorian date

        Calendar cl=Calendar.getInstance();
        cl.setTime(date);

        java.time.chrono.HijrahDate islamyDate = HijrahChronology.INSTANCE.date(LocalDate.of(cl.get(Calendar.YEAR),cl.get(Calendar.MONTH)+1, cl.get(Calendar.DATE)));
//OUTPUT: Hijrah-umalqura AH 1436-02-03

        System.out.println(islamyDate);
    }


}
