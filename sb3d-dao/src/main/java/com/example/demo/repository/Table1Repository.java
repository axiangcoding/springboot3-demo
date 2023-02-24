package com.example.demo.repository;

import com.example.demo.entity.Table1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;

import java.util.List;

public interface Table1Repository extends JpaRepository<Table1, Long> {
    List<Table1> findBySomeCol3(Boolean someCol3);

    @Query("select t from Table1 t where t.someCol4 = ?1")
    Table1 findBySomeCol4(@NonNull String someCol4);
}