package Homework;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    @Override
    public String toString() {
        return "Автомобиль : " + brand + "  " + model + ", " + productionYear + " год выпуска, сборка: "
                + productionCountry + ". " + color + " цвет, объем двигателя - " + engineVolume + " л.";
    }
}
