package com.chixing.service.impl;

import com.chixing.entity.Customer;
import com.chixing.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {


    public CustomerServiceImpl(){
        System.out.println("CustomerServiceImpl的无参构造函数....");
    }



    public void myinit(){
        System.out.println("CustomerServiceImpl 的初始化方法");
    }
    public void mydestory(){
        System.out.println("CustomerServiceImpl 的消亡方法");
    }


    @Override
    public boolean save(Customer customer) {
        System.out.println("访问CustomerServiceImpl 的save方法");
        return false;
    }



}
