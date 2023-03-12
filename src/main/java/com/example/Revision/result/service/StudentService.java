package com.example.Revision.result.service;

import com.example.Revision.result.model.StudentModel;
import com.example.Revision.result.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    public StudentRepository studentRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository)
    {
        this.studentRepository=studentRepository;

    }
    public String saveStudentDetails(StudentModel studentModel)
    {
        StudentModel newCanditate= studentRepository.save(studentModel);
        return "NEW STUDENT ADDED "+ newCanditate;
    }
    public List<StudentModel> getStudentList()
    {
        return studentRepository.findAll();
    }
public StudentModel getStudentById(int id)
{
    return studentRepository.findById(id);
}
public void deleteStudentById(int id)
{
     studentRepository.deleteById(id);
}

}
