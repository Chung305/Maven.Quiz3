package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String result = "";
        for(int i = 0 ; i < str.length(); i++){
            if(i == indexToCapitalize){
                result += Character.toUpperCase(str.charAt(i));
            }else
                result += str.charAt(i);
        }
        return result;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        ArrayList<String> result = new ArrayList<>();

        for(int i = 0; i < string.length(); i++){
            for(int j = i+1; j <= string.length(); j++){
                result.add(string.substring(i,j));
            }
        }
        return result.toArray(new String[0]);

    }

    public static Integer getNumberOfSubStrings(String input){

        //// Stack overFlow ---> n(n+1)/2
        return (input.length() * (input.length() +1)) / 2 - 1;

    }
}
