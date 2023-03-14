package org.example.student.model;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Component
public class Student {

@Id
private int studentRollNo;
@Column
private String studentName;
@Column
private String studentClass;
@Column
private String studentDOB;

    public Student() {
    }

    public Student(int studentRollNo, String studentName, String studentClass, String studentDOB) {
        this.studentRollNo = studentRollNo;
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.studentDOB = studentDOB;
    }

    public int getStudentRollNo() {

        return studentRollNo;
    }

    public void setStudentRollNo(int studentRollNo) {

        this.studentRollNo = studentRollNo;
    }

    public String getStudentName() {

        return studentName;
    }

    public void setStudentName(String studentName) {

        this.studentName = studentName;
    }

    public String getStudentClass() {

        return studentClass;
    }

    public void setStudentClass(String studentClass) {

        this.studentClass = studentClass;
    }

    public String getStudentDOB() {

        return studentDOB;
    }

    public void setStudentDOB(String studentDOB) {

        this.studentDOB = studentDOB;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentRollNo='" + studentRollNo + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentClass='" + studentClass + '\'' +
                ", studentDOB='" + studentDOB + '\'' +
                '}';
    }
}
