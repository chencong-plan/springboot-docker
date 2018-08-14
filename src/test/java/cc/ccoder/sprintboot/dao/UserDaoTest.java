package cc.ccoder.sprintboot.dao;

import cc.ccoder.sprintboot.pojo.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {


    @Autowired
    private UserDao userDao;

    @Test
    public void saveUser() {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(3l);
        userEntity.setUsername("chencong");
        userEntity.setPassword("123456");
        userDao.saveUser(userEntity);
    }

    @Test
    public void findUserByUsername() {
        UserEntity userEntity = userDao.findUserByUsername("chencong");
        System.out.println("user:"+userEntity);
    }

    @Test
    public void updateUser() {
        UserEntity userEntity = userDao.findUserByUsername("chencong");
        userEntity.setUsername("chencong2");
        userDao.updateUser(userEntity);
    }

    @Test
    public void deleteUserById() {
        userDao.deleteUserById(1l);
    }
}