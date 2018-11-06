package com.imooc.sc.entity;

import java.util.Date;

/**
 * @Author: dtvikey
 * @Date: 18-11-6 上午10:37
 * @Version 1.0
 */
public class Student {

    private int id;
    private String name;
    private String sex;
    private Date born;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", born=" + born +
                '}';
    }
}
