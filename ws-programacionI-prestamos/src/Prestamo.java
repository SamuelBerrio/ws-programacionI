public class Prestamo {
    private int code;
    private int requestDays;
    private int daysPassed;
    private Empleado empleado;
    private Cliente cliente;
    private double loanValue;
    private Detalle details[];

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getRequestDays() {
        return requestDays;
    }

    public void setRequestDays(int requestDays) {
        this.requestDays = requestDays;
    }

    public int getDaysPassed() {
        return daysPassed;
    }

    public void setDaysPassed(int daysPassed) {
        this.daysPassed = daysPassed;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getLoanValue() {
        return loanValue;
    }

    public void setLoanValue(double loanValue) {
        this.loanValue = loanValue;
    }

    public Detalle[] getDetails() {
        return details;
    }

    public void setDetails(Detalle[] details) {
        this.details = details;
    }

    public Prestamo(int code, int requestDays, int daysPassed, Empleado empleado, Cliente cliente, double loanValue, Detalle[] details) {
        this.code = code;
        this.requestDays = requestDays;
        this.daysPassed = daysPassed;
        this.empleado = empleado;
        this.cliente = cliente;
        this.loanValue = loanValue;
        this.details = details;
    }
}
