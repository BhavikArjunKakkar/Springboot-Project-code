package com.example.demo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "job_category")
public class JobCategory {




@MongoId(FieldType.OBJECT_ID)
    private String id;
    @Field(value = "job_category_code")
    private String jobCategoryCode;
    @Field(value = "job_category_name")
    private String jobCategoryName;
    @Field(value = "description")
    private String description;

}
