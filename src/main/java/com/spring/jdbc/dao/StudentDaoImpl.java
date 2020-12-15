package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entity.Student;



@Component("StudentDao")
public class StudentDaoImpl implements StudentDao {

@Autowired
private JdbcTemplate jdbcTemplate;
	

//insert
	public int insert(Student student) {
		  //insert query.....
        String query="insert into student(id,name,city) values(?,?,?)";
        
        int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
        
		return r;
	}
	
	///update
	
	public int getchange(Student s) {
		String query="update  student set name=?,city=? where id=?";
		int r = this.jdbcTemplate.update(query,s.getName(),s.getCity(),s.getId());
		return r;
	}
	
	
	
	//delete...
	public int delete(int id) {
		String query="delete from student where id=?";
		int d = this.jdbcTemplate.update(query,id);
		return d;
	}


	
	//select single ...
	public Student getStudent(int id) {
		String query="select * from student where id=?";
		
		RowMapper<Student> r=new RowMappeImpl();
		Student ss = this.jdbcTemplate.queryForObject(query,r,id );
		return ss;
	}
	
	
	
	//select all..
	public List<Student> getAllStudents() {
	String query="select * from student";
	List<Student> ans = this.jdbcTemplate.query(query, new RowMappeImpl());
		return ans;
	}


	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	
	


	
	

}
