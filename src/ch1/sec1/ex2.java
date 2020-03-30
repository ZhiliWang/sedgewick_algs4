package ch1.sec1;

import java.lang.*;
/*
1.1.2
Give the type and value of each of the following expressions:
a. (1 + 2.236)/2
b. 1 + 2 + 3 + 4.0
c. 4.1 >= 4
d. 1 + 2 + "3"
*/
public class ex2 {
    public static void main(String[] args) {
        double a = (1 + 2.236) / 2;
        double b = 1 + 2 + 3 + 4.0;
        boolean c = 4.1 >= 4;
        String d = 1 + 2 + "3";
        /*
        // can't figure out how to print the type as well
        printf("a: %1$.4f, and its type is %2$s.\n", a, typeOf(A)//(((Object)a).getClass().getName()));
        printf("b: %1$.1f, and its type is %2$s.\n", b, (((Object)b).getClass().getName()));
        printf("c: %1$b, and its type is %2$s.\n", c, (((Object)c).getClass().getName()));
        printf("d: %1$s, type: %2$s.\n", d, (((Object)d).getClass().getName()));

         */
        System.out.println("a) " + a);
        System.out.println("b) " + b);
        System.out.println("c) " + c);
        System.out.println("d) " + d);
    }
}