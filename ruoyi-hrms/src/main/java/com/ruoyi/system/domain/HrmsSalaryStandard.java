package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 薪酬标准对象 hrms_salary_standard
 * 
 * @author ruoyi
 * @date 2022-01-03
 */
public class HrmsSalaryStandard extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 薪酬标准编号 */
    private String ID;

    /** 薪酬标准名称 */
    @Excel(name = "薪酬标准名称")
    private String NAME;

    /** 基本工资 */
    @Excel(name = "基本工资")
    private BigDecimal JBGZ;

    /** 交通补助 */
    @Excel(name = "交通补助")
    private BigDecimal JTBZ;

    /** 午餐补助 */
    @Excel(name = "午餐补助")
    private BigDecimal WCBZ;

    /** 通讯补助 */
    @Excel(name = "通讯补助")
    private BigDecimal TXBZ;

    /** 养老保险 */
    @Excel(name = "养老保险")
    private BigDecimal YLAOBX;

    /** 失业保险 */
    @Excel(name = "失业保险")
    private BigDecimal SYBX;

    /** 医疗保险 */
    @Excel(name = "医疗保险")
    private BigDecimal YLIAOBX;

    /** 住房公积金 */
    @Excel(name = "住房公积金")
    private BigDecimal ZFGJJ;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createdBy;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdTime;

    /** 更新人 */
    @Excel(name = "更新人")
    private String updatedBy;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updatedTime;

    public void setID(String ID) 
    {
        this.ID = ID;
    }

    public String getID() 
    {
        return ID;
    }
    public void setNAME(String NAME) 
    {
        this.NAME = NAME;
    }

    public String getNAME() 
    {
        return NAME;
    }
    public void setJBGZ(BigDecimal JBGZ) 
    {
        this.JBGZ = JBGZ;
    }

    public BigDecimal getJBGZ() 
    {
        return JBGZ;
    }
    public void setJTBZ(BigDecimal JTBZ) 
    {
        this.JTBZ = JTBZ;
    }

    public BigDecimal getJTBZ() 
    {
        return JTBZ;
    }
    public void setWCBZ(BigDecimal WCBZ) 
    {
        this.WCBZ = WCBZ;
    }

    public BigDecimal getWCBZ() 
    {
        return WCBZ;
    }
    public void setTXBZ(BigDecimal TXBZ) 
    {
        this.TXBZ = TXBZ;
    }

    public BigDecimal getTXBZ() 
    {
        return TXBZ;
    }
    public void setYLAOBX(BigDecimal YLAOBX) 
    {
        this.YLAOBX = YLAOBX;
    }

    public BigDecimal getYLAOBX() 
    {
        return YLAOBX;
    }
    public void setSYBX(BigDecimal SYBX) 
    {
        this.SYBX = SYBX;
    }

    public BigDecimal getSYBX() 
    {
        return SYBX;
    }
    public void setYLIAOBX(BigDecimal YLIAOBX) 
    {
        this.YLIAOBX = YLIAOBX;
    }

    public BigDecimal getYLIAOBX() 
    {
        return YLIAOBX;
    }
    public void setZFGJJ(BigDecimal ZFGJJ) 
    {
        this.ZFGJJ = ZFGJJ;
    }

    public BigDecimal getZFGJJ() 
    {
        return ZFGJJ;
    }
    public void setCreatedBy(String createdBy) 
    {
        this.createdBy = createdBy;
    }

    public String getCreatedBy() 
    {
        return createdBy;
    }
    public void setCreatedTime(Date createdTime) 
    {
        this.createdTime = createdTime;
    }

    public Date getCreatedTime() 
    {
        return createdTime;
    }
    public void setUpdatedBy(String updatedBy) 
    {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedBy() 
    {
        return updatedBy;
    }
    public void setUpdatedTime(Date updatedTime) 
    {
        this.updatedTime = updatedTime;
    }

    public Date getUpdatedTime() 
    {
        return updatedTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("ID", getID())
            .append("NAME", getNAME())
            .append("JBGZ", getJBGZ())
            .append("JTBZ", getJTBZ())
            .append("WCBZ", getWCBZ())
            .append("TXBZ", getTXBZ())
            .append("YLAOBX", getYLAOBX())
            .append("SYBX", getSYBX())
            .append("YLIAOBX", getYLIAOBX())
            .append("ZFGJJ", getZFGJJ())
            .append("createdBy", getCreatedBy())
            .append("createdTime", getCreatedTime())
            .append("updatedBy", getUpdatedBy())
            .append("updatedTime", getUpdatedTime())
            .toString();
    }
}
