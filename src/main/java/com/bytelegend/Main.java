package com.bytelegend;

public class Main {
    public static byte int2byte(int i) {
        byte b = (byte) i;
        return b;
    }

    public static short int2short(int i) {
        short s = (short)i;
        return s;
    }

    public static char int2char(int i) {
        char c = (char) i;
        return c;
    }

    // Cast an int to String, e.g. 123 -> "123"
    public static String int2String(int i) {
        String s = String.valueOf(i);
        return s;
    }

    // Cast a String to int, e.g. "123" -> 123
    public static int string2int(String s) {
        int i = Integer.valueOf(s);
        return i;
    }

    // Cast a String to double, e.g. "1.23" -> 1.23
    public static double string2double(String s) {
        double d = Double.valueOf(s);
        return d;
    }

    public static int castLong2int(Long l) {
        int i = Integer.valueOf(l.toString());
        return i;
    }

    public static long double2Long(Double d) {
        long l = Long.valueOf(d.toString());
        return l;
    }
}
