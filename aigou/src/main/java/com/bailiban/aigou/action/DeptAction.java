package com.bailiban.aigou.action;
import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.bailiban.aigou.entity.Dept;
import com.bailiban.aigou.service.IDeptService;
import com.opensymphony.xwork2.ActionSupport;

@Controller("deptAction")
@ParentPackage("struts-default")
@Namespace("/")
@Scope("prototype")
public class DeptAction extends ActionSupport {
    private Dept dept;

    @Resource(name = "deptService")
    private IDeptService deptService;

    @Action(value = "add",results={@Result(name = "success",location = "/WEB-INF/jsp/aigou/admin/login.jsp")})
    public String add(){
    	Dept dept2 = new Dept();
    	dept2.setDeptname("name");
    	dept2.setDeptno(11);
        deptService.addDept(dept2);
        return SUCCESS;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public IDeptService getDeptService() {
        return deptService;
    }

    public void setDeptService(IDeptService deptService) {
        this.deptService = deptService;
    }

}