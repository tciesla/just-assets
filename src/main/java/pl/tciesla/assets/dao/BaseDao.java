package pl.tciesla.assets.dao;

import java.util.List;

public interface BaseDao<E, K> {
	
	void persist(E entity);
	
	void update(E entity);
	
	void delete(K id);
	
	List<E> fetchAll();
}
