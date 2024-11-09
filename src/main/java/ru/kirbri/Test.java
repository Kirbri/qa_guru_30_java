package ru.kirbri;

public class Test {
    public static void main(String[] args) {
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(isFalse | isTrue && isFalse);
        System.out.println(isFalse || isTrue);
        System.out.println(isFalse & isTrue);
        System.out.println(isTrue && isTrue | isFalse);
        System.out.println(isTrue == isFalse);

        byte minByte = -128;
        byte maxByte = 127;
//        byte newMin = minByte + 1;
//        byte newMax = maxByte + 1;

        System.out.println(minByte + minByte);
        System.out.println(minByte + 1);
        System.out.println(maxByte + maxByte);
        System.out.println((minByte - 1) > maxByte);


        short minShort = - 32_768;
        short maxShort = 32_767;
        System.out.println(minShort * maxShort);
        System.out.println(minShort - 1);
        System.out.println(maxShort + 1);
        System.out.println((maxByte * minShort) == (maxShort * minByte));

        int minInt = - 2_147_483_648;
        int maxInt = 2_147_483_647;
        System.out.println(minInt - 1);
        System.out.println(maxInt + 1);
        System.out.println(minInt == (maxInt + 1));

        long minLong = - 9_223_372_036_854_775_808L;
        long maxLong = 9_223_372_036_854_775_807L;
        System.out.println(minLong - 1);
        System.out.println(maxLong + 1);
        System.out.println((minLong * -1 - 1) == maxLong);

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println(minFloat * maxFloat);
        System.out.println(maxFloat * maxFloat); //Infinity ?
        System.out.println(minFloat == Float.MIN_VALUE);

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println(minDouble - 1);
        System.out.println(maxDouble + 1);
        System.out.println(maxDouble * maxFloat); //Infinity ?
        System.out.println(minDouble * maxFloat);
        System.out.println(maxDouble >= maxFloat);
        System.out.println(maxDouble <= maxLong);

        char minChar = Character.MIN_VALUE;
        char maxChar = Character.MAX_VALUE;
        System.out.println(--minChar); //?
        System.out.println(minChar - 1);
        System.out.println(++maxChar); //?
        System.out.println(maxChar + 1);
        System.out.println(maxChar == Character.MAX_VALUE);
        System.out.println(minChar != 0);

        String simpleVar = new String("Hello!");
        System.out.println(simpleVar);

        System.out.println(--maxChar + maxFloat);
        System.out.println(minFloat + maxDouble);
        System.out.println(maxByte + minChar);
        System.out.println(minDouble + minChar);

        int a = 60;	/* 60 = 0011 1100 */
        int b = 13;	/* 13 = 0000 1101 */
        int c = 0;

        c = a & b;       /* 12 = 0000 1100 */
        System.out.println("a & b = " + c );

        c = a | b;       /* 61 = 0011 1101 */
        System.out.println("a | b = " + c );

        c = a ^ b;       /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c );

        c = ~a;          /*-61 = 1100 0011 */
        System.out.println("~a = " + c );

        c = a << 2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c );

        c = a >> 2;     /* 15 = 1111 */
        System.out.println("a >> 2  = " + c );

        c = a >> 4;
        System.out.println("a >> 4  = " + c );

        c = a >>> 2;     /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c );
    }
}
