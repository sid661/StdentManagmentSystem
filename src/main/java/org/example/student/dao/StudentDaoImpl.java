package org.example.student.dao;

import org.example.student.model.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class StudentDaoImpl implements StudentDao{
@Autowired
private SessionFactory sessionFactory;



    public StudentDaoImpl(SessionFactory sessionFactory) {

        this.sessionFactory = sessionFactory;
    }

    @Override
    public String saveStudentData(Student student) {

        try{
            sessionFactory.getCurrentSession().save(student);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

        return "Student  :"+ student.getStudentName()+"  has been successfully Added to NIIT System";
    }

    @Override
    public String deleteStudentData(int studentRollNo) {

        try{
            Session session =this.sessionFactory.getCurrentSession();
            Student student =session.byId(Student.class).load(studentRollNo);
            System.out.println(student.getStudentName());
            session.delete(student);
        }
        catch(Exception e){
            e.printStackTrace();

        }
        return "student removed";
    }

    @Override
    public Student updateStudentDate(String studentRollNo) {
        return null;
    }

    @Override
    public List<Student> readStudentData() {
        System.out.println("inside list");
       return sessionFactory.getCurrentSession().createQuery("from Student").list();
    }
}
