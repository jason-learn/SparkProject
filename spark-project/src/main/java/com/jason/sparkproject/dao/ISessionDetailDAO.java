package com.jason.sparkproject.dao;

import java.util.List;

import com.jason.sparkproject.domain.SessionDetail;

/**
 * Session明细DAO接口
 * @author jason
 *
 */
public interface ISessionDetailDAO {

	/**
	 * 插入一条session明细数据
	 * @param sessionDetail 
	 */
	void insert(SessionDetail sessionDetail);
	
	/**
	 * 批量插入session明细数据
	 * @param sessionDetails
	 */
	void insertBatch(List<SessionDetail> sessionDetails);
	
}
