package com.imooc.activiti.example;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.Expression;
import org.activiti.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

/**
 * test
 *
 * @author jimmy
 **/
public class MyTakeJavaDelegate implements JavaDelegate,Serializable{
    private static final Logger LOGGER = LoggerFactory.getLogger(MyTakeJavaDelegate.class);

    private Expression name;
    private Expression desc;

    @Override
    public void execute(DelegateExecution execution) {
        if(name != null){
            Object value = name.getValue(execution);
            LOGGER.info("name = {}",value);
        }
        if(desc != null){
            Object value = desc.getValue(execution);
            LOGGER.info("desc = {}",value);
        }
        LOGGER.info("run my java delegate {}",this);
    }
}
