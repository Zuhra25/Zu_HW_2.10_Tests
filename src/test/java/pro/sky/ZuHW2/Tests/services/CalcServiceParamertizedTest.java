package pro.sky.ZuHW2.Tests.services;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalcServiceParamertizedTest {
    CalcServiceImpl calcServiceImpl = new CalcServiceImpl();

    // сложение
    public static Stream<Arguments> sumByParameters() {
        return Stream.of(
                Arguments.of(11, 22, "11 + 22 = 33"),
                Arguments.of(100, -2, "100 + -2 = 98")
                );
    }
    @ParameterizedTest
    @MethodSource("sumByParameters")
    void plus(int arg1, int arg2, String result){
       assertEquals(result,calcServiceImpl.plus(arg1,arg2));
    }

    // вычитание
    public static Stream<Arguments> minusByParameters() {
        return Stream.of(
                Arguments.of(11, 22, "11 - 22 = -11"),
                Arguments.of(100, -2, "100 - -2 = 102")
        );
    }
    @ParameterizedTest
    @MethodSource("minusByParameters")
    void minus(int arg1, int arg2, String result){
        assertEquals(result,calcServiceImpl.minus(arg1,arg2));
    }

    //умножение
    public static Stream<Arguments> multiplyByParameters() {
        return Stream.of(
                Arguments.of(11, 22, "11 * 22 = 242"),
                Arguments.of(100, -2, "100 * -2 = -200")
        );
    }
    @ParameterizedTest
    @MethodSource("multiplyByParameters")
    void multiply(int arg1, int arg2, String result){
        assertEquals(result,calcServiceImpl.multiply(arg1,arg2));
    }

    // деление
    public static Stream<Arguments> divideByParameters() {
        return Stream.of(
                Arguments.of(11, 22, "11 / 22 = 0,5"),
                Arguments.of(100, -2, "100 / -2 = -50,0")
        );
    }
    @ParameterizedTest
    @MethodSource("divideByParameters")
    void divide(int arg1, int arg2, String result){
        assertEquals(result,calcServiceImpl.divide(arg1,arg2));
    }
}