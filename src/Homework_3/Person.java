package Homework_3;

public class Person {

    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    public Person(String name, String town, int yearOfBirth, String jobTitle) {

        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }

        if (name == null || name.trim().isEmpty()) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }

        if (town == null || town.trim().isEmpty()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;;
        }

        if (jobTitle == null || jobTitle.trim().isEmpty()) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }
    void printGreeting() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town +
                ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }
}
