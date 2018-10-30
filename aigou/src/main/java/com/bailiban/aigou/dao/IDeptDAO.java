package com.bailiban.aigou.dao;
import java.util.List;

import com.bailiban.aigou.entity.Dept;

public interface IDeptDAO {
    //添加部门的方法
    public int addDept(Dept dept);
    public List findAll();
}