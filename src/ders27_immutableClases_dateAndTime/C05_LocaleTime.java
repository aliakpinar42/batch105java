package ders27_immutableClases_dateAndTime;

import java.time.LocalTime;

public class C05_LocaleTime {
    public static void main(String[] args) {
        LocalTime saat= LocalTime.now();
        System.out.println(saat); // 18:21:20.419206
        LocalTime saat2= LocalTime.of(15,10,20);
        System.out.println(saat.compareTo(saat2));
        System.out.println(saat2.withNano(45565));
    }
}

