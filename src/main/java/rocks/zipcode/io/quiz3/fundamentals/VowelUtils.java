package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        return word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u");
    }

    public static Integer getIndexOfFirstVowel(String word) {
        for(int i = 0; i < word.length(); i++){
            if(hasVowels(String.valueOf(word.charAt(i)).toLowerCase())){
                return i;
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        return hasVowels(String.valueOf(word.charAt(0)).toLowerCase());
    }

    public static Boolean isVowel(Character character) {
        return hasVowels(character.toString().toLowerCase());
    }
}
