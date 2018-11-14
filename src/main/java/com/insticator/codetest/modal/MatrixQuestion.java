package com.insticator.codetest.modal;


import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

public class MatrixQuestion extends Question {

    private String questionText;
    @OneToOne(cascade = CascadeType.REMOVE)
    private Option header;
    @OneToMany(cascade = CascadeType.REMOVE)
    private List<Option> verticalOptions;
    @OneToMany(cascade = CascadeType.REMOVE)
    private List<Option> horizontalOptions;



    public List<Option> getVerticalOptions() {
        return verticalOptions;
    }

    public void setVerticalOptions(List<Option> verticalOptions) {
        this.verticalOptions = verticalOptions;
    }

    public List<Option> getHorizontalOptions() {
        return horizontalOptions;
    }

    public void setHorizontalOptions(List<Option> horizontalOptions) {
        this.horizontalOptions = horizontalOptions;
    }


    public Option getHeader() {
        return header;
    }

    public void setHeader(Option header) {
        this.header = header;
    }
}