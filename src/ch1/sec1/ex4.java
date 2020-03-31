package ch1.sec1;

/*
1.1.4 What(ifanything)is wrong with each of the following statements?
a. if (a > b) then c = 0;
b. if a > b { c = 0; }
c. if (a > b) c = 0;
d. if (a > b) c = 0 else b = 0;
*/

public class ex4 {
    public static void main(String[] args) {
        System.out.println("a. 'Then' is not a keyword.");
        System.out.println("b. Missing curly braces around if-then condition.");
        System.out.println("c. This statement is correct. No curly braca needed for a single-line if-then statement.");
        System.out.println("d. Missing semi-colons for the if-then statement.");
    }
}