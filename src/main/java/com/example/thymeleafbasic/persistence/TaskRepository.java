package com.example.thymeleafbasic.persistence;

import com.example.thymeleafbasic.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Integer> {

    List<Task> findAllByStaff_Id(String id);
}
