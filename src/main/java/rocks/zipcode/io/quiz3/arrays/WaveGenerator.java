package rocks.zipcode.io.quiz3.arrays;



/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String[] result = new String[str.length()];
        String temp = "";
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            for(int j = 0 ; j < str.length(); j++){
                if(i == j){
                    temp += Character.toUpperCase(str.charAt(j));

                }else
                    temp += str.charAt(j);

            }
            result[i] =  temp;
            temp = "";
        }
        return result;

    }
}
