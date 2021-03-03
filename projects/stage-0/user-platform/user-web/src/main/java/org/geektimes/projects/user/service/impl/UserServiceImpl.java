package org.geektimes.projects.user.service.impl;

import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.repository.UserRepository;
import org.geektimes.projects.user.service.UserService;
import org.geektimes.web.mvc.db.JdkRepositoryProxy;

/**
 * @className: UserServiceImpl
 * @description: TODO 类描述
 * @author: YM
 * @date: 3/4/2021
 **/
public class UserServiceImpl implements UserService {

    UserRepository userRepository = JdkRepositoryProxy.create(UserRepository.class);

    @Override
    public boolean register(User user) {
        return userRepository.save(user);
    }

    @Override
    public boolean deregister(User user) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public User queryUserById(Long id) {
        return null;
    }

    @Override
    public User queryUserByNameAndPassword(String name, String password) {
        return new User();
    }
}
