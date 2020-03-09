package com.listen;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.domain.User;

@WebListener
public class ServletContextListenr implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

    public void contextInitialized(ServletContextEvent sce)  { 
         //用于存放用户数据
    	List<User> userList = new ArrayList<User>();
    	//将userList存放在全局作用域里
    	sce.getServletContext().setAttribute("userList", userList);
    }
	
}
