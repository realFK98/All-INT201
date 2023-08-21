package org.example;


import lombok.*;

import java.util.Comparator;

@Getter
@Setter
@AllArgsConstructor
@ToString


public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double gpax;
    public static final Comparator<Student> COMPARE_BY_GPAX = new Comparator<Student>() { //anonimush
        @Override
        public int compare(Student o1, Student o2) {
            if (o1.getGpax() < o2.getGpax()) {
                return 1;
            } else if (o1.getGpax() > o2.getGpax()) {
                return -1;
            } else {
                return o1.getName().compareTo(o2.getName());
            }
        }
    };

    @Override
    public int compareTo(Student o) {
        return this.getId() - o.getId();
    }
}

