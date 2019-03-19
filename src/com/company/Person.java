package com.company;

import java.util.Date;

public class Person {
    public String getSurname() {
        return surname;
    }

    public String getFathername() {
        return fathername;
    }

    String name;
    private String surname;
    private String fathername;
     Date bern =new Date();
    private String address;
    private int telephone;

    public Person(String name, String surname, String fathername) {
        this.name = name;
        this.surname = surname;
        this.fathername = fathername;
    }

    public Person() {
    }
}
