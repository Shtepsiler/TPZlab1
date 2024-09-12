package org.example;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RomanArabicConverter {

    private static final Map<Integer, String> arabicToRomanMap = new HashMap<>();

        static {

            arabicToRomanMap.put(1, "I");
            arabicToRomanMap.put(4, "IV");
            arabicToRomanMap.put(5, "V");
            arabicToRomanMap.put(9, "IX");
            arabicToRomanMap.put(10, "X");
            arabicToRomanMap.put(40, "XL");
            arabicToRomanMap.put(50, "L");
            arabicToRomanMap.put(90, "XC");
            arabicToRomanMap.put(100, "C");
            arabicToRomanMap.put(400, "CD");
            arabicToRomanMap.put(500, "D");
            arabicToRomanMap.put(900, "CM");
            arabicToRomanMap.put(1000, "M");
        }

    public static String ArabicToRoman(int arabic) {
        if (!isValidArabic(arabic)) {
            throw new IllegalArgumentException("Arabic number must be between 1 and 3999");
        }

        StringBuilder result = new StringBuilder();

        Integer[] arabicValues = arabicToRomanMap.keySet().toArray(new Integer[0]);
        Arrays.sort(arabicValues, Collections.reverseOrder());

        for (Integer value : arabicValues) {
            while (arabic >= value) {
                result.append(arabicToRomanMap.get(value));
                arabic -= value;
            }
        }

        return result.toString();
    }


    public static boolean isValidArabic(int arabic) {
        return arabic > 0 && arabic <= 3999;
    }


}
