package com.company.list;

import java.util.List;
import java.util.Scanner;

public class ExerciseList2 {
    public static void main(String[] args) {
        /*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/
        Scanner entrada = new Scanner(System.in);

        List<String> perguntas = List.of("Esteve no local do crime?"
                , "Mora perto da vítima?"
                , "Devia para a vítima?"
                , "Já trabalhou com a vítima?"
                ,"Telefonou para a vítima?");

        int cont = 0;
        for (int i = 0; i < perguntas.size(); i++) {
            System.out.println("Responda 1 para SIM e 0 para não");
            System.out.println(perguntas.get(i));
            int resposta = entrada.nextInt();
            cont += resposta;
        }

        if(cont == 2) {
            System.out.println("Você é Suspeita");
        } else if(cont == 5) {
            System.out.println("Você é Assassina");
        } else if (cont == 3 || cont == 4){
            System.out.println("Cúmplice");
        } else{
            System.out.println("Inocente");
        }
}
}
