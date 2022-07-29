public class Objeto {
    private int code;
    private String name;
    private int units;
    private boolean status;
    private double price;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Objeto(int code, String name, int units, boolean status, double price) {
        this.code = code;
        this.name = name;
        this.units = units;
        this.status = status;
        this.price = price;
    }
}
