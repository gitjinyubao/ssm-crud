package com.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import com.bean.Department;
import com.dao.DepartmentMapper;
/**
 * ����Dao��Ĺ���
 * �Ƽ�spring����Ŀʹ��spring�ĵ�Ԫ���ԣ��Զ�ע����Ҫ�����
 * ����springTestģ��
 * @author JinDaShuai
 */
@ContextConfiguration
public class MapperTest {
	@Autowired
	/**
	 * ����DepartmentMapper
	 */
	@Test
	public void testCRUD(){
	//ԭʼ���Է�ʽ��	
		//����springIOC����ionContext
		ApplicationContext ioc=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		//�������еõ�mapper
		DepartmentMapper departmentMapper=(DepartmentMapper) ioc.getBean("departmentMapper");
    //spring�ĵ�Ԫ���Է�ʽ��
		System.out.println(departmentMapper);
	}
}
