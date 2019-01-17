package org.springboot.sample.controller;

import java.util.List;

import org.springboot.sample.entity.MgrParamScope;
import org.springboot.sample.rowMapper.MgrParamScopeRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneController {
	@Autowired
    private JdbcTemplate jdbcTemplate;
    
    @RequestMapping("/pfr/search")
    public List<MgrParamScope> index(){
        
    	List<MgrParamScope> result = null;
    	try{
    		result = jdbcTemplate.query("select * from U_DB_PT.MGR_PARAM_SCOPE",
                    new MgrParamScopeRowMapper());
    	}catch(Exception e){
    		System.out.println(e.getMessage());
    	}
    			
        return result;
    }
}
