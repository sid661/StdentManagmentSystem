package org.example.student.controller;


import org.example.student.dao.StudentDao;
import org.example.student.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
@Autowired
private Student student;
@Autowired
private StudentDao studentDao;

public StudentController(StudentDao studentDao) {

    this.studentDao = studentDao;
    }



    @GetMapping("/")
    public ModelAndView getHomePage(Model model)
    {
        System.out.println("in the student controller");
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
}
    /*------Pushing data to studentDaoImpl------*/
    @PostMapping("/saveStudentData")// this /saveStudentData name has to be same in form and in controller
    public String saveStudentData(@RequestParam("studentRollNo") int studentRollNo,
                                @RequestParam("studentName") String studentName,
                                @RequestParam("studentClass") String studentClass,
                                @RequestParam("studentDOB") String studentDOB,
                                ModelMap modelMap)
    {

        student.setStudentRollNo(studentRollNo);
        student.setStudentName(studentName);
        student.setStudentClass(studentClass);
        student.setStudentDOB(studentDOB);
        studentDao.saveStudentData(student);

       return "redirect:/";

    }
    @GetMapping("/NIITStudentData")
    public ModelAndView getStudentList(Model model){
        System.out.println("inside studnet list");
        model.addAttribute("student",student);  /// model tell the var type is of which class type
        ModelAndView modelAndView = new ModelAndView("studentlist");
        modelAndView.addObject("studentlist",studentDao.readStudentData());
        return modelAndView;
    }

    @GetMapping("/deleteStudent/{studentRollNo}")
    public String deleteStudent(@PathVariable("studentRollNo") int studentRollNo, ModelMap modelmap){

       studentDao.deleteStudentData(studentRollNo);
       modelmap.addAttribute("studentlist",studentDao.readStudentData());
     return "redirect:/NIITStudentData";
    }

}
