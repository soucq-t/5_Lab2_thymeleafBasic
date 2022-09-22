package com.example.thymeleafbasic.persistence;

import com.example.thymeleafbasic.domain.Staff;
import com.example.thymeleafbasic.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff,String> {
}
