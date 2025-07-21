package com.backend.CourseRegistrationBackend.repository;

import com.backend.CourseRegistrationBackend.model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistryRepo extends JpaRepository<CourseRegistry, Integer> {
}
