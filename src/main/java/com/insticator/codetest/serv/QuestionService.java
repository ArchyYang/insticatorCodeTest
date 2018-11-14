package com.insticator.codetest.serv;

import com.insticator.codetest.modal.*;
import com.insticator.codetest.repo.QuestionRepository;
import com.insticator.codetest.repo.UserQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuestionService {

    // Assume question_id starts from 0.
    public static final long QUESTION_ID_START = 0;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private UserQuestionRepository userQuestionRepository;


    public Question getQuestion(Long id) {
        Question question = null;
        Optional optional = questionRepository.findById(id);
        if(optional.isPresent()) {
            question = (Question)optional.get();
        }
        return question;
    }


    public Question getQuestionByUUID(long UUID) {
        Optional option = userQuestionRepository.findById(UUID);
        if (!option.isPresent()) {
            userQuestionRepository.save(new UserQuestion(UUID,QUESTION_ID_START));
            return getQuestion(QUESTION_ID_START);
        }
        long last_id = (long)option.get();
        if (getQuestion(++last_id) == null) {
            last_id = QUESTION_ID_START;
        }
        userQuestionRepository.updateById(last_id, UUID);
        return getQuestion(last_id);
    }

    public void deleteQuestion(long id) {
        questionRepository.deleteById(id);
    }
}
