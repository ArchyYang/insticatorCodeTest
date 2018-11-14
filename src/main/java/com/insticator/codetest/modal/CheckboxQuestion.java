package com.insticator.codetest.modal;


import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.List;


public class CheckboxQuestion extends Question {

    @OneToMany(cascade = CascadeType.REMOVE)
    private List<Option> options;

    public CheckboxQuestion(long questionID, String questionText, List<Option> options) {
        this.id = questionID;
        this.questionText = questionText;
        this.options = options;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }
}
