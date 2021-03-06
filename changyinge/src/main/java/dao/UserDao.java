package dao;

import entity.User;

import java.util.List;

/**
 * Created by alber on 2016/8/30.
 */
public interface UserDao {
    public int add(User user);
    public int delete(String userId);
    public User get(String userId);
    public int update(User user);
    public List<User> getAll();
}
