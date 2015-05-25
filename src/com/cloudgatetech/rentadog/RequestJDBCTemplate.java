package com.cloudgatetech.rentadog;

import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class RequestJDBCTemplate {
   private DataSource dataSource;
   private JdbcTemplate jdbcTemplateObject;
   
   public void setDataSource(DataSource dataSource) {
      this.dataSource = dataSource;
      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
   }

   public void create(Integer userid, String breed, Date start, Date end) {
      String SQL = "insert into Request (user_id, breed, start, end) values (?, ?, ?, ?)";
      
      jdbcTemplateObject.update( SQL, userid, breed, start, end);
      return;
   }

   public Request getRequest(Integer id) {
      String SQL = "select * from Request where id = ?";
      Request request = jdbcTemplateObject.queryForObject(SQL, 
                        new Object[]{id}, new RequestMapper());
      return request;
   }

   public List<Request> listRequests() {
      String SQL = "select * from Request";
      List <Request> requests = jdbcTemplateObject.query(SQL, 
                                new RequestMapper());
      return requests;
   }

   public void delete(Integer id){
      String SQL = "delete from Request where id = ?";
      jdbcTemplateObject.update(SQL, id);
      System.out.println("Deleted Record with ID = " + id );
      return;
   }

}