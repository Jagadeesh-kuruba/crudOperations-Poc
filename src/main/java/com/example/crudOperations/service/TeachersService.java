package com.example.crudOperations.service;

import com.example.crudOperations.model.Teacher;
import com.example.crudOperations.repository.TeachersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeachersService {

    @Autowired
    private TeachersRepo teachersRepo;

    // To Save the Teacher Record
    public Teacher saveTeacher(Teacher teacher){
       return teachersRepo.save(teacher);
    }

    // To Read the Teacher Record
    public Optional<Teacher> getTeacher(long id){
       return  teachersRepo.findById(id);
    }

    // To Delete the teacher record
    public String deleteTeacher(long id){
       teachersRepo.deleteById(id);
       Optional<Teacher> data = teachersRepo.findById(id);
       if(data.isEmpty()){
           return "Data Deleted Successfully";
       }else{
           return "Data is Not Deleted";
       }
    }

    // To update the Teacher record
    public Teacher updateTeacher(Teacher teacher){
        return teachersRepo.save(teacher);
    }
}
