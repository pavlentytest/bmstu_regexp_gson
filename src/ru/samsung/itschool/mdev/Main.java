package ru.samsung.itschool.mdev;

import com.google.gson.Gson;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {

    public static void main(String[] args) {
        // JSON
        // сериализация - объект в JSON строку
        // десериализация - из строки получаем объект Java класс
        // Google SON - Script Object Notation

        Person ivan = new Person("Ivan",30);
        Gson gson = new Gson();
        String ivan_str = gson.toJson(ivan);
        System.out.println(ivan_str);

        String source = "{\"name\":\"Ivan\",\"age\":30}";
        Person person = gson.fromJson(source,Person.class);
        System.out.println(person.name);
        System.out.println(person.age);


        // Квантификаторы в Regular Expression
        // ? - один или нет
        // * - ноль или более
        // + - один или более
        // {n} - n раз
        // {n, } - n раз и более
        // {n, m} - не менее n раз и не более m раз







        String text = "Егор Алла Александр";
        //Pattern pattern = Pattern.compile("А.+а"); // жадный режим
        Pattern pattern = Pattern.compile("А.+?а"); // ленивый режим
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }


    }
}
