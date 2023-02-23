package com.example.demo.service;

import com.example.demo.entity.table.Table1;
import com.example.demo.repository.Table1Repository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Table1Service {
    @Resource
    private Table1Repository table1Repository;

    public void saveTable1(Table1 entity) {
        table1Repository.save(entity);
    }

    public List<Table1> findByCol3(boolean val) {
        return table1Repository.findBySomeCol3(val);
    }

    public List<Table1> findAll() {
        return table1Repository.findAll();
    }
}
