package com.jason.sparkproject.dao;

import java.util.List;

import com.jason.sparkproject.domain.AdClickTrend;

/**
 * 广告点击趋势DAO接口
 * @author jason
 *
 */
public interface IAdClickTrendDAO {

	void updateBatch(List<AdClickTrend> adClickTrends);
	
}
