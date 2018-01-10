package com.example.demo1;

import java.util.InputMismatchException;

public class Calculadora {
    String delim = ",|\n";

    public int add(String input) {
        if (!"".equals(input)) {
            if (input.contains(",\n"))
                throw new InputMismatchException();
            String deli = "";
            if (input.contains("//[")) {
                int inicio = input.indexOf("[");
                int fin = input.indexOf("]");
                deli = "|" + input.substring(inicio + 1, fin);
                if (input.contains("][")) {
                    delim += deli;
                    input = input.replace("[" + deli.substring(1) + "]", "");
                    inicio = input.indexOf("[");
                    fin = input.indexOf("]");
                    deli = "|" + input.substring(inicio + 1, fin);
                }
                input = input.replace("//[" + deli.substring(1) + "]\n", "");
            } else if (input.contains("//")) {
                deli = "|" + input.charAt(2);
                input = input.replace("//" + input.charAt(2) + "\n", "");
            }
            String numbers[] = input.split(delim + deli);
            int acum = 0, numero;
            String numerosnegativos = "";
            for (String number : numbers) {
                numero = new Integer(number);
                if (numero < 0)
                    numerosnegativos += numero + ",";
                else if (numero > 1000)
                    numero = 0;
                acum = acum + numero;
            }
            if (!"".equals(numerosnegativos)) {
                String err = "negatives not allowed: " + numerosnegativos;
                throw new InputMismatchException(err);
            }
            return acum;
        }
        return 0;
    }
}
