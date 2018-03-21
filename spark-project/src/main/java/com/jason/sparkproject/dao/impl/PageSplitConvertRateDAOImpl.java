package com.jason.sparkproject.dao.impl;

import com.jason.sparkproject.dao.IPageSplitConvertRateDAO;
import com.jason.sparkproject.domain.PageSplitConvertRate;
import com.jason.sparkproject.jdbc.JDBCHelper;

/**
 * 页面切片转化率DAO实现类
 * @author jason
 *
 */
public class PageSplitConvertRateDAOImpl implements IPageSplitConvertRateDAO {

	@Override
	public void insert(PageSplitConvertRate pageSplitConvertRate) {
		String sql = "insert into page_split_convert_rate values(?,?)";  
		Object[] params = new Object[]{pageSplitConvertRate.getTaskid(), 
				pageSplitConvertRate.getConvertRate()};
		
		JDBCHelper jdbcHelper = JDBCHelper.getInstance();
		jdbcHelper.executeUpdate(sql, params);
	}

}
