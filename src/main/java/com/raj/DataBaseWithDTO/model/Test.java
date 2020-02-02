package com.raj.DataBaseWithDTO.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor // dodaje konstruktor bezargumentowy wymagany by to był Bean
public class Test extends EntityBase{

    private String name;

    public Test(String name){
        this.name = name;
    }


    @OneToMany(mappedBy = "test", cascade = CascadeType.ALL)
    private List<Question> questions = new ArrayList<>();

    public void addQuestion(Question question) {
        question.setTest(this);
        questions.add(question);
    }
}
