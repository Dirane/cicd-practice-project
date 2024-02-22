package com.dirane.cicdpracticeproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdPracticeProjectApplication {


    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to javaSpirng";
    }


//    echo "# cicd-practice-project" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/Dirane/cicd-practice-project.git
//    git push -u origin main
    public static void main(String[] args) {
        SpringApplication.run(CicdPracticeProjectApplication.class, args);
    }

}
