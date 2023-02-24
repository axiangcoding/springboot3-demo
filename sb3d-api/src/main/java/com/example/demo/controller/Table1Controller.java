package com.example.demo.controller;

import com.example.demo.entity.ReqTable1;
import com.example.demo.entity.Table1;
import com.example.demo.service.Table1Service;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/table1")
@Slf4j
public class Table1Controller {

    @Resource
    Table1Service table1Service;

    @PostMapping("save")
    public String save(@RequestBody @Valid ReqTable1 entity){
        table1Service.saveTable1(entity.toTable1());
        return "ok";
    }

    @GetMapping("find")
    public List<Table1> findAll(){
        log.info("find all");
        return table1Service.findAll();
    }
}
