package com.a8.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ericliu on 2017/9/10.
 */

public class Provice extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getProvinceName(){
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProviceCode(){
        return provinceCode;
    }

    public void setProviceCode(int proviceCode){
        this.provinceCode = provinceCode;

    }

}
