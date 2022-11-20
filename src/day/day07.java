package day;

import java.util.Scanner;

public class day07 {
    public static void main(String[] args) {


        // Kullanicidan istedigi kadar sayi alip, bu sayilari bir Array'de toplayip
        // bu sayilarin toplamini yazdiran bir program yaziniz

        Scanner scan = new Scanner(System.in);
        double [] num ;
        double sum=0;

        int size;
        System.out.println("kac adet sayi toplamak istiyorsunuz");

        size = scan.nextInt();

        num=new double[size];
        for (int i = 0; i < size; i++) {

            System.out.println("lutfen sayi giriniz ");
            num[i]= scan.nextDouble();
            sum+=num[i];


        }
        System.out.println("sayilarin toplami=" + sum);

    }
}
