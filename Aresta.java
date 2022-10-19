package TarefaGrafosSardas;

import java.util.Formatter;
import java.util.HashMap;

public class Aresta implements Comparable<Aresta>
{
    private Sarda sarda1;
    private Sarda sarda2;
    private Double valorAresta;

    public Aresta(Sarda sarda1, Sarda sarda2){
        this.sarda1 = sarda1;
        this.sarda2 = sarda2;

        if(sarda1 != null && sarda2 != null){
            this.valorAresta = Math.sqrt(
            Math.pow( ( sarda1.getCoordX() - sarda2.getCoordX() ) , 2)
             + 
            Math.pow( ( sarda1.getCoordY() - sarda2.getCoordY() ), 2)
            );
        }
        else this.valorAresta = Double.valueOf(0);
        
    }

    @Override
    public int compareTo(Aresta outraAresta) {
        if(Double.max(this.valorAresta, outraAresta.getValorAresta()) == this.valorAresta)
            return 1;
        else if(Double.max(this.valorAresta, outraAresta.getValorAresta()) == outraAresta.valorAresta)
            return -1;
        else return 0;
    }

    @Override
    public String toString()
    {
        if(this.getSarda1() == null)
            return String.format("{null,%s, valorAresta: %.3f}",this.getSarda2().getSardaLabel(),this.getValorAresta());
        else if(this.getSarda2() == null)
            return String.format("{%s,null, valorAresta: %.3f}", this.getSarda1().getSardaLabel(),this.getValorAresta());
        else
            return String.format("{%s,%s, valorAresta: %.3f}", this.getSarda1().getSardaLabel(),this.getSarda2().getSardaLabel(),this.getValorAresta());

    }

    public Sarda getSarda1() {
        return sarda1;
    }

    public void setSarda1(Sarda sarda1) {
        this.sarda1 = sarda1;
    }

    public Sarda getSarda2() {
        return sarda2;
    }

    public void setSarda2(Sarda sarda2) {
        this.sarda2 = sarda2;
    }

    public Double getValorAresta() {
        return valorAresta;
    }

    public void setValorAresta(Double valorAresta) {
        this.valorAresta = valorAresta;
    }

}
