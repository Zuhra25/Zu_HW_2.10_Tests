package pro.sky.ZuHW2.Tests.services;

import org.junit.jupiter.api.Test;
import pro.sky.ZuHW2.Tests.services.CalcServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcServiceTest {
    CalcServiceImpl calcServiceImpl = new CalcServiceImpl();
    int arg1 = 11;
    int arg2 = 22;
    int arg11 = 100;
    int arg22 = -2;

    // сложение
    @Test
    public void sumOfdifferentnumbers1() {
        String result = calcServiceImpl.plus(arg1, arg2);
        String expectedResult = "11 + 22 = 33";
        assertEquals(expectedResult, result);
    }

    @Test
    public void sumOfdifferentnumbers2() {
        String result = calcServiceImpl.plus(arg11, arg22);
        String expectedResult = "100 + -2 = 98";
        assertEquals(expectedResult, result);
    }

    // вычитание
    @Test
    public void minusOfdifferentnumbers1() {
        String result = calcServiceImpl.minus(arg1, arg2);
        String expectedResult = "11 - 22 = -11";
        assertEquals(expectedResult, result);
    }

    @Test
    public void minusOfdifferentnumbers2() {
        String result = calcServiceImpl.minus(arg11, arg22);
        String expectedResult = "100 - -2 = 102";
        assertEquals(expectedResult, result);
    }

    //умножение
    @Test
    public void multiplyOfdifferentnumbers1() {
        String result = calcServiceImpl.multiply(arg1, arg2);
        String expectedResult ="11 * 22 = 242";
        assertEquals(expectedResult, result);
    }

    @Test
    public void multiplyOfdifferentnumbers2() {
        String result = calcServiceImpl.multiply(arg11, arg22);
        String expectedResult = "100 * -2 = -200";
        assertEquals(expectedResult, result);
    }

    // деление
    @Test
    public void divideOfdifferentnumbers1() {
        String result = calcServiceImpl.divide(arg1, arg2);
        String expectedResult = "11 / 22 = 0,5";
        assertEquals(expectedResult, result);
    }

    @Test
    public void divideOfdifferentnumbers2() {
        String result = calcServiceImpl.divide(arg11, arg22);
        String expectedResult = "100 / -2 = -50,0";
        assertEquals(expectedResult, result);
    }

    @Test
    public void divideByZero() {
        int arg111 = 11;
        int arg222 = 0;

        assertThrows(IllegalArgumentException.class, () -> {
            calcServiceImpl.divide(arg111, arg222);
        }, "Ожидалось исключение IllegalArgumentException");
    }


}
