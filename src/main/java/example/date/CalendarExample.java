package example.date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat();
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.YEAR));

        System.out.println(cal.getTime());

        System.out.println(dateFormat.format(cal.getTime()));
    }
}
