package com.dataparse.request_builder;

import java.util.Arrays;
import java.util.List;

public class Utils {
	private static final List<String> RESERVED_WORDS = Arrays.asList(new String[] { "and", "or", "not", "in", "is", "true", "false", "like", "between" });

	public static boolean isReservedWorld(String s) {
		return RESERVED_WORDS.contains(s.toLowerCase());
	}

	public static boolean isNumber(String s) {
	    try {
		    Double.parseDouble(s);
		    
		    return s.startsWith("0.") || !s.startsWith("0");
	    } catch (Exception e) {
	    	return false;
	    }
	}
}
