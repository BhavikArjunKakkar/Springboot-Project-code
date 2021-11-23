package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;






@Repository
@Service
@ComponentScan("com.myapp.repositories")
public class JobCategoryServiceImpl implements JobCategoryService{

   @Autowired
    private JobCategoryRepo repo;

    @Override
    public List<JobCategory> findAll() {
        return repo.findAll();
    }

    @Override
    public JobCategory save(JobCategory jobCategory) {
        return repo.save(jobCategory);
    }

    @Override
    public JobCategory update(JobCategory jobCategory) {
        return repo.save(jobCategory);
    }

    @Override
    public boolean delete(String id) {
        try {
            repo.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
