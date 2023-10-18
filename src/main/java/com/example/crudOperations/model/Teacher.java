package com.example.crudOperations.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(
        description = "Teacher Model Information"
)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "teachersData")
public class Teacher {

    @Schema(description = "Teacher Id Number")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long teacherId;

    @Schema(description = "Teacher Name")
    private String teacherName;

    @Schema(description = "Teacher Salary")
    private double salary;

    @Schema(description = "Teacher Subject")
    private String subject;

    @Schema(description = "Mobile Number of Teacher")
    private long mobileNo;
}
