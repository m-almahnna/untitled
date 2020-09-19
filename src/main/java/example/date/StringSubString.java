package example.date;

public class StringSubString {
    public static void main(String[] args) {
        String myName = "Mohammed Almahnna";

        String myFirst = myName.substring(0,8);

        System.out.println(myFirst);

        String myLast = myName.substring(9);
       // String myLast = myName.substring(9,myName.length());
        System.out.println(myLast);

    }
}
