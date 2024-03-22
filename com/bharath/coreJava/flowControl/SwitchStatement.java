package com.bharath.coreJava.flowControl;

public class SwitchStatement {


    public static void main(String[] args) {
        int x = 3;

        switch (x) {

            case 1: System.out.println(1);
                     break;
            case 2: System.out.print(2);
                     break;
            default : System.out.println("default");
        }
    }
}
