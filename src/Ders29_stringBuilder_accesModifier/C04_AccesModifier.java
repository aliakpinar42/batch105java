package Ders29_stringBuilder_accesModifier;

public class C04_AccesModifier {
    String isim="Ali";// access modifier gorunmuyor, o zaman default access modifier gecerlidir
    // bu class'dan ve ders29 package'i icerisindeki diger class'dan kullanilabilir
    // default int sayi=10; default access modifier yazilmaz, YAZILAMAZ
    //                       yazmaya kalkisirsaniz java CTE verir
    private static int sayi=10;
    public static void main(String[] args) {
        System.out.println(sayi); // 10
        sayi=20;
        System.out.println(sayi); // 20
    }
}

