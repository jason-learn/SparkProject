package com.jason.sparkproject.test;

import com.jason.sparkproject.dao.ITaskDAO;
import com.jason.sparkproject.dao.factory.DAOFactory;
import com.jason.sparkproject.domain.Task;

/**
 * 任务管理DAO测试类
 * @author Administrator
 *
 */
public class TaskDAOTest {
	
	public static void main(String[] args) {
		ITaskDAO taskDAO = DAOFactory.getTaskDAO();
		Task task = taskDAO.findById(2);
		System.out.println(task.getTaskName());  
	}
	
}
