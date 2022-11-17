package Homework_2;

public class Person {

    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    public Person(String name, String town, int yearOfBirth, String jobTitle) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;
    }

    void printGreeting() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town +
                ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }
}
