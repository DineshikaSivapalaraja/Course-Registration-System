package com.backend.CourseRegistrationBackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Course {
    @Column(length = 64)
    @Id
    private String courseId;
    private String courseName;
    private String instructor;
    private int durationInWeeks;
}
