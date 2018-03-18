package com.jason.sparkproject.dao;

import com.jason.sparkproject.domain.SessionRandomExtract;

/**
 * session随机抽取模块DAO接口
 * @author jason
 *
 */
public interface ISessionRandomExtractDAO {

	/**
	 * 插入session随机抽取
	 * @param sessionAggrStat 
	 */
	void insert(SessionRandomExtract sessionRandomExtract);
	
}
