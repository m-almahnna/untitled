package example.date;

public class String2Int {
    public static void main(String[] args) {
        // String to int


        String m = "122";
        int w = 1000000;

       // Integer.parseInt(m);
        int n = Integer.parseInt(m);

        System.out.println(n);// N = M of int
        System.out.println();

        System.out.println(m); // M = String
        System.out.println();

        System.out.println(m+n); // M = String , N = int of M
        System.out.println();

        System.out.println(n+2); // N = int of M + 2
        System.out.println();

        System.out.println(m+w); // M String + int W
        System.out.println();

        System.out.println(n+w); // N = int of M + int w
        System.out.println("-------------------");
        String myAge= " My Age : 28";
        myAge = myAge.replaceAll("\\D+","");

        System.out.println(myAge);
    }
}
