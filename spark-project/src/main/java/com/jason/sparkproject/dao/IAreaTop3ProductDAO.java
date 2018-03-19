package com.jason.sparkproject.dao;

import java.util.List;

import com.jason.sparkproject.domain.AreaTop3Product;

/**
 * 各区域top3热门商品DAO接口
 * @author jason
 *
 */
public interface IAreaTop3ProductDAO {

	void insertBatch(List<AreaTop3Product> areaTopsProducts);
	
}
