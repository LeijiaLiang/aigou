package com.bailiban.aigou.dao.impl;
import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.bailiban.aigou.dao.IDeptDAO;
import com.bailiban.aigou.entity.Dept;

@Repository("deptDAO")
public class DeptDAOImpl implements IDeptDAO{
    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    public int addDept(Dept dept) {
        Serializable count = sessionFactory.getCurrentSession().save(dept);
        return (Integer) count;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Dept> findAll() {
        return sessionFactory.getCurrentSession().createQuery("from Dept").list();
    }

}