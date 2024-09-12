package org.example;
/*
  @author - Stepan Horyniuk
  @project - Lab2
  @date: 12.09.2024
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RomanArabicConverterValidationTests {

    @Test
    void WhenArabicEq_1ExectedTrue() {
        assertTrue(RomanArabicConverter.isValidArabic(1));
    }
    @Test
    void WhenArabicEq_3999ExectedTrue() {
        assertTrue(RomanArabicConverter.isValidArabic(3999));
    }
    @Test
    void WhenArabicEq_0ExectedFalse() {
        assertFalse(RomanArabicConverter.isValidArabic(0));
    }
    @Test
    void WhenArabicEq_negative1ExectedFalse() {
        assertFalse(RomanArabicConverter.isValidArabic(-1));
    }
    @Test
    void WhenArabicEq_4000ExectedFalse() {
        assertFalse(RomanArabicConverter.isValidArabic(4000));
    }
}
