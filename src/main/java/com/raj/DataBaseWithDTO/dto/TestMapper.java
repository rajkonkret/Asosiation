package com.raj.DataBaseWithDTO.dto;
import com.raj.DataBaseWithDTO.model.Test;
import org.springframework.stereotype.Component;

@Component //aby był beanem bo nie tworzymy go
public class TestMapper {

    private QuestionMapper questionMapper = new QuestionMapper();

    public TestDto mapToDto(Test test){
        TestDto testDto = new TestDto();

        testDto.setName(test.getName());

        testDto.setQuestions(questionMapper.mapToListQuestionDto(test.getQuestions()));
        return testDto;

    }
}
