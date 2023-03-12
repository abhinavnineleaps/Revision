package com.example.Revision.result.repository;

import com.example.Revision.result.model.StudentModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<StudentModel,Integer> {

    // YOU CAN SEE ALL THESE FUNCTION FROM THE CRUD REPOSITORY BY CLICKING WITH CONTROL.
     public StudentModel save(StudentModel studentModel);
     public List<StudentModel> findAll();
     public StudentModel findById(int id);
     public void deleteById(int id);

}
