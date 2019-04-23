package com.chixing.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 客户类
 */
public class Customer implements Serializable{
    private Integer custId;
    private String custName;
    private String custPwd;
    private Integer custAge;

    private Long custPhone;
    private String custEmail;
    private Date custCreateTime;
    private Date custUpdateTime;

    private String custProfile;

    public Customer(){}
    public Customer(Integer custId, String custName, String custPwd, int custAge, long custPhone, String custEmail, Date custCreateTime, Date custUpdateTime, String custProfile) {
        this.custId = custId;
        this.custName = custName;
        this.custPwd = custPwd;
        this.custAge = custAge;
        this.custPhone = custPhone;
        this.custEmail = custEmail;
        this.custCreateTime = custCreateTime;
        this.custUpdateTime = custUpdateTime;
        this.custProfile = custProfile;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustPwd() {
        return custPwd;
    }

    public void setCustPwd(String custPwd) {
        this.custPwd = custPwd;
    }

    public Integer getCustAge() {
        return custAge;
    }

    public void setCustAge(Integer custAge) {
        this.custAge = custAge;
    }

    public Long getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(Long custPhone) {
        this.custPhone = custPhone;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public Date getCustCreateTime() {
        return custCreateTime;
    }

    public void setCustCreateTime(Date custCreateTime) {
        this.custCreateTime = custCreateTime;
    }

    public Date getCustUpdateTime() {
        return custUpdateTime;
    }

    public void setCustUpdateTime(Date custUpdateTime) {
        this.custUpdateTime = custUpdateTime;
    }

    public String getCustProfile() {
        return custProfile;
    }

    public void setCustProfile(String custProfile) {
        this.custProfile = custProfile;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId='" + custId + '\'' +
                ", custName='" + custName + '\'' +
                ", custPwd='" + custPwd + '\'' +
                ", custAge=" + custAge +
                ", custPhone=" + custPhone +
                ", custEmail='" + custEmail + '\'' +
                ", custCreateTime=" + custCreateTime +
                ", custUpdateTime=" + custUpdateTime +
                ", custProfile='" + custProfile + '\'' +
                '}';
    }
}
