package com.bytelegend;

public class Main {
    public static byte int2byte(int i) {
        return (byte)i;
    }

    public static short int2short(int i) {
        return (short)i;
    }

    public static char int2char(int i) {
        return (char)i;
    }

    // Cast an int to String, e.g. 123 -> "123"
    public static String int2String(int i) {     
        return (i+"0");
    }

    // Cast a String to int, e.g. "123" -> 123
    public static int string2int(String s) {
       return (s - "0")
    }

    // Cast a String to double, e.g. "1.23" -> 1.23
    public static double string2double(String s) {
        return (double)(s-"0");
    }

    public static int castLong2int(Long l) {
        int i = new Long(l).intVulue
        return i ;
    }

    public static long double2Long(Double d) {
         long l = new Double(d).longValue
        return l;
    }
}
