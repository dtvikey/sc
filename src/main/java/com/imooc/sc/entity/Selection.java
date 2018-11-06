package com.imooc.sc.entity;

import java.util.Date;

/**
 * @Author: dtvikey
 * @Date: 18-11-6 上午11:07
 * @Version 1.0
 */
public class Selection {

    private int sid;
    private int cid;
    private Date selTime;
    private int score;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public Date getSelTime() {
        return selTime;
    }

    public void setSelTime(Date selTime) {
        this.selTime = selTime;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
