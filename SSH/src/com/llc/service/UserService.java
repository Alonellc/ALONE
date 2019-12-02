package com.llc.service;

import com.llc.dao.IUserDAO;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author alone
 * @program: SSH
 * 用户服务层
 * @date 2019年 11月29日 19:56:38
 */
@Transactional
public class UserService {
    private IUserDAO iUserDAO;
    public void setiUserDAO(IUserDAO iUserDAO) {
        this.iUserDAO = iUserDAO;
    }

    public void add(){
        iUserDAO.add();
    }
}
