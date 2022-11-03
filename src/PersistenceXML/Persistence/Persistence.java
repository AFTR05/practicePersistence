package PersistenceXML.Persistence;

import PersistenceXML.Model.AttractionPlace;

public class Persistence {
    public static final String RUTE_ARCHIVE_SHOP = "src/PersistenceXML/resources/attractionPlace.xml";

    public static AttractionPlace chargeResourceShopXML() {
        AttractionPlace attractionPlace = null;
        try {
            attractionPlace = (AttractionPlace) ArchiveUtil.getResourceSerialXML(RUTE_ARCHIVE_SHOP);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return attractionPlace;
    }



    public static void saveResourceBankXML(AttractionPlace attractionPlace) {
        try {
            ArchiveUtil.getBackResourceSerialXML(RUTE_ARCHIVE_SHOP,attractionPlace);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
