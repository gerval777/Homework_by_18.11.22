package Homework_3;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {

        if (brand == null || brand.trim().isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.trim().isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (productionCountry == null || productionCountry.trim().isEmpty()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null || color.trim().isEmpty()) {
            this.color = "Белый";
        } else {
            this.color = color;
        }

        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
    }

    @Override
    public String toString() {
        return "Автомобиль : " + brand + "  " + model + ", " + productionYear + " год выпуска, сборка: "
                + productionCountry + ". " + color + " цвет, объем двигателя - " + engineVolume + " л.";
    }
}