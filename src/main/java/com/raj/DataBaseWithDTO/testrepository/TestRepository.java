package com.raj.DataBaseWithDTO.testrepository;

import com.raj.DataBaseWithDTO.model.Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends CrudRepository<Test, Long> {

}
