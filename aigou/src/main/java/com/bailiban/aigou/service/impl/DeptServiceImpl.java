package com.bailiban.aigou.service.impl;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bailiban.aigou.dao.IDeptDAO;
import com.bailiban.aigou.entity.Dept;
import com.bailiban.aigou.service.IDeptService;

@Service("deptService")
public class DeptServiceImpl implements IDeptService {
    @Resource(name = "deptDAO")
    private IDeptDAO deptDAO;

    @Transactional
    public void addDept(Dept dept) {
        deptDAO.addDept(dept);
    }

    public IDeptDAO getDeptDAO() {
        return deptDAO;
    }

    public void setDeptDAO(IDeptDAO deptDAO) {
        this.deptDAO = deptDAO;
    }
}