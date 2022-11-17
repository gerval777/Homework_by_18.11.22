package Homework_2;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    @Override
    public String toString() {
        return "Автомобиль : " + brand + "  " + model + ", " + productionYear + " год выпуска, сборка: "
                + productionCountry + ". " + color + " цвет, объем двигателя - " + engineVolume + " л.";
    }
}