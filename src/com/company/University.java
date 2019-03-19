package com.company;

import java.util.ArrayList;
import java.util.Date;

public class University {
String nameUniversity;
ArrayList <Student> listStudents = new ArrayList();

    public University(String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }
//hellp
    public ArrayList<Student> getListStudents() {
        System.out.println(this.nameUniversity);

        for ( Student i : listStudents) {
           System.out.println(i.name);

        };

        return listStudents;
    }

    public ArrayList<Student> getListStudents(String facu) {
        System.out.println(this.nameUniversity);
        ArrayList <Student> filter = new ArrayList();
        for ( Student i : listStudents) {
           if(i.faculty==facu) filter.add(i);

        };
        return filter;
    }



}
//Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон.
