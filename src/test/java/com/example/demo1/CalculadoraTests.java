package com.example.demo1;

import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class CalculadoraTests {
    @Test
    public void testCaso0() {
        //arrange
        String input = "";
        //act
        Calculadora calculadora = new Calculadora();
        int result = calculadora.add(input);
        //asert
        assertEquals(0, result);
    }

    @Test
    public void testCaso1() {
        //arrange
        String input = "1";
        //act
        Calculadora calculadora = new Calculadora();
        int result = calculadora.add(input);
        //asert
        assertEquals(1, result);
    }

    @Test
    public void testCaso2() {
        //arrange
        String input = "1,2";
        //act
        Calculadora calculadora = new Calculadora();
        int result = calculadora.add(input);
        //asert
        assertEquals(3, result);
    }

    @Test
    public void testCaso3() {
        //arrange
        String input = "1,2,3";
        //act
        Calculadora calculadora = new Calculadora();
        int result = calculadora.add(input);
        //asert
        assertEquals(6, result);
    }

    @Test
    public void testCaso4() {
        //arrange
        String input = "1,2,3,4";
        //act
        Calculadora calculadora = new Calculadora();
        int result = calculadora.add(input);
        //asert
        assertEquals(10, result);
    }

    @Test
    public void testCaso5() {
        //arrange
        String input = "1\n2,3";
        //act
        Calculadora calculadora = new Calculadora();
        int result = calculadora.add(input);
        //asert
        assertEquals(6, result);
    }

    @Test(expected = InputMismatchException.class)
    public void testCaso6() {
        //arrange
        String input = "1,\n";
        //act
        Calculadora calculadora = new Calculadora();
        int result = calculadora.add(input);
        //no se necesita assert cuando hay una excepcion
    }

    @Test
    public void testCaso7() {
        //arrange
        String input = "//;\n1;2";
        //act
        Calculadora calculadora = new Calculadora();
        int result = calculadora.add(input);
        //asert
        assertEquals(3, result);
    }

    @Test(expected = InputMismatchException.class)
    public void testCaso8() {
        //arrange
        String input = "1,-2,-3";
        //act
        Calculadora calculadora = new Calculadora();
        int result = calculadora.add(input);
        //no se necesita assert cuando hay una excepcion
    }

    @Test
    public void testCaso9() {
        //arrange
        String input = "2,1001";
        //act
        Calculadora calculadora = new Calculadora();
        int result = calculadora.add(input);
        //asert
        assertEquals(2, result);
    }

    @Test
    public void testCaso10() {
        //arrange
        String input = "//[;;;]\n1;;;2;;;3";
        //act
        Calculadora calculadora = new Calculadora();
        int result = calculadora.add(input);
        //asert
        assertEquals(6, result);
    }

    @Test
    public void testCaso11() {
        //arrange
        String input = "//[;][%]\n1;2%3";
        //act
        Calculadora calculadora = new Calculadora();
        int result = calculadora.add(input);
        //asert
        assertEquals(6, result);
    }

    @Test
    public void testCaso12() {
        //arrange
        String input = "//[;;][%]\n1;;2%3";
        //act
        Calculadora calculadora = new Calculadora();
        int result = calculadora.add(input);
        //asert
        assertEquals(6, result);
    }
}
