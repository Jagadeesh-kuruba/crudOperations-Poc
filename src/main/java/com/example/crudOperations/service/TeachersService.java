package com.example.crudOperations.service;

import com.example.crudOperations.model.Teacher;
import com.example.crudOperations.repository.TeachersRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class TeachersService {

    @Autowired
    private TeachersRepo teachersRepo;

    // To Save the Teacher Record
    public Teacher saveTeacher(Teacher teacher){
        log.info("we are going to save the teacher record");
        return teachersRepo.save(teacher);
    }

    // To Read the Teacher Record
    public Optional<Teacher> getTeacher(long id){
        log.info("Fetching the record with id: "+id);
       return  teachersRepo.findById(id);
    }

    // To Delete the teacher record
    public String deleteTeacher(long id){
       teachersRepo.deleteById(id);
       Optional<Teacher> data = teachersRepo.findById(id);
       if(data.isEmpty()){
           log.info("Record is deleted successfully with id"+id);
           return "Data Deleted Successfully";
       }else{
           log.info("Record is not deleted with id "+id);
           return "Data is Not Deleted";
       }
    }

    // To update the Teacher record
    public Teacher updateTeacher(Teacher teacher){
        log.info("record is modifying with id "+teacher.getTeacherId());
        return teachersRepo.save(teacher);
    }
}
