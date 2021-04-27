package com.ameyaapi.base.entity;

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
 * @create 2021-04-27 11:05:01
 * @describe 实体类
 */
@TableName("t_product")
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value="TProduct对象", description="")
public class TProduct implements Serializable {

private static final long serialVersionUID = 1L;

        @ApiModelProperty(value = "主键id")
                    @TableId(value = "objectid", type = IdType.UUID)
                private String objectid;

        @ApiModelProperty(value = "产品类别ID")
    @TableField("categoryid")
        private String categoryid;

        @ApiModelProperty(value = "分类名字")
    @TableField("categoryname")
        private String categoryname;

        @ApiModelProperty(value = "品牌id")
    @TableField("mfgid")
        private String mfgid;

        @ApiModelProperty(value = "品牌名字")
    @TableField("mfgname")
        private String mfgname;

        @ApiModelProperty(value = "产品对应的唯一的编号")
    @TableField("partnum")
        private Integer partnum;

        @ApiModelProperty(value = "型号")
    @TableField("mpn")
        private String mpn;

        @ApiModelProperty(value = "产品描述")
    @TableField("descript")
        private String descript;

        @ApiModelProperty(value = "产品介绍详细信息")
    @TableField("productintroduction")
        private String productintroduction;

        @ApiModelProperty(value = "产品宣传词")
    @TableField("publicitywords")
        private String publicitywords;

        @ApiModelProperty(value = "seo关键字")
    @TableField("seokeyword")
        private String seokeyword;

        @ApiModelProperty(value = "产品是否上架")
    @TableField("isshelves")
        private String isshelves;

        @ApiModelProperty(value = "产品状态ID")
    @TableField("productstate_id")
        private String productstateId;

        @ApiModelProperty(value = "更新日期需要")
    @TableField("obligate1")
        private String obligate1;

    @TableField("obligate2")
        private String obligate2;

    @TableField("obligate3")
        private String obligate3;

    @TableField("obligate4")
        private String obligate4;

        @ApiModelProperty(value = "来自哪个域名")
    @TableField("domain")
        private String domain;

        @ApiModelProperty(value = "标准包装数量")
    @TableField("spq")
        private Integer spq;

    @TableField("descript_cn")
        private String descriptCn;

    @TableField("cpn")
        private String cpn;


    public String getObjectid() {
            return objectid;
            }

        public TProduct setObjectid(String objectid) {
            this.objectid = objectid;
                return this;
            }

    public String getCategoryid() {
            return categoryid;
            }

        public TProduct setCategoryid(String categoryid) {
            this.categoryid = categoryid;
                return this;
            }

    public String getCategoryname() {
            return categoryname;
            }

        public TProduct setCategoryname(String categoryname) {
            this.categoryname = categoryname;
                return this;
            }

    public String getMfgid() {
            return mfgid;
            }

        public TProduct setMfgid(String mfgid) {
            this.mfgid = mfgid;
                return this;
            }

    public String getMfgname() {
            return mfgname;
            }

        public TProduct setMfgname(String mfgname) {
            this.mfgname = mfgname;
                return this;
            }

    public Integer getPartnum() {
            return partnum;
            }

        public TProduct setPartnum(Integer partnum) {
            this.partnum = partnum;
                return this;
            }

    public String getMpn() {
            return mpn;
            }

        public TProduct setMpn(String mpn) {
            this.mpn = mpn;
                return this;
            }

    public String getDescript() {
            return descript;
            }

        public TProduct setDescript(String descript) {
            this.descript = descript;
                return this;
            }

    public String getProductintroduction() {
            return productintroduction;
            }

        public TProduct setProductintroduction(String productintroduction) {
            this.productintroduction = productintroduction;
                return this;
            }

    public String getPublicitywords() {
            return publicitywords;
            }

        public TProduct setPublicitywords(String publicitywords) {
            this.publicitywords = publicitywords;
                return this;
            }

    public String getSeokeyword() {
            return seokeyword;
            }

        public TProduct setSeokeyword(String seokeyword) {
            this.seokeyword = seokeyword;
                return this;
            }

    public String getIsshelves() {
            return isshelves;
            }

        public TProduct setIsshelves(String isshelves) {
            this.isshelves = isshelves;
                return this;
            }

    public String getProductstateId() {
            return productstateId;
            }

        public TProduct setProductstateId(String productstateId) {
            this.productstateId = productstateId;
                return this;
            }

    public String getObligate1() {
            return obligate1;
            }

        public TProduct setObligate1(String obligate1) {
            this.obligate1 = obligate1;
                return this;
            }

    public String getObligate2() {
            return obligate2;
            }

        public TProduct setObligate2(String obligate2) {
            this.obligate2 = obligate2;
                return this;
            }

    public String getObligate3() {
            return obligate3;
            }

        public TProduct setObligate3(String obligate3) {
            this.obligate3 = obligate3;
                return this;
            }

    public String getObligate4() {
            return obligate4;
            }

        public TProduct setObligate4(String obligate4) {
            this.obligate4 = obligate4;
                return this;
            }

    public String getDomain() {
            return domain;
            }

        public TProduct setDomain(String domain) {
            this.domain = domain;
                return this;
            }

    public Integer getSpq() {
            return spq;
            }

        public TProduct setSpq(Integer spq) {
            this.spq = spq;
                return this;
            }

    public String getDescriptCn() {
            return descriptCn;
            }

        public TProduct setDescriptCn(String descriptCn) {
            this.descriptCn = descriptCn;
                return this;
            }

    public String getCpn() {
            return cpn;
            }

        public TProduct setCpn(String cpn) {
            this.cpn = cpn;
                return this;
            }

@Override
public String toString() {
        return "TProduct{" +
                "objectid=" + objectid +
                ", categoryid=" + categoryid +
                ", categoryname=" + categoryname +
                ", mfgid=" + mfgid +
                ", mfgname=" + mfgname +
                ", partnum=" + partnum +
                ", mpn=" + mpn +
                ", descript=" + descript +
                ", productintroduction=" + productintroduction +
                ", publicitywords=" + publicitywords +
                ", seokeyword=" + seokeyword +
                ", isshelves=" + isshelves +
                ", productstateId=" + productstateId +
                ", obligate1=" + obligate1 +
                ", obligate2=" + obligate2 +
                ", obligate3=" + obligate3 +
                ", obligate4=" + obligate4 +
                ", domain=" + domain +
                ", spq=" + spq +
                ", descriptCn=" + descriptCn +
                ", cpn=" + cpn +
        "}";
        }
        }
