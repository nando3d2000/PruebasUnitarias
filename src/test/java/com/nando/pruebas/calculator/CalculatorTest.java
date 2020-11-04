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
    void MethodDivParams5And0ReturnsArithmeticException() {
        //Arrange
        Integer num1=5;
        Integer num2=0;

        //Assert
        assertThrows(ArithmeticException.class,()->Calculator.div(num1,num2));
    }
    
    @Test
    void MethodDivParams10And5Returns2() {
    	//Arrange
    	Integer num1=10;
    	Integer num2=5;
    	Integer expected=2;
    	//Act
    	Integer result=Calculator.div(num1,num2);
    	//Assert
    	assertEquals(expected,result);
    }
    
    @Test
    void MethodDivParamsNullAnd3ReturnsIllegalArgumentException(){
    	//Arrange
    	Integer num1=null;
    	Integer num2=3;
    	
    	
    	//Assert
    	assertThrows(IllegalArgumentException.class,()->Calculator.div(num1, num2));
    }
}