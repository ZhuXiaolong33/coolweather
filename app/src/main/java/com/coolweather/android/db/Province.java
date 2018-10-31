package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {


    private int id;
    private String provinceName;
    private int provoinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvoinceCode() {
        return provoinceCode;
    }

    public void setProvoinceCode(int provoinceCode) {
        this.provoinceCode = provoinceCode;
    }

}
