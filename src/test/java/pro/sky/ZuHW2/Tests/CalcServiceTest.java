package pro.sky.ZuHW2.Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.ZuHW2.Tests.services.CalcServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcServiceTest {
    CalcServiceImpl calcServiceImpl = new CalcServiceImpl();
    Integer arg1 = 11;
    Integer arg2 = 22;
    Integer arg11 = 100;
    Integer arg22 = -2;

    // сложение
    @Test
    public void sumOfdifferentnumbers1() {
        int result = calcServiceImpl.plus(arg1, arg2);
        Integer expectedResult = 33;
        assertEquals(expectedResult, result);
    }

    @Test
    public void sumOfdifferentnumbers2() {
        int result = calcServiceImpl.plus(arg11, arg22);
        Integer expectedResult = 98;
        assertEquals(expectedResult, result);
    }

    // вычитание
    @Test
    public void minusOfdifferentnumbers1() {
        int result = calcServiceImpl.minus(arg1, arg2);
        Integer expectedResult = -11;
        assertEquals(expectedResult, result);
    }

    @Test
    public void minusOfdifferentnumbers2() {
        int result = calcServiceImpl.minus(arg11, arg22);
        Integer expectedResult = 102;
        assertEquals(expectedResult, result);
    }

    //умножение
    @Test
    public void multiplyOfdifferentnumbers1() {
        int result = calcServiceImpl.multiply(arg1, arg2);
        Integer expectedResult = 242;
        assertEquals(expectedResult, result);
    }

    @Test
    public void multiplyOfdifferentnumbers2() {
        int result = calcServiceImpl.multiply(arg11, arg22);
        Integer expectedResult = -200;
        assertEquals(expectedResult, result);
    }

    // деление
    @Test
    public void divideOfdifferentnumbers1() {
        double result = calcServiceImpl.divide(arg1, arg2);
        double expectedResult = 0.5;
        assertEquals(expectedResult, result);
    }

    @Test
    public void divideOfdifferentnumbers2() {
        double result = calcServiceImpl.divide(arg11, arg22);
        double expectedResult = -50;
        assertEquals(expectedResult, result);
    }

    @Test
    public void divideByZero() {
        Integer arg111 = 11;
        Integer arg222 = 0;

        assertThrows(IllegalArgumentException.class, () -> {
            calcServiceImpl.divide(arg1, arg2);
        },"Ожидалось исключение IllegalArgumentException");
    }


}
