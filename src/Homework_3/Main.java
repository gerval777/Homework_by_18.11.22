package Homework_3;

public class Main {
    public static void main(String[] args) {
// Задание 1
        System.out.println("                Задание 1" + "\n");

        Person max = new Person("Максим", "Минск", -1988, "    ");
        max.printGreeting();

        Person ann = new Person("    ", "Москва", 1993, "методист образовательных программ");
        ann.printGreeting();

        Person katya = new Person("Катя", "   ", 1992, "продакт-менеджер");
        katya.printGreeting();

        Person artem = new Person("Артем", "Москва", 1995, "директор по развитию бизнеса");
        artem.printGreeting();

        // Задание 2
        System.out.println();
        System.out.println("                Задание 2" + "\n");

       Car lada = new Car("    ", "    ", 0, "    ", 0, "    ");
        System.out.println(lada.toString());

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия");
        System.out.println(audi.toString());

        Car bmw = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия");
        System.out.println(bmw.toString());

        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "Красный", 2018, "Южная Корея");
        System.out.println(kia.toString());

        Car hyundai = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея");
        System.out.println(hyundai.toString());
    }
}


