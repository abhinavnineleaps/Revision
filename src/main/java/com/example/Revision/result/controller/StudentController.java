package com.example.Revision.result.controller;

import com.example.Revision.result.model.StudentModel;
import com.example.Revision.result.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/StudentLogin")
public class StudentController {
    public StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService)
    {
        this.studentService=studentService;
    }
    @RequestMapping(value = "/Safedetails")
    public String getSaveMovie(@RequestBody StudentModel payload)
    {
        return studentService.saveStudentDetails(payload);

    }
    @RequestMapping(value = "/GetAllStudentDetails")
    public List<StudentModel> getAllStudentList()
    {
        return studentService.getStudentList();

    }
    @RequestMapping(value = "/GetStudentById")
    public StudentModel getStudentDetailedById(@PathVariable("id") int id)
    {
        return studentService.getStudentById(id);
    }
    @RequestMapping(value = "/DeleteById")
    public void deleteStuedentDetailedById(@PathVariable("id") int id)
    {
        studentService.deleteStudentById(id);
    }

}
