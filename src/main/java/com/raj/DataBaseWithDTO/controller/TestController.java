package com.raj.DataBaseWithDTO.controller;

import com.raj.DataBaseWithDTO.dto.TestDto;
import com.raj.DataBaseWithDTO.dto.TestMapper;
import com.raj.DataBaseWithDTO.testrepository.TestRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// @Controller
@RestController
@CrossOrigin
@RequestMapping("/tests")
//@NoArgsConstructor
public class TestController {

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private TestRepository testRepository;

    @GetMapping("/{id}")
    @ResponseBody
    public TestDto sayHello(@PathVariable Long id) {

        return testMapper.mapToDto((testRepository.findById(id).get()));

    }
}
