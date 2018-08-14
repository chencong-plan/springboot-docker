package cc.ccoder.sprintboot.dao;

import cc.ccoder.sprintboot.pojo.UserEntity;

public interface UserDao {

    void saveUser(UserEntity user);

    UserEntity findUserByUsername(String username);

    void updateUser(UserEntity user);

    void deleteUserById(Long id);
}
