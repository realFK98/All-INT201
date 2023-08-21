package org.example;

import java.util.Comparator;

public class StudentComparatorByGpax implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getGpax()< o2.getGpax()) {
            return 1;
        }
        else if (o1.getGpax()> o2.getGpax()) {
            return 0;
        }
        else {
            return o1.getName().compareTo(o2.getName());
        }



    }

}
