package com.zxt.dao;

import com.zxt.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.w3c.dom.ls.LSException;

import java.util.List;

public interface StudentDao {
    //查询接口
    List<Student> selectStudents();
    //插入结果
    int insertStudent(Student student);
    //PageHelper分页
    List<Student> selectAll();

    //根据一个参数查询数据
    List<Student> selectBySno(@Param("sno") int sno );

    //根据两个参数查询数据
    List<Student> selectBySnoOrSname(@Param("sno") int sno, @Param("sname") String sname);

    //动态sql <if><where>标签
    List<Student> selectByOne(Student student);

    //<foreach>标签
    List<Student> selectByTwo(List list);
    //
    List<Student> newSelectStudents();
}
