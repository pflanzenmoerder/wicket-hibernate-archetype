package ${groupId}.dao;

import org.springframework.stereotype.Repository;

import ${groupId}.api.GenericHibernateDAO;
import ${groupId}.entities.TestEntity;

@Repository
public class TestEntityDAO extends GenericHibernateDAO<TestEntity, Long>{
}
