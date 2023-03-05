package com.imooc.activiti.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

/**
 * test
 *
 * @author jimmy
 **/
public class MyJavaBean implements Serializable{
    private static final Logger LOGGER = LoggerFactory.getLogger(MyJavaBean.class);

    private String name;

    public String getName() {
        LOGGER.info("run getName name:{}",name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyJavaBean() {
    }

    public MyJavaBean(String name) {
        this.name = name;
    }

    public void sayHello(){
        LOGGER.info("run sayHello");

    }
}
