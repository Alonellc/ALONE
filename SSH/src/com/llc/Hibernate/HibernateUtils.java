package com.llc.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author alone
 * @program: SSH
 * Hibernate工具类
 * @date 2019年 11月29日 17:14:14
 */
public class HibernateUtils {
    private static final Configuration configuration;
    private static final SessionFactory sessionFactory;

    static {
        configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
    }

    //Session获取
    public static Session openSession() {
        return sessionFactory.openSession();
    }

    public static void main(String[] args) {

    }
}
