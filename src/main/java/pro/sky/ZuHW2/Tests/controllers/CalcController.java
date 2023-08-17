package pro.sky.ZuHW2.Tests.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.ZuHW2.Tests.services.CalcService;

@RestController
@RequestMapping("/calculator")
public class CalcController {

    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String hello() {
        return calcService.hello();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") Integer arg1, @RequestParam("num2") Integer arg2) {
        return String.format("%d + %d = %d", arg1, arg2, calcService.plus(arg1, arg2));
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") Integer arg1, @RequestParam("num2") Integer arg2) {
        return String.format("%d - %d = %d", arg1, arg2, calcService.minus(arg1, arg2));
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") Integer arg1, @RequestParam("num2") Integer arg2) {
        return String.format("%d * %d = %d", arg1, arg2, calcService.multiply(arg1, arg2));
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") Integer arg1, @RequestParam("num2") Integer arg2) {
        if (arg2 == 0) {
            return String.format("Делить на ноль нельзя!!!");
        } else {
            return String.format("%d / %d = %.1f", arg1, arg2, calcService.divide(arg1, arg2));
        }
    }
}
