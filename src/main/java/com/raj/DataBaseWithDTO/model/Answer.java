package com.raj.DataBaseWithDTO.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@Entity
public class Answer extends EntityBase{

    private String name;
    private boolean correct;

    @JoinColumn(name = "question_id")
    @ManyToOne
    private Question question;

    public Answer(String name, boolean correct) {
        this.name = name;
        this.correct = correct;
    }

    public boolean isCorrect() {
        return correct;
    }

}
