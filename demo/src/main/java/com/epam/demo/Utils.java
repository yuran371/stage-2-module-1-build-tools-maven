package com.epam.demo;

import java.util.Iterator;
import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
//     	for (Iterator iterator = args.iterator(); iterator.hasNext();) {
//			String str = (String) iterator.next();
//	    	if (Double.parseDouble(str)>0) {
//	    		return true;
//	    	} else return false;
//		}
//		return true;
		
		
		
		
		if(args.stream().allMatch(x -> Double.parseDouble(x)>0)) {
			return true;
		} else return false;
    }
}