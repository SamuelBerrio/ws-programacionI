public class Detalle {
    private Objeto objeto;
    private int units;
    private double value;

    public Objeto getObjeto() {
        return objeto;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Detalle(Objeto objeto, int units, double value) {
        this.objeto = objeto;
        this.units = units;
        this.value = value;
    }
}
