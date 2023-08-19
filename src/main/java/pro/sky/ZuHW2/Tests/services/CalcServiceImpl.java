package pro.sky.ZuHW2.Tests.services;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(Integer arg1, Integer arg2) {
        return String.format("%d + %d = %d", arg1, arg2, arg1 + arg2);
    }

    public String minus(Integer arg1, Integer arg2) {
        return String.format("%d - %d = %d", arg1, arg2, arg1 - arg2);
    }

    public String multiply(Integer arg1, Integer arg2) {
        return String.format("%d * %d = %d", arg1, arg2, arg1 * arg2);
    }

    public String divide(Integer arg1, Integer arg2) {
        if (arg2 == 0) {
            throw new IllegalArgumentException("Делить на ноль нельзя!!!");
        }
            return String.format("%d / %d = %.1f", arg1, arg2, (double) arg1 / arg2);
    }

}
