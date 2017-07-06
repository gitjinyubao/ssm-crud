package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bean.Department;
import com.dao.DepartmentMapper;
/**
 * ����Dao��Ĺ���
 * �Ƽ�spring����Ŀʹ��spring�ĵ�Ԫ���ԣ��Զ�ע����Ҫ�����
 * ����springTestģ��
 * @author JinDaShuai
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
	@Autowired
	DepartmentMapper departmentMapper;
	/**
	 * ����DepartmentMapper
	 */
	@Test
	public void testCRUD(){
	//ԭʼ���Է�ʽ��	
		//����springIOC����ionContext
		//ApplicationContext ioc=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		//�������еõ�mapper
		//DepartmentMapper departmentMapper=(DepartmentMapper) ioc.getBean("departmentMapper");
    //spring�ĵ�Ԫ���Է�ʽ��
		System.out.println(departmentMapper);
	}
}
