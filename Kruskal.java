package TarefaGrafosSardas;

import java.util.ArrayList;
import java.util.HashMap;

public class Kruskal {
    private int contArestasAceitas = 0;
    private ArrayList<Aresta> listOrdenadaArestas;
    private ArrayList<Aresta> floresta = new ArrayList<>();

    public Kruskal(Grafo grafo) {
        this.listOrdenadaArestas = grafo.getListaArestas();
    }

    public void execute() {
        for (int i = 0; i < listOrdenadaArestas.size(); i++) {
            Aresta arestaAtual = this.listOrdenadaArestas.get(i);

            if(arestaAtual.getSarda1() != null && arestaAtual.getSarda2() != null && floresta.size() == 0){
                floresta.add(arestaAtual);
            }
            else if (arestaAtual.getSarda1() != null && arestaAtual.getSarda2() != null && floresta.size() != 0 & i > 1) {
                for (Aresta arestaFloresta : floresta) {

                    // verifica se uma aresta a3 faz um ciclo com as arestas a1 e a2
                    if (arestaAtual.getSarda1() == arestaFloresta.getSarda1()) {
                     
                    
                        for (Aresta arestaFlorestaSecondIteration : floresta) {
                            if (arestaFlorestaSecondIteration != arestaFloresta) {
                                if ((arestaFlorestaSecondIteration.getSarda1() == arestaAtual.getSarda2() &&
                                        arestaFlorestaSecondIteration.getSarda2() == arestaFloresta.getSarda2()) ||
                                        (arestaFlorestaSecondIteration.getSarda2() == arestaAtual.getSarda2() &&
                                                arestaFlorestaSecondIteration.getSarda1() == arestaFloresta
                                                        .getSarda2()));
                                else
                                    floresta.add(arestaAtual);
                            }
                        }
                    } else if (arestaAtual.getSarda1() == arestaFloresta.getSarda2()) {
                        for (Aresta arestaFlorestaSecondIteration : floresta) {
                            if (arestaFlorestaSecondIteration != arestaFloresta) {
                                if ((arestaFlorestaSecondIteration.getSarda1() == arestaAtual.getSarda2() &&
                                        arestaFlorestaSecondIteration.getSarda2() == arestaFloresta.getSarda1()) ||
                                        (arestaFlorestaSecondIteration.getSarda2() == arestaAtual.getSarda2() &&
                                                arestaFlorestaSecondIteration.getSarda1() == arestaFloresta
                                                        .getSarda1()));
                                else
                                    floresta.add(arestaAtual);
                            }
                        }
                    } else if (arestaAtual.getSarda2() == arestaFloresta.getSarda1()) {
                        for (Aresta arestaFlorestaSecondIteration : floresta) {
                            if (arestaFlorestaSecondIteration != arestaFloresta) {
                                if ((arestaFlorestaSecondIteration.getSarda1() == arestaFloresta.getSarda2() &&
                                        arestaFlorestaSecondIteration.getSarda2() == arestaAtual.getSarda1()) ||
                                        (arestaFlorestaSecondIteration.getSarda1() == arestaAtual.getSarda1() &&
                                                arestaFlorestaSecondIteration.getSarda2() == arestaFloresta
                                                        .getSarda2()))
                                    ;
                                else
                                    floresta.add(arestaAtual);
                            }
                        }

                    } else if (arestaAtual.getSarda2() == arestaFloresta.getSarda2()) {
                        for (Aresta arestaFlorestaSecondIteration : floresta) {
                            if (arestaFlorestaSecondIteration != arestaFloresta) {
                                if ((arestaFlorestaSecondIteration.getSarda1() == arestaAtual.getSarda1() &&
                                        arestaFlorestaSecondIteration.getSarda2() == arestaFloresta.getSarda1()) ||
                                        (arestaFlorestaSecondIteration.getSarda2() == arestaAtual.getSarda1() &&
                                                arestaFlorestaSecondIteration.getSarda1() == arestaFloresta
                                                        .getSarda1()))
                                    ;
                                else
                                    floresta.add(arestaAtual);
                            }
                        }
                    } else {
                        floresta.add(arestaAtual);
                    }

                }
            }else floresta.add(arestaAtual);
        }

        Double somaTinta = Double.valueOf(0);

        for (Aresta aresta : floresta) {
            somaTinta += aresta.getValorAresta();
        }

        System.out.printf("Quantidade mínima de tinta necessária: %.3f%n", somaTinta);
    }

    public int getContArestasAceitas() {
        return contArestasAceitas;
    }

    public void setContArestasAceitas(int contArestasAceitas) {
        this.contArestasAceitas = contArestasAceitas;
    }

    public ArrayList<Aresta> getListOrdenadaArestas() {
        return listOrdenadaArestas;
    }

    public void setListOrdenadaArestas(ArrayList<Aresta> listOrdenadaArestas) {
        this.listOrdenadaArestas = listOrdenadaArestas;
    }

    public ArrayList<Aresta> getFloresta() {
        return floresta;
    }

    public void setFloresta(ArrayList<Aresta> floresta) {
        this.floresta = floresta;
    }
}
