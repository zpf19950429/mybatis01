package net.wanho.mapper;

import net.wanho.pojo.Student;

import java.util.List;

/**
 * Created by Administrator on 2019/6/5.
 */
public interface StudentMapper {

    List<Student>getAllStus();

    void addStu(Student student);

}
