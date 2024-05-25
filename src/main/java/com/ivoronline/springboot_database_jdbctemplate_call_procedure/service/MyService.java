package com.ivoronline.springboot_database_jdbctemplate_call_procedure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class MyService {

  //PROPERTIES
  @Autowired private JdbcTemplate jdbcTemplate;

  //=========================================================================================================
  // CALL PROCEDURE
  //=========================================================================================================
  public Integer callProcedure(String name, Integer age) {
    return jdbcTemplate.update(
      " CALL TEST.MY_PROCEDURE(?, ?)"
      , name, age             //new Object[] { name, age }
    );
  }

}
