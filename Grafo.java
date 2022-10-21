package TarefaGrafosSardas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Grafo
{
    private ArrayList<Aresta> listaArestas;
    private ArrayList<Sarda> listaSardas = new ArrayList<>();

    public Grafo(ArrayList<Aresta> listaArestas){
        this.listaArestas = listaArestas;

        Collections.sort(listaArestas);

        for (Aresta aresta : this.listaArestas) {
            if(aresta.getSarda1() != null && !listaSardas.contains(aresta.getSarda1())) listaSardas.add(aresta.getSarda1());
            if(aresta.getSarda2() != null && !listaSardas.contains(aresta.getSarda2())) listaSardas.add(aresta.getSarda2());
        }
    }

    public ArrayList<Aresta> getListaArestas() {
        return listaArestas;
    }

    public void setListaArestas(ArrayList<Aresta> listaArestas) {
        this.listaArestas = listaArestas;
    }

    public ArrayList<Sarda> getListaSardas() {
        return listaSardas;
    }

    public void setListaSardas(ArrayList<Sarda> listaSardas) {
        this.listaSardas = listaSardas;
    }

    
}
