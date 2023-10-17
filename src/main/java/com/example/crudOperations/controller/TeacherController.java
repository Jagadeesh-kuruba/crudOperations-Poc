package com.example.crudOperations.controller;

import com.example.crudOperations.model.Teacher;
import com.example.crudOperations.service.TeachersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/crudApp/api")
public class TeacherController {

    @Autowired
    private TeachersService teachersService;

    // http://localhost:8081/crudApp/api/save
    @PostMapping("/save")
    public Teacher storeData(@RequestBody Teacher teacher){
        return teachersService.saveTeacher(teacher);
    }

    // http://localhost:8081/crudApp/api/get/{id}
    @GetMapping("/get/{id}")
    public Optional<Teacher> getData(@PathVariable("id") long id){
        return teachersService.getTeacher(id);
    }

    // http://localhost:8081/crudApp/api/delete?id=value
    @DeleteMapping("/delete")
    public String deleteData(@RequestParam("id") long id){
        return teachersService.deleteTeacher(id);
    }

    // http://localhost:8081/crudApp/api/update
    @PutMapping("/update")
    public Teacher updateData(@RequestBody Teacher teacher){
        return teachersService.updateTeacher(teacher);
    }

}
