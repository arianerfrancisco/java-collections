package com.company.set;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.reverse;

/*
Crie uma conjunto contendo as cores do arco-íris e: ok
a) Exiba todas as cores o arco-íris uma abaixo da outra; ok
b) A quantidade de cores que o arco-íris tem; ok
c) Exiba as cores em ordem alfabética; ok
d) Exiba as cores na ordem inversa da que foi informada; ok
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

public class ExercicioSet {
    public static void main(String[] args) {
        Set<String> coresSet = new HashSet<>(List.of("Violeta", "Anil", "Azul", "Verde", "Amarelo", "Laranja", "Vermelho"));
        Iterator itr = coresSet.iterator();
        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + "\n ");
        }
        System.out.println("O arco-íris tem: " + coresSet.size() +" cores");
        Set<String> coresOrdenado = new TreeSet<String>(coresSet);
        System.out.println("As cores ordenadas: " + coresOrdenado);

        List<String> coresList = new ArrayList<>(Arrays.asList("Violeta", "Anil", "Azul", "Verde", "Amarelo", "Laranja", "Vermelho"));
        System.out.println("Cores desordenadas: ");
        coresList.stream().collect(Collectors.toCollection(LinkedList::new))
                .descendingIterator().
                forEachRemaining(System.out::println);


    }
}
