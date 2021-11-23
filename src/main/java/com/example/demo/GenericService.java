package com.example.demo;

import java.util.List;


public interface GenericService<T> {

    //Reading all records from DB

    List<T> findAll();

    //Save the records to DB
    T save(T object);

    // update the record

    T update(T object);

    //Delete the record

    boolean delete (String id);



}
