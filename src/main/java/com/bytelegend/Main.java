package com.bytelegend;

public class Main {
    public static byte int2byte(int i) {
        return (byte) i;
    }

    public static short int2short(int i) {
        return (short) i;
    }

    public static char int2char(int i) {
        return (char) i;
    }


    // Cast an int to String, e.g. 123 -> "123"
    public static String int2String(int i) {
        return  Integer.toString(i);
    }

    // Cast a String to int, e.g. "123" -> 123
    public static int string2int(String s) {
        int i = Integer.parseInt(s);
        return i;
    }

    // Cast a String to double, e.g. "1.23" -> 1.23
    public static double string2double(String s) {
        double d = Double.parseDouble(s);
        return d;
    }

    public static int castLong2int(Long l) {
        return l.intValue();
    }

    public static long double2Long(Double d) {
        return d.longValue();
    }
}
