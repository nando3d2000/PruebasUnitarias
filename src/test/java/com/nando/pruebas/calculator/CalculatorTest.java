package com.nando.pruebas.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void MethodSumParams4And3Return7() {
        //Arrange
        Integer num1 = 4;
        Integer num2 = 3;
        Integer expected = 7;

        //Act
        Integer result = Calculator.sum(num1, num2);

        //Assert
        assertEquals(expected,result);
    }

    @Test
    void MethodSumParamsNullAnd7ReturnIllegalArgumentException(){
        //Arrange
        Integer num1=null;
        Integer num2=7;

        //Assert
        assertThrows(IllegalArgumentException.class,()->Calculator.sum(num1,num2));
    }


    @Test
    void MethodDivParams5And0ReturnsIllegalArgumentException() {
        //Arrange
        Integer num1=5;
        Integer num2=0;

        //Assert
        assertThrows(IllegalArgumentException.class,()->div(num1,num2));
    }
}