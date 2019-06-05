package net.wanho.test;

import net.wanho.pojo.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/**
 * Created by Administrator on 2019/6/5.
 */



public class TestMybatis {
    private SqlSession sqlSession ;



    @Before
    public void before(){
        InputStream inputStream = TestMybatis.class.getClassLoader().getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        //创建会话
        sqlSession=sf.openSession();

    }

    @Test
    public  void testAddStu(){
        Student student =new Student(null,"zhangsan",1234);

   sqlSession.update("net.wanho.mapper.StudentMapper.addStu",student);
   sqlSession.commit();
   sqlSession.close();
    }



}
