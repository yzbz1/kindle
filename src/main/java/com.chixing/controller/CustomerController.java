package com.chixing.controller;

import com.chixing.service.CustomerService;
import com.chixing.service.impl.CustomerServiceImpl;

/**
 * 组件与组件之间的通信实现：接口
 * 面向接口编程： (1) 安全性:实现子类不被暴露出去
 *                (2) 耦合性：组件之间耦合性低
 *
 *  service层的对象（CustomerServiceImpl），生命周期由controller层控制
 *
 *  组件的生命周期交由第三方控制：
 *  优势：（1）安全性:实现子类不被暴露出去
 *       （2）耦合性：组件之间耦合性低
 *
 *
 * Controller依赖于Service层
 *   service对象由哪几种方式实现依赖？
 *   1. 构造器依赖注入
 *   2. setter依赖注入
 *
 */
public class CustomerController {

    private int age;
    private int count;
    private  CustomerService service ; //service 对象 由第三方容器中提供


    public CustomerController(int age, int count,CustomerService service) {
        System.out.print("controller的有参构造函数......");
        this.age = age;
        this.count = count;
        this.service = service;
    }


    public void save(){

        service.save(null);
    }


}
