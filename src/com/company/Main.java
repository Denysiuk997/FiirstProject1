package com.company;

import com.sun.org.apache.xml.internal.utils.CharKey;
import jdk.nashorn.internal.ir.CatchNode;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.sql.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Date;
import java.util.HashMap;

import static javafx.scene.input.KeyCode.T;

public class Main {
    int x = 0;

    public static <entity> void main(String[] args) {

//        Person misha = new Person("Misha", "fedotov", "olegovich");
//        Student mishaStudent = new Student(misha, "fitki", 6, "pi");
//
//        Person kolya = new Person("kolya", "gorobec", "olegovich");
//        Student kolyaStudent = new Student(kolya, "meizu", 3, "ki");
//
//
//
//        try{
//            File file = new File("new.txt");
//            if(!file.exists())
//                    file.createNewFile();
//            PrintWriter pw=new PrintWriter(file);
//            pw.println("hello wokkkklklkrld");
//            pw.println("hello wolkkkl;rld22");
//
//            pw.close();
//
//
//        } catch (IOException e) {
//            System.out.println("error"+e);
//        }
//
//
//
//        University VNTU = new University("VNTU");
//        VNTU.listStudents.add(mishaStudent);
//        VNTU.listStudents.add(kolyaStudent);
//       viewStudent( VNTU.getListStudents("meizu"));


//
//SimpleGUI app = new SimpleGUI();
//app.setVisible(true);

        String enterString = "Mother is mather is Muther";
        HashMap <Character, Integer> map = new HashMap();
        int temp = 1;
        char curentChar;
        String[] litters = new String[enterString.length()];

        for (int i = 0; i < enterString.length(); i++) {
             curentChar = enterString.charAt(i);

            if (map.get(curentChar) != null) {

               temp =  map.get(curentChar) ;


              // map.remove(curentChar);
                map.put(curentChar, temp+1);
            } else {
                map.put(curentChar, temp);
               // litters[i]= curentChar;

            }

        }
        int [] a = new int [6];
        a[0]=a.length;
        a[0]=8;
        a[1]=7;

        (a[0]==7) ? System.out.println("fff") : System.out.println("fdgdf");

        map.forEach((k,v) -> System.out.println("key: "+k+" value:"+v));
//        for (char i:litters) {
//            System.out.println(i + " - "+map.get(i));
//        }


    }


    public static void viewStudent(ArrayList<Student> list) {
        for (Student i : list) {
            System.out.println(i.name);
        }
        ;
    }
}
