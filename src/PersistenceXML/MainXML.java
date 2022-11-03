package PersistenceXML;

import PersistenceTXT.Model.Person;
import PersistenceXML.Model.Attraction;
import PersistenceXML.Model.AttractionPlace;
import PersistenceXML.Persistence.Persistence;

import javax.swing.*;
import java.util.ArrayList;

public class MainXML {
    public static void main(String[] args) {
        AttractionPlace attractionPlace = Persistence.chargeResourceShopXML();
        Attraction attraction = new Attraction();
        attraction.setName(JOptionPane.showInputDialog("input the name of the attraction"));
        attraction.setType(JOptionPane.showInputDialog("input the type of the attraction"));
        attractionPlace.getAttractions().add(attraction);
        JOptionPane.showMessageDialog(null,"Attraction added successfully");
        Persistence.saveResourceBankXML(attractionPlace);
        printAttraction(attractionPlace.getAttractions());
    }

    private static void printAttraction (ArrayList<Attraction> listAttraction) {
        for (Attraction attraction: listAttraction) {
            System.out.println(attraction.toString());
        }
    }
}
