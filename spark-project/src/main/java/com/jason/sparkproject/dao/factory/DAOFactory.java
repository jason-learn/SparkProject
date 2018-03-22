package com.jason.sparkproject.dao.factory;

import com.jason.sparkproject.dao.IAdBlacklistDAO;
import com.jason.sparkproject.dao.IAdClickTrendDAO;
import com.jason.sparkproject.dao.IAdProvinceTop3DAO;
import com.jason.sparkproject.dao.IAdStatDAO;
import com.jason.sparkproject.dao.IAdUserClickCountDAO;
import com.jason.sparkproject.dao.IAreaTop3ProductDAO;
import com.jason.sparkproject.dao.IPageSplitConvertRateDAO;
import com.jason.sparkproject.dao.ISessionAggrStatDAO;
import com.jason.sparkproject.dao.ISessionDetailDAO;
import com.jason.sparkproject.dao.ISessionRandomExtractDAO;
import com.jason.sparkproject.dao.ITaskDAO;
import com.jason.sparkproject.dao.ITop10CategoryDAO;
import com.jason.sparkproject.dao.ITop10SessionDAO;
import com.jason.sparkproject.dao.impl.AdBlacklistDAOImpl;
import com.jason.sparkproject.dao.impl.AdClickTrendDAOImpl;
import com.jason.sparkproject.dao.impl.AdProvinceTop3DAOImpl;
import com.jason.sparkproject.dao.impl.AdStatDAOImpl;
import com.jason.sparkproject.dao.impl.AdUserClickCountDAOImpl;
import com.jason.sparkproject.dao.impl.AreaTop3ProductDAOImpl;
import com.jason.sparkproject.dao.impl.PageSplitConvertRateDAOImpl;
import com.jason.sparkproject.dao.impl.SessionAggrStatDAOImpl;
import com.jason.sparkproject.dao.impl.SessionDetailDAOImpl;
import com.jason.sparkproject.dao.impl.SessionRandomExtractDAOImpl;
import com.jason.sparkproject.dao.impl.TaskDAOImpl;
import com.jason.sparkproject.dao.impl.Top10CategoryDAOImpl;
import com.jason.sparkproject.dao.impl.Top10SessionDAOImpl;

/**
 * DAO工厂类
 * @author jason
 *
 */
public class DAOFactory {


	public static ITaskDAO getTaskDAO() {
		return new TaskDAOImpl();
	}

	public static ISessionAggrStatDAO getSessionAggrStatDAO() {
		return new SessionAggrStatDAOImpl();
	}
	
	public static ISessionRandomExtractDAO getSessionRandomExtractDAO() {
		return new SessionRandomExtractDAOImpl();
	}
	
	public static ISessionDetailDAO getSessionDetailDAO() {
		return new SessionDetailDAOImpl();
	}
	
	public static ITop10CategoryDAO getTop10CategoryDAO() {
		return new Top10CategoryDAOImpl();
	}
	
	public static ITop10SessionDAO getTop10SessionDAO() {
		return new Top10SessionDAOImpl();
	}
	
	public static IPageSplitConvertRateDAO getPageSplitConvertRateDAO() {
		return new PageSplitConvertRateDAOImpl();
	}
	
	public static IAreaTop3ProductDAO getAreaTop3ProductDAO() {
		return new AreaTop3ProductDAOImpl();
	}
	
	public static IAdUserClickCountDAO getAdUserClickCountDAO() {
		return new AdUserClickCountDAOImpl();
	}
	
	public static IAdBlacklistDAO getAdBlacklistDAO() {
		return new AdBlacklistDAOImpl();
	}
	
	public static IAdStatDAO getAdStatDAO() {
		return new AdStatDAOImpl();
	}
	
	public static IAdProvinceTop3DAO getAdProvinceTop3DAO() {
		return new AdProvinceTop3DAOImpl();
	}
	
	public static IAdClickTrendDAO getAdClickTrendDAO() {
		return new AdClickTrendDAOImpl();
	}
	
}
