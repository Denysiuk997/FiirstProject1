package com.company;

public class Student extends Person {
    int id = 0;
    String faculty;
    int course;
    String group;
    static int count = 0;


    public Student(Person person, String faculty, int course, String group) {
        super(person.name, person.getSurname(), person.getFathername());
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }


}
//id, Адрес, Телефон, Факультет, Курс, Группа.