package com.example.demo.controller;

import com.example.demo.entity.table.Table1;
import com.example.demo.service.Table1Service;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/table1")
public class Table1Controller {

    @Resource
    Table1Service table1Service;

    @PostMapping
    public String save(@RequestBody Table1 entity){
        table1Service.saveTable1(entity);
        return "ok";
    }

    @GetMapping
    public List<Table1> findAll(){
        return table1Service.findAll();
    }
}
