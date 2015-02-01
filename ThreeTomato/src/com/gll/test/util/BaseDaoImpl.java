package com.gll.test.util;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

@Component
public class BaseDaoImpl<T> implements BaseDao<T> {
	@Resource
	private SqlSessionTemplate sqlSession;
	/**
	 * 
	* @Title: select 
	* @Description: 查询数据
	* @return List<T>    返回类型 
	* @throws
	 */
	public List<T> select(String namespace,Map<String, Object> map) {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace,map);
	}
	/**
	 * 保存数据
	* @Title: save 
	* @Description: TODO
	* @return void    返回类型 
	* @throws
	 */
	public int save(String namespace,T t){
		return sqlSession.insert(namespace, t);
	}
	
	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSession;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSession = sqlSessionTemplate;
	}

}
