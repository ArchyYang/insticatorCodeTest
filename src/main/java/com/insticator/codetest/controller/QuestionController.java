package com.insticator.codetest.controller;

import com.insticator.codetest.modal.Question;
import com.insticator.codetest.serv.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping(value = "/Question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping
    public Question getQuestion(@PathVariable long UUID) {
        return  questionService.getQuestion(UUID);
    }

    @DeleteMapping
    public Question deleteQuestion(@PathVariable long id) {
        return  questionService.getQuestion(id);
    }
}
