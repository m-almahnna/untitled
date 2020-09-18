package example.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class LocalDateProject {
    public static void main(String[] args) {

        LocalDateTime localDate = LocalDateTime.now();
        System.out.println(localDate);


        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM - dd - yyyy");
        System.out.println(dateFormat.format(localDate));



    }

}
