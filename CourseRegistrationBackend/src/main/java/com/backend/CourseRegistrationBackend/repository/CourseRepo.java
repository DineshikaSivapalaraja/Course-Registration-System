package com.backend.CourseRegistrationBackend.repository;

import com.backend.CourseRegistrationBackend.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course, String> {
}
