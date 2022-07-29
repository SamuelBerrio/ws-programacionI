public class Empleado {
    private int code;
    private String name;
    private String mail;
    private int yearsOld;

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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public Empleado(int code, String name, String mail, int yearsOld) {
        this.code = code;
        this.name = name;
        this.mail = mail;
        this.yearsOld = yearsOld;
    }
}
