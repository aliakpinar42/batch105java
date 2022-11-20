package ders31_inheritance;

public class BinekArac extends Arac{
protected String marka = "Binek Araclarin markasi olur";
protected  String model = "Binek Araclarin modeli olur";
protected  int yil= 1900;

protected  void hiz(String benzin){
    System.out.println("binek araclarin hizi modele gore degisir");
}


protected void teker(){
    System.out.println("binek araclarin 4 tekeri olur");
}}
