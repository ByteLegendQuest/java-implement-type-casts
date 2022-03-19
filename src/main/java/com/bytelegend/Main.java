package com.bytelegend;

public class Main {
    public static byte int2byte(int i) {
        return (byte) i / 2;
    }

    public static short int2short(int i) {
        return (short) i / 2;
    }

    public static char int2char(int i) {
        return (char) i / 2;
    }

    // Cast an int to String, e.g. 123 -> "123"
    public static String int2String(int i) {
        return i + "";
    }

    // Cast a String to int, e.g. "123" -> 123
    public static int string2int(String s) {
        return Integer.valueOf(s);
    }

    // Cast a String to double, e.g. "1.23" -> 1.23
    public static double string2double(String s) {
        return Double.valueOf(s);
    }

    public static int castLong2int(Long l) {
        return (int) l;
    }

    public static long double2Long(Double d) {
        return (long) d;
    }
}
