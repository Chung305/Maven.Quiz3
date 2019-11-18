package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {
        int counter = 0;
        int squared;
        for(int i = 0; i < inputArray.length; i++){
            squared = inputArray[i] * inputArray[i];
            for(int j = 0; j < squaredValues.length; j++){
                System.out.println(squaredValues[j] + " = " + squared);
                if(squared == squaredValues[j])
                    break;
                else if(squared != squaredValues[j] && j == squaredValues.length){
                    counter++;
                }

            }

        }
        return counter == 0;
    }
}
