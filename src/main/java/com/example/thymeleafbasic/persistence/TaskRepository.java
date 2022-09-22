package com.example.thymeleafbasic.persistence;

import com.example.thymeleafbasic.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Integer> {

}
