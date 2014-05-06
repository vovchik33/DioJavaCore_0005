package edu.dio.lesson5;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person.Builder()
                .setFirstName("Vladimir")
                .setLastName("Kravchenko")
                .setAge(32)
                .setMail("vovchik33@gmail.com")
                .build();

        Person person2 = new Person.Builder(person1)
                .setMail("flashconsult@mail.ru")
                .build();

        System.out.println(person1);
        System.out.println(person2);
    }
}
