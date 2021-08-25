package com.dio.project1.repository;

import com.dio.project1.model.Workday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkRepository extends JpaRepository<Workday,Long> {
}
