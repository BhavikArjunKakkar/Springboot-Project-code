package controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/jobCategories")

public class JobCategoryController {

    @GetMapping
    public String getMessage() {
        return "hello from controllesucklkdmr";


    }
}