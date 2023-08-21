package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        Student student1 = new Student(1001,"Somchai",4.5);
//        System.out.println(student1.hashCode());
//        System.out.println(student2.hashCode());
//        System.out.println(student1.equals(student2));

        Set<Student> studentSet = new HashSet<>(200,50);
        studentSet.add(student1);
        String[] s = {"Somchai", "Somsri"};

        studentSet.add(new Student(10001,"Somsri",3.25));
        studentSet.add(new Student(10002,"Somsak",3.0));
        studentSet.add(new Student(10009,"Somchai",3.26));
        studentSet.add(new Student(10007,"Somsri",3.25));
        studentSet.add(new Student(10007,"Somsiri",3.25));
        studentSet.add(new Student(100037,"Sirisopaphan",3.25));
//        for (Student stu : studentSet) {
//            System.out.println(stu);
//        }
        Set<Student> studentsSet2 = new TreeSet<>(); //ไม่มีขนาด และต้องมี compareTo ไม่งั้นลง root ไม่ได้
        studentsSet2.add(new Student(10001,"Somsri",3.25));
        studentsSet2.add(new Student(10002,"Somsak",3.0));
        studentsSet2.add(new Student(10009,"Somchai",3.26));
        studentsSet2.add(new Student(10007,"Somsri",3.25));
        studentsSet2.add(new Student(10097,"Somsiri",3.25));
        studentsSet2.add(new Student(10037,"Sirisopaphan",3.25));

        System.out.println("======================================");
      List<Student> temp =  studentsSet2.stream().sorted(Student.COMPARE_BY_GPAX).toList();


        System.out.println(temp.toString());
      for (Student stu : temp) {
            System.out.println(stu);
        }


    }
}