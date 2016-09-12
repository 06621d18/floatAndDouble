/**
 * Created by lkc_2_000 on 9/8/2016.
 */
public class Operators {
    public static void main (String[] args){
        //major operators
        double value = 20;
        double value2 = 80;
        value2 = (value2+value) *25;
        System.out.println("my total is" + value2);
        value2 = value2 % 40;

        System.out.println(value2);
        if (value2 <= 20){
            System.out.println("Total was over the limit");
        }
        else{
            System.out.println("it isnt over the limit");
        }

    }
}
