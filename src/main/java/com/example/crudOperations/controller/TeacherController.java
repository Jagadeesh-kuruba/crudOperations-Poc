package com.example.crudOperations.controller;

import com.example.crudOperations.model.Teacher;
import com.example.crudOperations.service.TeachersService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

// http://localhost:8081/swagger-ui/index.html
@Tag(
        name = "CRUD Operations API - Controller",
        description = "Teacher Controller exposes Rest API for CRUD Operations API"
)
@RestController
@RequestMapping("/crudApp/api")
public class TeacherController {

    @Autowired
    private TeachersService teachersService;

    // http://localhost:8081/crudApp/api/save
    @Operation(
            summary = "Post Crud Rest Api",
            description = "Post Crud Rest Api is used to store Teacher Object in Database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http ResponseCode 200 is Created"
    )
    @PostMapping("/save")
    public Teacher storeData(@RequestBody Teacher teacher){
        return teachersService.saveTeacher(teacher);
    }



    // http://localhost:8081/crudApp/api/get/{id}

    @Operation(
            summary = "Get Crud Rest Api",
            description = "Get Crud Rest Api is used to fetch Teacher Object from Database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http ResponseCode 200 is Created"
    )
    @GetMapping("/get/{id}")
    public Optional<Teacher> getData(@PathVariable("id") long id){
        return teachersService.getTeacher(id);
    }


    // http://localhost:8081/crudApp/api/delete?id=value
    @Operation(
            summary = "Delete Crud Rest Api",
            description = "Delete Crud Rest Api is used to delete Teacher Object from Database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http ResponseCode 200 is Created"
    )
    @DeleteMapping("/delete")
    public String deleteData(@RequestParam("id") long id){
        return teachersService.deleteTeacher(id);
    }



    // http://localhost:8081/crudApp/api/update
    @Operation(
            summary = "Put Crud Rest Api",
            description = "Put Crud Rest Api is used to update Teacher Object in Database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http ResponseCode 200 is Created"
    )
    @PutMapping("/update")
    public Teacher updateData(@RequestBody Teacher teacher){
        return teachersService.updateTeacher(teacher);
    }

}
