public class Cliente {
    private String id;
    private String idType;
    private String name;
    private String gender;
    private String city;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Cliente(String id, String idType, String name, String gender, String city) {
        this.id = id;
        this.idType = idType;
        this.name = name;
        this.gender = gender;
        this.city = city;
    }
}
