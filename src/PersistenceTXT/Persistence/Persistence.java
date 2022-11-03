package PersistenceTXT.Persistence;

import PersistenceTXT.Model.Person;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

public class Persistence {
    public static final String RUTE_ARCHIVE_PERSON = "src/PersistenceTXT/Resources/person.txt";

    public static void savePeople(ArrayList<Person> listPerson) throws IOException {
        String contenido = "";
        for(Person person: listPerson) {
            contenido+= person.getName()+"/"+person.getLastName()+"/"+person.getAge()+"/"+person.getPhoneNumber()+"\n";
        }
        ArchiveUtil.saveArchive(RUTE_ARCHIVE_PERSON, contenido, false);
    }

    //METODO PARA CARGAR LOS CLIENTES A PARTIR DEL ARCHIVO
    public static ArrayList<Person> chargePeople() throws FileNotFoundException, IOException {
        ArrayList<Person> people = new ArrayList<Person>();
        ArrayList<String> content = ArchiveUtil.readArchive(RUTE_ARCHIVE_PERSON);
        String line = "";
        for (int i = 0;i<content.size(); i++) {
            Person myPerson = new Person();
            line= content.get(i);
            myPerson.setName(line.split("/")[0]);
            myPerson.setLastName(line.split("/")[1]);
            myPerson.setAge(Integer.parseInt(line.split("/")[2]));
            myPerson.setPhoneNumber(line.split("/")[3]);
            people.add(myPerson);
        }
        return people;
    }
}
