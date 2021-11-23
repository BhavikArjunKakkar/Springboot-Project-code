package com.example.demo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
@AllArgsConstructor
@Builder

public class JobCategoryDto {

    private String id;
    private String jobCategoryCode;
    private String jobCategoryName;
    private String description;


}
