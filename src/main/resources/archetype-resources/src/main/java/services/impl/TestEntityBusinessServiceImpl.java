package ${groupId}.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ${groupId}.dao.TestEntityDAO;
import ${groupId}.entities.TestEntity;
import ${groupId}.services.TestEntityBusinessService;

@Repository
public class TestEntityBusinessServiceImpl implements TestEntityBusinessService {

	@Autowired
	private TestEntityDAO testEntityDAO;
	
	
	@Override
	@Transactional
	public List<TestEntity> getAllTestEntities() {
		return testEntityDAO.findAll();
	}

	@Override
	@Transactional
	public TestEntity getTestEntityById(Long id) {
		return testEntityDAO.findById(id, false);
	}

	@Override
	@Transactional
	public TestEntity persistTestEntity(TestEntity testEntity) {
		return testEntityDAO.makePersistent(testEntity);
	}

	
}
