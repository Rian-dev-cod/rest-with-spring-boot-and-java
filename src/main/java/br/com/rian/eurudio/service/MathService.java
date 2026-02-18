package br.com.rian.eurudio.service;

import org.springframework.stereotype.Service;

@Service
public class MathService {

    public Double sum(Double numberOne, Double numberTwo){
        return numberOne + numberTwo;
    }

    public Double sub(Double numberOne, Double numberTwo){
        return numberOne - numberTwo;
    }

    public Double division(Double numberOne, Double numberTwo){
        return numberOne / numberTwo;
    }

    public Double average(Double numberOne, Double numberTwo){
        return (numberOne + numberTwo) / 2;
    }

    public Double sqrt(Double number){
        return Math.sqrt(number);
    }
}
