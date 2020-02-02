package com.raj.DataBaseWithDTO.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class QuestionDto {


    private Long id;
    private String content;
    private List<String> options = new ArrayList<>();
    private String answer;

    public QuestionDto(String content) {
        this.content = content;
    }
}
