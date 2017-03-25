package com.zlrx.javadevzed.cleancode.variables;

import com.zlrx.javadevzed.cleancode.variables.pojo.Student;

import java.util.ArrayList;
import java.util.List;

public class Variables {

    private static final int GRADUATE_YEAR = 4;

    private void variablesWithEvilName() {
        int a = 0;  //number of senior students
        for (Student s : findFromDb()) {
            if (s.getGrade() == 4) {
                a++;
            }
        }
        System.out.println(a);
    }

    private void variablesWithNiceName() {
        int numberOfSeniorStudents = 0;
        for (Student student : findAllStudentFromDb()) {
            if (student.getGrade() == GRADUATE_YEAR) {
                numberOfSeniorStudents++;
            }
        }
        System.out.println(numberOfSeniorStudents);

    }

    private List<Student> findFromDb() {
        return findAllStudentFromDb();
    }

    private List<Student> findAllStudentFromDb() {
        List<Student> students = new ArrayList<>(5);
        students.add(new Student("Erik", 2));
        students.add(new Student("Laura", 4));
        students.add(new Student("John", 3));
        students.add(new Student("Cheng", 1));
        students.add(new Student("Zalan", 4));
        return students;
    }

    private void confusingName() {
        int lO = 100;
        int sum = 10 + lO;
    }

    public static void main(String[] args) {
        Variables variables = new Variables();
        variables.variablesWithEvilName();
        variables.variablesWithNiceName();
    }


}
