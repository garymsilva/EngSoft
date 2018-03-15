/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.es.vaimeufilho;

import java.util.HashMap;

/**
 *
 * @author 1998547
 */
public class Calculadora {
    
    private HashMap<String,Integer> mapaNumeros;
    
    public Calculadora(){
        mapaNumeros = new HashMap<String,Integer>();
        mapaNumeros.put("I", 1);
        mapaNumeros.put("V", 5);
        mapaNumeros.put("X", 10);
        mapaNumeros.put("L", 50);
        mapaNumeros.put("C", 100);
        mapaNumeros.put("D", 500);
        mapaNumeros.put("M", 1000);
    }
    
    public int calcular(String numeroRomano){
        String caracter;
        int converted;
        int lastConverted = 0;
        int result = 0;

        /* 
            Percorre a String convertendo cada algarismo romano em decimal e
            guardando o resultado em 'result'.
        */

        for (int i = 0; i < numeroRomano.length(); i++) {
            caracter = numeroRomano.substring(i, i+1);
            converted = mapaNumeros.get(caracter);
            if(converted <= lastConverted) {
                result += converted;
            } else {
                result += converted - (2 * lastConverted);
            }
            lastConverted = converted;
        }
        return result;
    }
}
