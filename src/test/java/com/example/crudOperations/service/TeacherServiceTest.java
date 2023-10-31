package com.example.crudOperations.service;

import com.example.crudOperations.model.Teacher;
import com.example.crudOperations.repository.TeachersRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TeacherServiceTest {
    @Mock
    private TeachersRepo teachersRepo;

    @InjectMocks
    private TeachersService teachersService;

    @Test
    public void saveDataTestCase(){
        Teacher teacher = new Teacher(1,"jaga",250000.00,"Computers",897397434);
        when(teachersRepo.save(any(Teacher.class))).thenReturn(teacher);

        assertEquals(teacher,teachersService.saveTeacher(teacher));
    }

    @Test
    public void getTeachersDataTestcase(){
        Optional<Teacher> teacherOptional = Optional.of(new Teacher(1,"jaga",250000.00,"Computers",897397434));
        when(teachersRepo.findById(anyLong())).thenReturn(teacherOptional);
        assertEquals(teacherOptional,teachersService.getTeacher(1));

    }

    @Test
    public void deleteTeacherPositiveTestcase(){
        doNothing().when(teachersRepo).deleteById(anyLong());
        Optional<Teacher> teacherOptional = Optional.empty();
        when(teachersRepo.findById(anyLong())).thenReturn(teacherOptional);
        String expected = "Data Deleted Successfully";
        assertEquals(expected,teachersService.deleteTeacher(1));
    }

    @Test
    public void deleteTeacherNegativeTestcase(){
        doNothing().when(teachersRepo).deleteById(anyLong());
        Optional<Teacher> teacherOptional = Optional.of(new Teacher(1,"jaga",250000.00,"Computers",897397434));
        when(teachersRepo.findById(anyLong())).thenReturn(teacherOptional);
        String expected = "Data is Not Deleted";
        assertEquals(expected,teachersService.deleteTeacher(1));
    }

    @Test
    public void updateTeacherTestcase(){
        Teacher teacher = new Teacher(1,"jaga",250000.00,"Computers",897397434);
        when(teachersRepo.save(any(Teacher.class))).thenReturn(teacher);

        assertEquals(teacher,teachersService.updateTeacher(teacher));
    }
}
