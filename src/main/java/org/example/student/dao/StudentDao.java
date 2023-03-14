package org.example.student.dao;

import org.example.student.model.Student;

import java.util.List;

public interface StudentDao {

     String saveStudentData(Student student);
     String deleteStudentData(int studentRollNo);
     Student updateStudentDate(String studentRollNo);
     List<Student> readStudentData();
}

