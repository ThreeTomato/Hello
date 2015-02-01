package com.gll.test.util;

import java.util.List;
import java.util.Map;

public interface BaseDao<T> {
	/**
	 * 
	* @Title: select 
	* @Description: 查询数据
	* @return List<T>    返回类型 
	* @throws
	 */
	public List<T> select(String namespace,Map<String, Object> map);
	/**
	 * 保存数据
	* @Title: save 
	* @Description: TODO
	* @return int    返回类型 
	* @throws
	 */
	public int save(String namespace,T t);
	
}
