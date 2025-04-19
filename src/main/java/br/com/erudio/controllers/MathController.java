package br.com.erudio.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo ){

        if (!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new IllegalArgumentException("apenas números são permitidos");
        }

        return convertToDouble(numberOne)+convertToDouble(numberTwo);
    }

    public  Double convertToDouble (String strNumber){
        if (strNumber == null || strNumber.isEmpty()) throw new IllegalArgumentException("apenas números são permitidos");
        String number = strNumber.replace(",",".");
        return  Double.parseDouble(number);
    }
    public boolean isNumeric(String strNumber){
        if (strNumber.isEmpty() || strNumber == null) return false;
        String number = strNumber.replace(",",".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
