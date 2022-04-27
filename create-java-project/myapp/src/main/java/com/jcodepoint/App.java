package com.jcodepoint;

import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
    	String normal = "This is Java Programming";

    	String reversed = StringUtils.reverse(normal);

    	System.out.println("-> Normal: " + normal);
    	System.out.println("-> Reversed: " + reversed);
    }
}
