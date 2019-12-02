package com.llc.dao.impl;

import com.llc.Hibernate.HibernateUtils;
import com.llc.dao.IUserDAO;
import com.llc.entity.User;
import org.springframework.orm.hibernate5.HibernateTemplate;

/**
 * @author alone
 * @program: SSH
 * 用户操作
 * @date 2019年 11月29日 17:54:53
 */
public class IUserDAOImpl implements IUserDAO {
    private HibernateTemplate hibernateTemplate;
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public boolean add() {
        User user = new User();
        user.setName("卢立聪");
        user.setPassWord("123456");
        hibernateTemplate.save(user);
        return false;
    }
}
