package cn.edu.nju.zyf.service.impl;

import com.alibaba.fastjson.JSON;  
import com.github.pagehelper.Page;  
import com.github.pagehelper.PageHelper;  
import cn.edu.nju.zyf.common.PageInfo;  
import cn.edu.nju.zyf.dao.UserDao;  
import cn.edu.nju.zyf.model.User;  
import cn.edu.nju.zyf.service.UserService;  
import org.apache.commons.logging.Log;  
import org.apache.commons.logging.LogFactory;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  

import java.util.List;

@Service
public class UserServiceImpl {
	Log logger = LogFactory.getLog(UserServiceImpl.class);
	
	@Autowired
	private UserDao userDao;
	
	
}
