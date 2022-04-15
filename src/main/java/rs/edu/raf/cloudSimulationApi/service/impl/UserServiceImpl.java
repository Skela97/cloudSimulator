package rs.edu.raf.cloudSimulationApi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.edu.raf.cloudSimulationApi.dao.user.DaoUser;
import rs.edu.raf.cloudSimulationApi.domain.User;
import rs.edu.raf.cloudSimulationApi.service.UserService;
import javax.transaction.Transactional;

@Service("UserServiceImpl")
@Transactional
public class UserServiceImpl implements UserService {
    private DaoUser daoUser;
    @Autowired
    public UserServiceImpl(DaoUser daoUser){
        this.daoUser=daoUser;
    }
    @Override
    public User createUser(User user) {
        return this.daoUser.create(user);
    }
}
