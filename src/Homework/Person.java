package Homework;

public class Person {

    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    void printGreeting() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town +
                ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }
}
