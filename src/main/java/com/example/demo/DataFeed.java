package com.example.demo;


import java.util.Arrays;
import java.util.List;

public class DataFeed {

    public static List<JobCategory> jobCategories = Arrays.asList(

            JobCategory.builder().id("1").jobCategoryCode("Full_Stack_Dev").jobCategoryName("Full Stack Developer").description("Full Stack Developer").build(),

            JobCategory.builder().id("2").jobCategoryCode("Angular_Dev").jobCategoryName("Angular Developer").description("Angular Developer").build(),

            JobCategory.builder().id("3").jobCategoryCode("Java_Dev").jobCategoryName("Java Developer").description("Java Developer").build(),

            JobCategory.builder().id("4").jobCategoryCode("DB_Admin").jobCategoryName("Database Admin").description("Database Admin").build(),

            JobCategory.builder().id("5").jobCategoryCode("BA").jobCategoryName("Business Analyst").description("Business Analyst").build()
    );
}