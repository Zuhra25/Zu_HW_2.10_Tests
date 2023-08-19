package pro.sky.ZuHW2.Tests.controllers;

import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;
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
        return calcService.plus(arg1, arg2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") Integer arg1, @RequestParam("num2") Integer arg2) {
        return calcService.minus(arg1, arg2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") Integer arg1, @RequestParam("num2") Integer arg2) {
        return calcService.multiply(arg1, arg2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") Integer arg1, @RequestParam("num2") Integer arg2) {
            return calcService.divide(arg1, arg2);
    }
    @ExceptionHandler({MissingServletRequestParameterException.class})
    public String handleException(MissingServletRequestParameterException e) {
        return "отсутсвует параметр!";
    }
}
