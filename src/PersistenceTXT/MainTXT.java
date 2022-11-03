package PersistenceTXT;

import PersistenceTXT.Model.Person;
import PersistenceTXT.Persistence.Persistence;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

public class MainTXT {
    static ArrayList<Person> listPeople = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {

        try {
            listPeople = Persistence.chargePeople();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String name = JOptionPane.showInputDialog("Input the name of the person");
        String lastName = JOptionPane.showInputDialog("Input the last name of the person");
        int age=Integer.parseInt(JOptionPane.showInputDialog("Input the age of the person"));
        String phoneNumber = JOptionPane.showInputDialog("input the phone number of the person");
        Person person = new Person(name,lastName,age,phoneNumber);
        listPeople.add(person);
        Persistence.savePeople(listPeople);
        printPeolple(listPeople);
    }




    private static void printPeolple (ArrayList <Person> listPeople) {
        for (Person person: listPeople) {
            System.out.println(person.toString());
        }
    }
}