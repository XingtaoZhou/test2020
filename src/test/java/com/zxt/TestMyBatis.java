package com.zxt;

import com.github.pagehelper.PageHelper;
import com.zxt.dao.StudentDao;
import com.zxt.entity.Student;
import com.zxt.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestMyBatis {
    @Test
    public void testSelectStudents(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> studentList = dao.selectStudents();
        for (Student student : studentList)
            System.out.println(student);
    }

    @Test
    public void testInsertStudent(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student(9,"lisi","ls@163.com","女",18);
        int result = dao.insertStudent(student);
        sqlSession.commit();
        System.out.println("插入数据条数："+result);
    }

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        PageHelper.startPage(1,3);
        List<Student> studentList = dao.selectAll();
        for (Student student : studentList)
            System.out.println(student);
    }

    @Test
    public void testSelectBySno(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> studentList = dao.selectBySno(5);
        for (Student student : studentList)
            System.out.println(student);
    }

    @Test
    public void testSelectBySnoAndSname(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> studentList = dao.selectBySnoOrSname(5,"wangwu");
        for (Student student : studentList)
            System.out.println(student);
    }

    @Test
    public void testSelectByOne(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        student.setAge(21);
        student.setSno(5);

        List<Student> studentList = dao.selectByOne(student);
        for (Student students: studentList)
            System.out.println(students);
    }
    @Test
    public void testSelectByTwo(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List list = new ArrayList();
        list.add(3);
        list.add(4);
        list.add(5);

        List<Student> studentList = dao.selectByTwo(list);
        for (Student students: studentList)
            System.out.println(students);
    }
}
