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
 * @create 2021-04-27 11:08:08
 * @describe 实体类
 */
@TableName("t_mfr_alias")
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "TMfrAlias对象", description = "")
public class TMfrAlias implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.UUID)
    private String id;

    @TableField("mfrname")
    private String mfrname;

    @TableField("lowername")
    private String lowername;

    @TableField("standard_id")
    private String standardId;


    public String getId() {
        return id;
    }

    public TMfrAlias setId(String id) {
        this.id = id;
        return this;
    }

    public String getMfrname() {
        return mfrname;
    }

    public TMfrAlias setMfrname(String mfrname) {
        this.mfrname = mfrname;
        return this;
    }

    public String getLowername() {
        return lowername;
    }

    public TMfrAlias setLowername(String lowername) {
        this.lowername = lowername;
        return this;
    }

    public String getStandardId() {
        return standardId;
    }

    public TMfrAlias setStandardId(String standardId) {
        this.standardId = standardId;
        return this;
    }

    @Override
    public String toString() {
        return "TMfrAlias{" +
                "id=" + id +
                ", mfrname=" + mfrname +
                ", lowername=" + lowername +
                ", standardId=" + standardId +
                "}";
    }
}
