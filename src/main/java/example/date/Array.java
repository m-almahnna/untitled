package example.date;

import java.util.ArrayList;

public class Array {

    public static void main(String[] args) {

        int moBox [] = new int[7];
        moBox[0]=55;
        moBox[2]=8888;
        System.out.println(moBox[0]);


       int almBox[]={66,44,77};
        System.out.println(almBox[2]);

        ArrayList m7Box = new ArrayList(); // endless
        m7Box.add("Mohammed");
        m7Box.add("Abdullah");
        m7Box.add("Almahanna");

        m7Box.remove("Abdullah");
        System.out.println(m7Box.contains("Mohammed"));

       // m7Box.clear();

        System.out.println(m7Box);
    }
}
