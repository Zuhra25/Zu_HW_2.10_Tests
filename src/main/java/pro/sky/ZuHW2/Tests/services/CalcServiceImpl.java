package pro.sky.ZuHW2.Tests.services;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public int plus(Integer arg1, Integer arg2) {
        return arg1 + arg2;
    }

    public int minus(Integer arg1, Integer arg2) {
        return arg1 - arg2;
    }

    public int multiply(Integer arg1, Integer arg2) {
        return arg1 * arg2;
    }

    public double divide(Integer arg1, Integer arg2) {
        if (arg2 == 0) {
            throw new IllegalArgumentException("Делить на ноль нельзя!!!");
        }
            return (double) arg1 / arg2;
    }

}
