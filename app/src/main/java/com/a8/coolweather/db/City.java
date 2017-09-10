package com.a8.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ericliu on 2017/9/10.
 */

public class City extends DataSupport {
    private int id;
    private int cityCode;
    private String cityName;
    private int provinceId;

    public int getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public  String getCityName(){
        return cityName;
    }

    public String setCityName(String cityName){
        return cityName;
    }


    public int getCityCode(){
        return cityCode;
    }

    public void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }

    public int getProvinceId (){
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
