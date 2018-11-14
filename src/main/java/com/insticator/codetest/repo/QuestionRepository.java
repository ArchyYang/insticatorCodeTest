package com.insticator.codetest.repo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<QuestionRepository, Long> {
    /**
     * Find the question with the given id.
     * @param id
     * @return
     */
    QuestionRepository findById(long id);

    /**
     * Update the question content with the given id and question text
     * @param questionText
     * @param id
     */
    @Modifying
    @Query("UPDATE question SET questionText =: questionText WHERE id =: id")
    void updateById(String questionText, long id);



    /**
     * Delete the question with the given id
     * @param id
     */
    @Modifying
    @Query("DELETE FROM question WHERE id = :id")
    void deleteById(long id);
}
