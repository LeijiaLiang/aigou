package com.bailiban.aigou.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.bailiban.aigou.entity.Dept;
import com.bailiban.aigou.service.AdminLoginService;
import com.bailiban.aigou.service.IDeptService;
import com.bailiban.aigou.service.impl.AdminLoginServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope("prototype")
public class AdminLoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Dept dept;

	@Resource
	private AdminLoginService AdminLoginService;

	@Action(value = "", results = { @Result(name = SUCCESS, location = "/WEB-INF/jsp/aigou/admin/login/login.jsp") })

	public String loginPage() {
		return SUCCESS;

	}

	@Action(value = "/admin/login", results = {
			@Result(name = SUCCESS, location = "/WEB-INF/jsp/aigou/admin/index/index.jsp") })
	public String loginShowOne() {
		List<Dept> list = AdminLoginService.loginShowOne(dept);
		return SUCCESS;

	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

}
