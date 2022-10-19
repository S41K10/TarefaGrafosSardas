package TarefaGrafosSardas;

public class Sarda {
    private String sardaLabel;
    private Double coordX;
    private Double coordY;

    public Sarda(String sardaLabel,Double coordX,Double coordY)
    {
        this.sardaLabel = sardaLabel;
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public Double getCoordX() {
        return coordX;
    }

    public void setCoordX(Double coordX) {
        this.coordX = coordX;
    }

    public Double getCoordY() {
        return coordY;
    }

    public void setCoordY(Double coordY) {
        this.coordY = coordY;
    }

    public String getSardaLabel() {
        return sardaLabel;
    }

    public void setSardaLabel(String sardaLabel) {
        this.sardaLabel = sardaLabel;
    }

    @Override
    public String toString()
    {
        return String.format("{SardaLabel: %s, CoordX: %.3f, CoordY: %.3f}", this.getSardaLabel()
        ,this.getCoordX(), this.getCoordY());
    }

}
