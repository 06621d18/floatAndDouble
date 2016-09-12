/**
 * Created by lkc_2_000 on 9/8/2016.
 */
public class PrimitiveTop {
    public static void main (String[] argc){
        //byte
        //short
        //int
        //float
        //double
        //char
        //boolean
        //eight basic type

        //String is a sequence of character
        String mystring = "This is a string";
        mystring = mystring + "  hello world";
        System.out.println(mystring);
        //string can jbe combine with char

        String numberString = "2.5";
        numberString = numberString + "2.5";
        System.out.println(numberString);
        //we dealing with string char only
        //later will convert the numberical string to integer

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
        // JAVA decided convert the integer into string appended to the string

        double doublenumber = 1230.342;
        lastString = lastString + doublenumber;
        System.out.println(lastString);

        // string's flexibility
        //add delete into string

    }
}
