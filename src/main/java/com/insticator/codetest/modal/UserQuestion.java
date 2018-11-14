package com.insticator.codetest.modal;

import javax.persistence.Id;

public class UserQuestion {

    @Id
    private long UUID;

    private long questionId;

    public UserQuestion(long UUID, long questionId) {
        this.UUID = UUID;
        this.questionId = questionId;
    }

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public long getUUID() {
        return UUID;
    }

    public void setUUID(long UUID) {
        this.UUID = UUID;
    }


}
