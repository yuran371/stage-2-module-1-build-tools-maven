package utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
 	if (Integer.parseInt(str)>0) {
    		return true;
    	} else return false;
    }
}
