package PersistenceXML.Model;

public class Attraction {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Attraction(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public Attraction() {
        super();
    }

    @Override
    public String toString() {
        return "Attraction => " + "name= " + name + ", type= " + type +"\n";
    }
}
