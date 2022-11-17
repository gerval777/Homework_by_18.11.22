package Homework;

public class Main {
    public static void main(String[] args) {
// Задание 1-2
        System.out.println("                Задание 1-2" + "\n");

        Person max = new Person();
        max.name = "Максим";
        max.town = "Минск";
        max.yearOfBirth = 1988;
        max.jobTitle = "бренд-менеджер";
        max.printGreeting();

        Person ann = new Person();
        ann.name = "Аня";
        ann.town = "Москва";
        ann.yearOfBirth = 1993;
        ann.jobTitle = "методист образовательных программ";
        ann.printGreeting();

        Person katya = new Person();
        katya.name = "Катя";
        katya.town = "Калининград";
        katya.yearOfBirth = 1992;
        katya.jobTitle = " продакт-менеджер";
        katya.printGreeting();

        Person artem = new Person();
        artem.name = "Артем";
        artem.town = "Москва";
        artem.yearOfBirth = 1995;
        artem.jobTitle = "директор по развитию бизнеса";
        artem.printGreeting();

        // Задание 3
        System.out.println();
        System.out.println("                Задание 3" + "\n");

        Car lada = new Car();
        lada.brand = "lada";
        lada.model = "Granta";
        lada.engineVolume = 1.7;
        lada.color = "Желтый";
        lada.productionYear = 2015;
        lada.productionCountry = "Россия";
        System.out.println(lada.toString());

        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.engineVolume = 3.0;
        audi.color = "Черный";
        audi.productionYear = 2020;
        audi.productionCountry = "Германия";
        System.out.println(audi.toString());

        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.engineVolume = 3.0;
        bmw.color = "Черный";
        bmw.productionYear = 2021;
        bmw.productionCountry = "Германия";
        System.out.println(bmw.toString());

        Car kia = new Car();
        kia.brand = "Kia";
        kia.model = "Sportage 4-го поколения";
        kia.engineVolume = 2.4;
        kia.color = "Красный";
        kia.productionYear = 2018;
        kia.productionCountry = "Южная Корея";
        System.out.println(kia.toString());

        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.engineVolume = 1.6;
        hyundai.color = "Оранжевый";
        hyundai.productionYear = 2016;
        hyundai.productionCountry = "Южная Корея";
        System.out.println(hyundai.toString());
    }
}
