package com.insticator.codetest.repo;

import com.insticator.codetest.modal.UserQuestion;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserQuestionRepository extends CrudRepository<UserQuestion, Long> {
    /**
     * Update the question_id with the given id and question text
     * @param questionId
     * @param id
     */
    @Modifying
    @Query("UPDATE userquestion SET questionid =: questionId WHERE id =: id")
    void updateById(long questionId, long id);

}
