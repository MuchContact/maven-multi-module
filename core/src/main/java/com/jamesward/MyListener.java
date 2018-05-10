package com.web.com.web.res;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.err.println("xxxxxxxxxxxxxxxxxxxxx");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
