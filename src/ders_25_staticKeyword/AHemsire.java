package ders_25_staticKeyword;

public class AHemsire {
    static String hastaneIsmi="Yildiz Hastanesi";
    static String hastaneAdresi="Cankaya / Ankara";
    public static String bashekimIsmi="Dr Mehmet Yilmaz";
    public String personelIsim="Isim belirtilmedi";
    public String personelAdresi="Adres belirtilmedi";
    public String personelTelefon="Telefon belirtilmedi";
    @Override
    public String toString() {
        return "AHemsire{" +
                "personelIsim='" + personelIsim + '\'' +
                ", personelAdresi='" + personelAdresi + '\'' +
                ", personelTelefon='" + personelTelefon + '\'' +
                ", \nhastaneIsmi='" + hastaneIsmi + '\'' +
                ", hastaneAdresi='" + hastaneAdresi + '\'' +
                ", bashekimIsmi='" + bashekimIsmi + '\'' +
                '}';
    }
}
