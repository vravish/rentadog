package com.cloudgatetech.rentadog;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

public class RequestMapper implements RowMapper<Request> {
   public Request mapRow(ResultSet rs, int rowNum) throws SQLException {
      Request request = new Request();
      request.setId(rs.getInt("id"));
      request.setUserid(rs.getInt("user_id"));
      request.setBreed(rs.getString("breed"));
      request.setStart(rs.getTimestamp("start"));
      request.setEnd(rs.getTimestamp("end"));
      return request;
   }
}