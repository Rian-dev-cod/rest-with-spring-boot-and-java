package br.com.rian.eurudio.controllers;

import br.com.rian.eurudio.service.MathService;
import br.com.rian.eurudio.ultil.NumberConverter;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    private final MathService mathService;

    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    // GET /math/sum/3/5
    @GetMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable String numberOne,
            @PathVariable String numberTwo) {

        Double num1 = NumberConverter.convertToDouble(numberOne);
        Double num2 = NumberConverter.convertToDouble(numberTwo);

        return mathService.sum(num1, num2);
    }

    // GET /math/sub/3/5
    @GetMapping("/sub/{numberOne}/{numberTwo}")
    public Double sub(
            @PathVariable String numberOne,
            @PathVariable String numberTwo) {

        Double num1 = NumberConverter.convertToDouble(numberOne);
        Double num2 = NumberConverter.convertToDouble(numberTwo);

        return mathService.sub(num1, num2);
    }

    // GET /math/div/10/2
    @GetMapping("/div/{numberOne}/{numberTwo}")
    public Double division(
            @PathVariable String numberOne,
            @PathVariable String numberTwo) {

        Double num1 = NumberConverter.convertToDouble(numberOne);
        Double num2 = NumberConverter.convertToDouble(numberTwo);

        if (num2 == 0) {
            throw new UnsupportedOperationException("Não é possível dividir por zero.");
        }

        return mathService.division(num1, num2);
    }

    // GET /math/sqrt/9
    @GetMapping("/sqrt/{numberOne}")
    public Double sqrt(@PathVariable String numberOne) {

        Double num = NumberConverter.convertToDouble(numberOne);

        if (num < 0) {
            throw new UnsupportedOperationException("Não é possível calcular raiz de número negativo.");
        }

        return mathService.sqrt(num);
    }

    // GET /math/avg/4/6
    @GetMapping("/avg/{numberOne}/{numberTwo}")
    public Double average(
            @PathVariable String numberOne,
            @PathVariable String numberTwo) {

        Double num1 = NumberConverter.convertToDouble(numberOne);
        Double num2 = NumberConverter.convertToDouble(numberTwo);

        return mathService.average(num1, num2);
    }
}
