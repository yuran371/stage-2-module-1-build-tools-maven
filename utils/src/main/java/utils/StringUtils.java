package utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
 	if (Double.parseDouble(str)>0) {
    		return true;
    	} else return false;
    }
}
