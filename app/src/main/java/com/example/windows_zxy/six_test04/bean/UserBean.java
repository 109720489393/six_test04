package com.example.windows_zxy.six_test04.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class UserBean {
    @Id(autoincrement = true)
    @Unique
    private Long uid;
    private String name;
    private String sex;
    private int age;
    @Generated(hash = 1255776615)
    public UserBean(Long uid, String name, String sex, int age) {
        this.uid = uid;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    @Generated(hash = 1203313951)
    public UserBean() {
    }
    public Long getUid() {
        return this.uid;
    }
    public void setUid(Long uid) {
        this.uid = uid;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return this.sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
