package org.springboot.sample.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springboot.sample.entity.MgrParamScope;
import org.springframework.jdbc.core.RowMapper;

public class MgrParamScopeRowMapper implements RowMapper<MgrParamScope> {

	@Override
	public MgrParamScope mapRow(ResultSet rs, int rowNum) throws SQLException {
		MgrParamScope mgrParamScope = new MgrParamScope();
		mgrParamScope.setApiId(rs.getInt("API_ID"));
		mgrParamScope.setParamKey(rs.getString("PARAM_KEY"));
		mgrParamScope.setToken(rs.getString("TOKEN"));
		mgrParamScope.setValue(rs.getString("VALUE"));
		
		return mgrParamScope;
	}
}
