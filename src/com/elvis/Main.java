package com.elvis;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //dealing with floating point and double
        //double is twice of float
        int myIntValue = 5/3;
        float myFloatValue =  5f /3f;
        //width of float = 32 (4 byte)
        double myDoubleValue = 5d /3d;
        //width of double = 64 (8 bytes)
        //decimal point will initial as double
        //RHL will initial with integer type

        System.out.println("myIntValue = " + myIntValue + " pound");
        System.out.println("myFloatValue = "+ myFloatValue + " pound");
        System.out.println("myDoubleValue = " + myDoubleValue + " pound");

        double pound = 0.45359237;
        double myIntValue2 = myIntValue * pound;
        double myFloatValue2 = myFloatValue * pound;
        myDoubleValue= myDoubleValue * pound;


        System.out.println("myIntValue = " + myIntValue2 + " kg");
        System.out.println("myFloatValue = "+ myFloatValue2 + " kg");
        System.out.println("myDoubleValue = " + myDoubleValue + " kg");




    }
}
