package com.nando.pruebas.calculator;

public class Calculator {

    public static int sum(Integer num1,Integer num2) {
        try{
            return num1+num2;
        }catch (NullPointerException ex)
        {
            throw new IllegalArgumentException("No se aceptan valores Nulos");
        }
    }

    public static int res(Integer num1,Integer num2){
        try{
            return num1-num2;
        }catch (NullPointerException ex){
            throw  new IllegalArgumentException("No se aceptan valores nulos");
        }
    }

    public static int mul(Integer num1,Integer num2){
        try{
            return  num1*num2;
        }catch (NullPointerException ex){
            throw new IllegalArgumentException("No se aceptan valores nulos");
        }
    }

    public static int div(Integer num1,Integer num2){
        if(num2==0)
            throw new IllegalArgumentException("Division por cero no permitida");
        try {
            return num1/num2;
        }catch (NullPointerException ex)
        {
            throw new IllegalArgumentException("No se permiten valores nulos");
        }
    }

}
