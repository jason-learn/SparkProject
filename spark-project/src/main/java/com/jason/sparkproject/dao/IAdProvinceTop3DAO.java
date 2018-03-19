package com.jason.sparkproject.dao;

import java.util.List;

import com.jason.sparkproject.domain.AdProvinceTop3;

/**
 * 各省份top3热门广告DAO接口
 * @author jason
 *
 */
public interface IAdProvinceTop3DAO {

	void updateBatch(List<AdProvinceTop3> adProvinceTop3s);
	
}
