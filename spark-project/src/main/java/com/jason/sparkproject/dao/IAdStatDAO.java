package com.jason.sparkproject.dao;

import java.util.List;

import com.jason.sparkproject.domain.AdStat;

/**
 * 广告实时统计DAO接口
 * @author jason
 *
 */
public interface IAdStatDAO {

	void updateBatch(List<AdStat> adStats);
	
}
