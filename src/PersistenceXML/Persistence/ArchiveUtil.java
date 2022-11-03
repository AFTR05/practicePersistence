package PersistenceXML.Persistence;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ArchiveUtil {
    public static Object getResourceSerialXML(String ruteArchive) throws IOException {

        XMLDecoder decoderXML;
        Object objectXML;
        decoderXML = new XMLDecoder(new FileInputStream(ruteArchive));
        objectXML = decoderXML.readObject();
        decoderXML.close();
        return objectXML;

    }

    public static void getBackResourceSerialXML(String ruteArchive, Object object) throws IOException {
        XMLEncoder encoderXML;
        encoderXML = new XMLEncoder(new FileOutputStream(ruteArchive));
        encoderXML.writeObject(object);
        encoderXML.close();

    }
}
