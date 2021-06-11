package com.jsf.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;


@ManagedBean(name="navigationController",eager=true)
@RequestScoped
public class NavigationController implements Serializable{
	private static final long serialVersionUID=1L;
	public String goToPage1() {
		return "page1";
		
	}
	public String goToPage2() {
		return "page2";
	}
	public String goToHome() {
		return "index";
	}
	
	//Conditional Navigation
	
	@ManagedProperty(value="#{param.page}")
	private String page;
	
	public String navigate() {
		if(page==null) {
			return "index";
		}
		if(page.equalsIgnoreCase("transaction")) {
			return "transaction";
		}
		
		return "error";
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
