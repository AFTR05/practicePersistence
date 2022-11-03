package PersistenceXML.Model;

import java.util.ArrayList;

public class AttractionPlace {
    private String name;
    private ArrayList<Attraction> attractions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public void setAttractions(ArrayList<Attraction> attractions) {
        this.attractions = attractions;
    }

    public AttractionPlace(){

    }

    public AttractionPlace(String name, ArrayList<Attraction> attractions) {
        this.name = name;
        this.attractions = attractions;
    }
}
