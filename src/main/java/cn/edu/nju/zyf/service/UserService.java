package cn.edu.nju.zyf.service;

import java.util.List;

import cn.edu.nju.zyf.common.PageInfo;
import cn.edu.nju.zyf.model.User;

public interface UserService {
	void findUser(PageInfo pageInfo, User user);
	void createUser(User user);
	void deleteUser(User user);
	void batchDeleteUser(List<Integer> userIds);
	void updateUser(User user);
}
