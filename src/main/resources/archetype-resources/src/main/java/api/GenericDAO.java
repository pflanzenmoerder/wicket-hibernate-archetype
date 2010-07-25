package ${groupId}.api;

import java.io.Serializable;
import java.util.List;

/**
 * Based on http://community.jboss.org/wiki/GenericDataAccessObjects
 * 
 * @author jmader
 *
 */
public interface GenericDAO<T, ID extends Serializable> {
	 
    T findById(ID id, boolean lock);
 
    List<T> findAll();
 
    List<T> findByExample(T exampleInstance, String[] excludeProperty);
 
    T makePersistent(T entity);
 
    void makeTransient(T entity);
}
