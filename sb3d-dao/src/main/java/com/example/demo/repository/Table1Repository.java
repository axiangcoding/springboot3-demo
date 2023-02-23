package com.example.demo.repository;

import com.example.demo.entity.Table1;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Table1Repository extends JpaRepository<Table1, Long> {
    List<Table1> findBySomeCol3(Boolean someCol3);
}