package ${groupId}.services;

import java.util.List;

import ${groupId}.entities.TestEntity;

public interface TestEntityBusinessService {
	public List<TestEntity> getAllTestEntities();
	public TestEntity getTestEntityById(Long id);
	public TestEntity persistTestEntity(TestEntity testEntity);
}
