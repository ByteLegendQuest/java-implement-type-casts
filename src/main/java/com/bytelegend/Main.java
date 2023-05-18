package com.bytelegend;

public class Main {
    public static byte int2byte(int i) {
        byte b = (byte) i;
        return b;
    }

    public static short int2short(int i) {
        short s = (short) i;
        return s;
    }

    public static char int2char(int i) {
        char c = (char) i;
        return c;
    }

    // Cast an int to String, e.g. 123 -> "123"
    public static String int2String(int i) {
        String s = Integer.toString(i);
        return s;
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
        int i = l.intValue();
        return i;
    }

    public static long double2Long(Double d) {
        Long l =  Math.round(d);
        return l;
    }
}
