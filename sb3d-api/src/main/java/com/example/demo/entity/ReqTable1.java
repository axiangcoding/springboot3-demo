package com.example.demo.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ReqTable1 {
    @Size(min = 1, max = 10)
    String someCol1;
    @NotNull
    Integer someCol2;
    @NotNull
    Boolean someCol3;
    @NotBlank
    String someCol4;

    public Table1 toTable1() {
        Table1 table1 = new Table1();
        table1.setSomeCol1(someCol1);
        table1.setSomeCol2(someCol2);
        table1.setSomeCol3(someCol3);
        table1.setSomeCol4(someCol4);
        return table1;
    }
}
