package TarefaGrafosSardas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static ArrayList<Aresta> generateArestas(ArrayList<Sarda> listSardas) {
        ArrayList<Aresta> listArestas = new ArrayList<>();

        for (Sarda sarda : listSardas) {

            for (Sarda sarda2 : listSardas) {

                if (!sarda.getSardaLabel().equals(sarda2.getSardaLabel())) {
                    Aresta aresta = new Aresta(sarda, sarda2);

                    if (!containsAresta(listArestas, aresta)) {
                        listArestas.add(aresta);
                    }
                }

            }

        }
        return listArestas;
    }

    public static boolean containsAresta(ArrayList<Aresta> listAresta, Aresta arestaComparar) {
        for (Aresta arestaListAresta : listAresta) {
            String listArestaSarda1 = arestaListAresta.getSarda1().getSardaLabel();
            String listArestaSarda2 = arestaListAresta.getSarda2().getSardaLabel();

            String arestaCompararSarda1 = arestaComparar.getSarda1().getSardaLabel();
            String arestaCompararSarda2 = arestaComparar.getSarda2().getSardaLabel();

            if (listArestaSarda1.equals(arestaCompararSarda1) && listArestaSarda2.equals(arestaCompararSarda2)) {
                return true;
            } else if (listArestaSarda1.equals(arestaCompararSarda2) && listArestaSarda2.equals(arestaCompararSarda1)) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Sarda> inputListaSardas() {
        ArrayList<Sarda> listSardas = new ArrayList<>();

        int numSardas;
            Scanner input = new Scanner(System.in);

            System.out.print("Número de sardas: ");
            numSardas = input.nextInt();
            input.nextLine();

            for (int i = 1; i <= numSardas; i++) {
                System.out.printf("Coordenadas sarda %d: ", i);
                String sardaCoordenadas = input.nextLine();

                String[] sardaCoordenadasSplit = sardaCoordenadas.split(" ");

                listSardas.add(new Sarda(String.format("Sarda %d", i), Double.valueOf(sardaCoordenadasSplit[0]),
                        Double.valueOf(sardaCoordenadasSplit[1])));
            }


        return listSardas;
    }

    public static void main(String[] args) {

        System.out.println("=====Início=====");

        ArrayList<Sarda> listSardas = inputListaSardas();
        ArrayList<Aresta> listArestas = generateArestas(listSardas);

        System.out.println("Lista de arestas: " + listArestas);

        Grafo grafo = new Grafo(listArestas);
        Kruskal kruskal = new Kruskal(grafo);
        kruskal.execute();

    }
}
