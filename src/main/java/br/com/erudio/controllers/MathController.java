package br.com.erudio.controllers;
import br.com.erudio.math.SimpleMath;
import br.com.erudio.request.converters.NumberConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    private SimpleMath math = new SimpleMath();

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo ){

        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new IllegalArgumentException("Please set a numeric value!");
        }

        return math.sum(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
    }
    @RequestMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo ){

        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new IllegalArgumentException("Please set a numeric value!");
        }

        return math.subtraction(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
    }
    @RequestMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo ){

        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new IllegalArgumentException("Please set a numeric value!");
        }

        return math.multiplication(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
    }
    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public Double division (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo ){

        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new IllegalArgumentException("Please set a numeric value!");
        }

        return math.division(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
    }
    @RequestMapping("/squareRoot/{number}")
    public Double squareRoot (
            @PathVariable("number") String number){

        if (!NumberConverter.isNumeric(number)){
            throw new IllegalArgumentException("Please set a numeric value!");
        }

        return math.squareRoot(NumberConverter.convertToDouble(number));
    }
    @RequestMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo ){

        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new IllegalArgumentException("Please set a numeric value!");
        }

        return math.mean(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
    }
}
