import java.util.*;
public class Main {
    // Q1 Solution: Program to get the sum of a given Array
    // Solution works for numbers but lacks edge cases for string or other data types.
    // The question was a little open-ended as to how deep we should take it but given
    // we are looking for a sum the assumption is we are working with numbers.
    // Not sure which type, but I chose doubles based on the Q2 code.
    public static double getSum(double[] numsArray) {
        double total = 0;
        for(double num : numsArray) {
            total += num;
        }
        return total;
    }

    // Q3 Solution:
    public static int[] toPower(int size, int power) {
        int[] powerArray = new int[size];

        for(int i = 0; i < size; i++) {
            powerArray[i] = (int) Math.pow(i, power);
        }
        return powerArray;
    }
    public static void main(String[] args) {
        //Q1 Solution: Testing of code
        double[] testArray = {7,4,5,6,2,8};
        System.out.println(getSum(testArray));

        // Q2: My answer is that this will throw an error because of <> around the
        // exampleArray.length statement.  Although if written correctly (i < exampleArray; i++)
        // index would return 2.  Let's see what happens?
//        double[ ] exampleArray = {1,5,6,5,4,1};
//        double maximum = exampleArray[0];
//        int index = 0;
//
//        for (int i = 1; i <exampleArray.length>; i++){
//            if (exampleArray[ i ] > maximum) {
//                maximum = exampleArray[ i ];
//                index = i;
//            }
//        }
//        System.out.println(index);

        // Q3 Solution: Testing of code
        System.out.println(Arrays.toString(toPower(8, 5)));

    }
}
