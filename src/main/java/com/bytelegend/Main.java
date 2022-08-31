package com.bytelegend;

public class Main {
    public static byte int2byte(int i) {
        byte b = (byte) i;
        return b;
    }

    public static short int2short(int i) {
        short b = (short) i;
        return b;
    }

    public static char int2char(int i) {
        char b = (char) i;
        return b;
    }

    // Cast an int to String, e.g. 123 -> "123"
    public static String int2String(int i) {
        String b = String.valueOf(i);
        return b;
    }

    // Cast a String to int, e.g. "123" -> 123
    public static int string2int(String s) {
        int b = Integer.parseInt(s);
        return b;
    }

    // Cast a String to double, e.g. "1.23" -> 1.23
    public static double string2double(String s) {
        double b = Double.parseDouble(s);
        return b;
    }

    public static int castLong2int(Long l) {
        int b = (int) l;
        return b;
    }

    public static long double2Long(Double d) {
        Long b = (long) d;
        return b;
    }
}
