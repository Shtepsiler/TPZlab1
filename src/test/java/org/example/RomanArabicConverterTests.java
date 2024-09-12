package org.example;
/*
  @author - Stepan Horyniuk
  @project - Lab2
  @date: 12.09.2024
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RomanArabicConverterTests {

    // test valid arabic
    // test one digit roman
    @Test
    void WhenArabicEq_1Expected_I() {
        assertEquals("I", RomanArabicConverter.ArabicToRoman(1));
    }

    @Test
    void WhenArabicEq_2Expected_II() {
        assertEquals("II", RomanArabicConverter.ArabicToRoman(2));
    }

    @Test
    void WhenArabicEq_3Expected_III() {
        assertEquals("III", RomanArabicConverter.ArabicToRoman(3));
    }

    @Test
    void WhenArabicEq_5Expected_V() {
        assertEquals("V", RomanArabicConverter.ArabicToRoman(5));
    }

    @Test
    void WhenArabicEq_10Expected_X() {
        assertEquals("X", RomanArabicConverter.ArabicToRoman(10));
    }

    @Test
    void WhenArabicEq_50Expected_L() {
        assertEquals("L", RomanArabicConverter.ArabicToRoman(50));
    }

    @Test
    void WhenArabicEq_100Expected_C() {
        assertEquals("C", RomanArabicConverter.ArabicToRoman(100));
    }

    @Test
    void WhenArabicEq_500Expected_D() {
        assertEquals("D", RomanArabicConverter.ArabicToRoman(500));
    }

     @Test
    void WhenArabicEq_1000Expected_M() {
        assertEquals("M", RomanArabicConverter.ArabicToRoman(1000));
    }

    @Test
    void WhenArabicEq_4Expected_IV() {
        assertEquals("IV", RomanArabicConverter.ArabicToRoman(4));
    }
    @Test
    void WhenArabicEq_9Expected_IX() {
        assertEquals("IX", RomanArabicConverter.ArabicToRoman(9));
    }

    @Test
    void WhenArabicEq_40Expected_XL() {
        assertEquals("XL", RomanArabicConverter.ArabicToRoman(40));
    }

    @Test
    void WhenArabicEq_90Expected_XC() {
        assertEquals("XC", RomanArabicConverter.ArabicToRoman(90));
    }

    @Test
    void WhenArabicEq_400Expected_CD() {
        assertEquals("CD", RomanArabicConverter.ArabicToRoman(400));
    }

    @Test
    void WhenArabicEq_900Expected_CM() {
        assertEquals("CM", RomanArabicConverter.ArabicToRoman(900));
    }

    @Test
    void WhenArabicEq_58Expected_LVIII() {
        assertEquals("LVIII", RomanArabicConverter.ArabicToRoman(58));
    }

    @Test
    void WhenArabicEq_99Expected_XCIX() {
        assertEquals("XCIX", RomanArabicConverter.ArabicToRoman(99));
    }

    @Test
    void WhenArabicEq_444Expected_CDXLIV() {
        assertEquals("CDXLIV", RomanArabicConverter.ArabicToRoman(444));
    }

    @Test
    void WhenArabicEq_944Expected_CMXLIV() {
        assertEquals("CMXLIV", RomanArabicConverter.ArabicToRoman(944));
    }

    @Test
    void WhenArabicEq_1888Expected_MDCCCLXXXVIII() {
        assertEquals("MDCCCLXXXVIII", RomanArabicConverter.ArabicToRoman(1888));
    }

    @Test
    void WhenArabicEq_1987Expected_MCMLXXXVII() {
        assertEquals("MCMLXXXVII", RomanArabicConverter.ArabicToRoman(1987));
    }

    @Test
    void WhenArabicEq_1994Expected_MCMXCIV() {
        assertEquals("MCMXCIV", RomanArabicConverter.ArabicToRoman(1994));
    }

     @Test
    void WhenArabicEq_2023Expected_MMXXIII() {
        assertEquals("MMXXIII", RomanArabicConverter.ArabicToRoman(2023));
    }

    @Test
    void WhenArabicEq_2444Expected_MMCDXLIV() {
        assertEquals("MMCDXLIV", RomanArabicConverter.ArabicToRoman(2444));
    }

    @Test
    void WhenArabicEq_2766Expected_MMDCCLXVI() {
        assertEquals("MMDCCLXVI", RomanArabicConverter.ArabicToRoman(2766));
    }

    @Test
    void WhenArabicEq_2888Expected_MMDCCCLXXXVIII() {
        assertEquals("MMDCCCLXXXVIII", RomanArabicConverter.ArabicToRoman(2888));
    }

    @Test
    void WhenArabicEq_3333Expected_MMMCCCXXXIII() {
        assertEquals("MMMCCCXXXIII", RomanArabicConverter.ArabicToRoman(3333));
    }

    @Test
    void WhenArabicEq_3555Expected_MMMDLV() {
        assertEquals("MMMDLV", RomanArabicConverter.ArabicToRoman(3555));
    }
    @Test
    void WhenArabicEq_3749Expected_MMMDCCXLIX() {
        assertEquals("MMMDCCXLIX", RomanArabicConverter.ArabicToRoman(3749));
    }
    @Test
    void WhenArabicEq_3888Expected_MMMDCCCLXXXVIII() {
        assertEquals("MMMDCCCLXXXVIII", RomanArabicConverter.ArabicToRoman(3888));
    }

    @Test
    void WhenArabicEq_3990Expected_MMMCMXC() {
        assertEquals("MMMCMXC", RomanArabicConverter.ArabicToRoman(3990));
    }

    @Test
    void WhenArabicEq_3999Expected_MMMCMXCIX() {
        assertEquals("MMMCMXCIX", RomanArabicConverter.ArabicToRoman(3999));
    }

    // test invalid arabic
    @Test
    void WhenArabicEq_negative10Expected_IllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> RomanArabicConverter.ArabicToRoman(-10));
    }

    @Test
    void WhenArabicEq_0Expected_IllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> RomanArabicConverter.ArabicToRoman(0));
    }

    @Test
    void WhenArabicEq_4000Expected_IllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> RomanArabicConverter.ArabicToRoman(4000));
    }

    @Test
    void WhenArabicEq_MIN_VALUEExpected_IllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> RomanArabicConverter.ArabicToRoman(Integer.MIN_VALUE));
    }

    @Test
    void WhenArabicEq_MAX_VALUEExpected_IllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> RomanArabicConverter.ArabicToRoman(Integer.MAX_VALUE));
    }





}