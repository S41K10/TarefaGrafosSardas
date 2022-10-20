package TarefaGrafosSardas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static ArrayList<Sarda> inputListaSardas()
    {
        ArrayList<Sarda> listSardas = new ArrayList<>();

        
        int numSardas;
        do {
            Scanner input = new Scanner(System.in);

            System.out.print("Número de sardas (-1 pra finalizar): ");
            numSardas = input.nextInt();
            input.nextLine();

            
            for (int i = 1; i <= numSardas; i++) {
                System.out.printf("Coordenadas sarda %d: ", i);
                String sardaCoordenadas = input.nextLine();

                String[] sardaCoordenadasSplit = sardaCoordenadas.split(" ");

                listSardas.add(new Sarda(String.format("Sarda %d", i), Double.valueOf(sardaCoordenadasSplit[0])
                    , Double.valueOf(sardaCoordenadasSplit[1])));
            }
            
        } while (numSardas != -1);

        return listSardas;
    }
    public static void main(String[] args) {
        Sarda sarda1 = new Sarda("Sarda1", Double.valueOf(1), Double.valueOf(1));
        Sarda sarda2 = new Sarda("Sarda2", Double.valueOf(2), Double.valueOf(2));
        Sarda sarda3 = new Sarda("Sarda3", Double.valueOf(2), Double.valueOf(4));
        

        Aresta aresta1 = new Aresta(sarda1, sarda2);
        Aresta aresta2 = new Aresta(sarda2, sarda3);
        // Aresta aresta3 = new Aresta(sarda3, null);

        ArrayList<Aresta> arestas = new ArrayList<>(Arrays.asList(aresta1, aresta2));

        System.out.println(arestas);

        Grafo grafo = new Grafo(arestas);

        System.out.println();
        System.out.println("lista de arestas depois do método Collections.sort():");
        System.out.println(grafo.getListaArestas());
        System.out.println(grafo.getListaSardas());

        Kruskal kruskal = new Kruskal(grafo);
        System.out.println(kruskal.getListOrdenadaArestas());
        System.out.println();
        kruskal.execute();
        System.out.println(kruskal.getFloresta());

        System.out.println("=====Início=====");

        ArrayList<Sarda> listSardas = inputListaSardas();
        System.out.println(listSardas);
        
        

    }
}
