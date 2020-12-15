package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program started" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
       StudentDao studentdao = context.getBean("java",StudentDao.class);
       
       
       //insert  opration.....
       
//      Student s=new Student();
//      s.setId(11);
//      s.setName("chandan");
//      s.setCity("pune");
//      
//     int result = studentdao.insert(s);
//     System.out.println("student added"+result);
//     
     
       
       //update opration...
       
//     Student s=new Student();
//     s.setId(1);
//     s.setName("rahul");
//     s.setCity("up");
//     int result = studentdao.getchange(s);
//     
//     System.out.println("student data change="+result);
       
       
       
     //delete operation...
       
//       int result = studentdao.delete(1);
//       System.out.println("student data deleted="+result);
//       
       //select operation....
       
//       Student sss = studentdao.getStudent(11);
//       System.out.println(sss);
       
       
       
       //select all record from student table
       List<Student> result = studentdao.getAllStudents();
       System.out.println("here is all record of student="+result);
    }
    
    
    
}
