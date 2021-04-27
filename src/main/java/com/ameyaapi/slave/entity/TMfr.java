package com.ameyaapi.slave.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @auther huang
 * @create 2021-04-27 11:06:38
 * @describe 实体类
 */
@TableName("t_mfr")
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "TMfr对象", description = "")
public class TMfr implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.UUID)
    private String id;

    @TableField("imagepath")
    private String imagepath;

    @TableField("inital")
    private String inital;

    @TableField("mfrfullname")
    private String mfrfullname;

    @TableField("urlname")
    private String urlname;

    @TableField("mfrabbr")
    private String mfrabbr;

    @TableField("mfrparent")
    private String mfrparent;

    @TableField("supplierdesc")
    private String supplierdesc;

    @TableField("mfrdetail")
    private String mfrdetail;

    @TableField("mfrurl")
    private String mfrurl;

    @TableField("mpncount")
    private Integer mpncount;

    @TableField("isnable")
    private Integer isnable;

    @TableField("supplidetail")
    private String supplidetail;

    @TableField("othername")
    private String othername;

    @TableField("supplidetail_cn")
    private String supplidetailCn;


    public String getId() {
        return id;
    }

    public TMfr setId(String id) {
        this.id = id;
        return this;
    }

    public String getImagepath() {
        return imagepath;
    }

    public TMfr setImagepath(String imagepath) {
        this.imagepath = imagepath;
        return this;
    }

    public String getInital() {
        return inital;
    }

    public TMfr setInital(String inital) {
        this.inital = inital;
        return this;
    }

    public String getMfrfullname() {
        return mfrfullname;
    }

    public TMfr setMfrfullname(String mfrfullname) {
        this.mfrfullname = mfrfullname;
        return this;
    }

    public String getUrlname() {
        return urlname;
    }

    public TMfr setUrlname(String urlname) {
        this.urlname = urlname;
        return this;
    }

    public String getMfrabbr() {
        return mfrabbr;
    }

    public TMfr setMfrabbr(String mfrabbr) {
        this.mfrabbr = mfrabbr;
        return this;
    }

    public String getMfrparent() {
        return mfrparent;
    }

    public TMfr setMfrparent(String mfrparent) {
        this.mfrparent = mfrparent;
        return this;
    }

    public String getSupplierdesc() {
        return supplierdesc;
    }

    public TMfr setSupplierdesc(String supplierdesc) {
        this.supplierdesc = supplierdesc;
        return this;
    }

    public String getMfrdetail() {
        return mfrdetail;
    }

    public TMfr setMfrdetail(String mfrdetail) {
        this.mfrdetail = mfrdetail;
        return this;
    }

    public String getMfrurl() {
        return mfrurl;
    }

    public TMfr setMfrurl(String mfrurl) {
        this.mfrurl = mfrurl;
        return this;
    }

    public Integer getMpncount() {
        return mpncount;
    }

    public TMfr setMpncount(Integer mpncount) {
        this.mpncount = mpncount;
        return this;
    }

    public Integer getIsnable() {
        return isnable;
    }

    public TMfr setIsnable(Integer isnable) {
        this.isnable = isnable;
        return this;
    }

    public String getSupplidetail() {
        return supplidetail;
    }

    public TMfr setSupplidetail(String supplidetail) {
        this.supplidetail = supplidetail;
        return this;
    }

    public String getOthername() {
        return othername;
    }

    public TMfr setOthername(String othername) {
        this.othername = othername;
        return this;
    }

    public String getSupplidetailCn() {
        return supplidetailCn;
    }

    public TMfr setSupplidetailCn(String supplidetailCn) {
        this.supplidetailCn = supplidetailCn;
        return this;
    }

    @Override
    public String toString() {
        return "TMfr{" +
                "id=" + id +
                ", imagepath=" + imagepath +
                ", inital=" + inital +
                ", mfrfullname=" + mfrfullname +
                ", urlname=" + urlname +
                ", mfrabbr=" + mfrabbr +
                ", mfrparent=" + mfrparent +
                ", supplierdesc=" + supplierdesc +
                ", mfrdetail=" + mfrdetail +
                ", mfrurl=" + mfrurl +
                ", mpncount=" + mpncount +
                ", isnable=" + isnable +
                ", supplidetail=" + supplidetail +
                ", othername=" + othername +
                ", supplidetailCn=" + supplidetailCn +
                "}";
    }
}
