package com.example.crudOperations.repository;

import com.example.crudOperations.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeachersRepo extends JpaRepository<Teacher,Long> {
}
