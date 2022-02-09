package com.company.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExerciseList1 {

    public static void main(String[] args) {

        Temperaturas temp = new Temperaturas();
        List<Double> temperaturas = temp.getTemps();
        double media = temperaturas
                .stream()
                .mapToDouble(t -> t)
                .average()
                .getAsDouble();
        System.out.println(" A média das temperaturas: " + media);

        List<Double> tempAcimaMedia = temperaturas
                .stream()
                .filter(t -> t > media)
                .collect(Collectors.toList());
        System.out.println("As temperaturas acima da média são: " + tempAcimaMedia);

        List<String> meses = List.of("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro");
        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > media) {
                System.out.println("Temperatura: " + temperaturas.get(i) + "º do mês: " + meses.get(i));
            }
        }

    }
}

class Temperaturas {

    List<Double> temps = new ArrayList<Double>();

    public List<Double> getTemps() {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.print("Informe a " + (i + 1) + "º temperatura: ");
            double temperatura = entrada.nextDouble();
            temps.add(temperatura);
        }
        entrada.close();
        return temps;
    }

    @Override
    public String toString() {
        return "Temperaturas{" +
                "temps=" + temps +
                '}';
    }
}


