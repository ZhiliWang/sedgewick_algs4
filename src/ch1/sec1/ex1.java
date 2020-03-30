package ch1.sec1;

/*
1.1.1

Give the value of each of the following expressions:
a. ( 0 + 15 ) / 2
b. 2.0e-6 * 100000000.1
c. true && false || true && true

 */
public class ex1 {
    public static void main(String[] args) {
        int a = (0 + 15) / 2;
        double b = 2.0e-6 * 100000000.1;
        boolean c = true && false || true && true;
        System.out.printf("Result of a is %01d.\n", a);
        System.out.printf("Result of b is %.8f.\n", b);
        System.out.printf("Result of c is %b.\n", c);
    }
}
