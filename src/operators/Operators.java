/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

/**
 *
 * @author carateresa 
 */
public class Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        integerTest();
        mathTest();
        incrementAndModulus();
        compoundAssignmentTest();
        toggleValueTest();

    }

    private static void integerTest() {
        int radius = 2;
        double pi = 3.141592653;
        double d;
        int i;

        d = pi;

        System.out.println("d = " + d);

        d = radius;

        System.out.println("d = " + d);

        i = (int) pi;
        System.out.println("i = " + i);

    }

    private static void mathTest() {
        double dfive = 5.0;
        int five = 5;
        int two = 2;
        int result;
        double dresult;

        System.out.println("5 x 2 = " + (five * two));
        System.out.println("5 / 2 = " + (five / two));

        result = five / two;
//        dresult = dfive / two;
        dresult = (double) (five / two);

        System.out.println("5 / 2 = " + result);
        System.out.println("5 / 2 = " + dresult);

        result = 1 + 2 * 3;
        result = -2 * (3 + 4);
        result = -result;

        System.out.println("The sum is = " + result);

        System.out.println("5 % 2 = " + (five % two));

    }

    private static void incrementAndModulus() {
        int i = 10;
        int n = i++ % 5;
        System.out.println("n = " + n);
        System.out.println("i = " + i);

        i = 10;
        int m = ++i % 5;
        System.out.println("m = " + m);
        System.out.println("i = " + i);

//        Answer to question in #1:
//        The implication of using the "pre-increment" operator (++i) versus the "post-increment" operator (i++)
//        is that using the pre-increment makes the “m” value equal to 1 (the extra plus at the beginning = 1.) 
//        The post-increment just makes the “n” value 0 (since the plus signs are at the end of the increment, the value is 0.)
    }

    public static void compoundAssignmentTest() {

        int result = 1 + 2; // result is now 3

        System.out.println(result);

//          result = result -1; // result is now 2
        result -= 1;
        System.out.println(result);

//          result = result * 2; // result is now 4
        result *= 2;
        System.out.println(result);

//          result = result / 2; // result is now 2
        result /= 2;

        System.out.println(result);

//          result = result +8; // result is now 10
        result += 8;
        System.out.println(result);

//          result = result %7; // result is now 3
        result %= 7;

        System.out.println(result);
    }

    public static boolean toggleValue(boolean myValue) {
        return! myValue;
    }

    public static void toggleValueTest() {

        //declare a boolean variable called "bValue", and assign the value "false" to it
        boolean bValue = false;
        
        //print out the value of "bValue"
        System.out.println("The first bValue = " + bValue);
        
        //call the toggleValue method using "bValue" as the parameter, and assign the result back into "bValue"
        bValue = toggleValue(bValue);
        
        //print out the value of "bValue" (note: this should now be "true")
        System.out.println("The second bValue = " + bValue);
        
        //again call the toggleValue method using "bValue" as the parameter, and assign the result back into "bValue"
        bValue = toggleValue(bValue);
        
        //print out the value of "bValue" (note: this should now be "false")
        System.out.println("The last bValue = " +bValue);

    }

}
