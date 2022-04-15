package rs.edu.raf.cloudSimulationApi.dao.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import rs.edu.raf.cloudSimulationApi.dao.Dao;
import rs.edu.raf.cloudSimulationApi.domain.User;
import javax.persistence.EntityManager;

@Repository()
public class DaoUser implements Dao<User> {
    private EntityManager entityManager;
    @Autowired
    public DaoUser(EntityManager entityManager){
        this.entityManager=entityManager;
    }
    @Override
    public User create(User user) {
        return this.entityManager.merge(user);
    }
    public EntityManager getEntityManager() {
        return entityManager;
    }
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
