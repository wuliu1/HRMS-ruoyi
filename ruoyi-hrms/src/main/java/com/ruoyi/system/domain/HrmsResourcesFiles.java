package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 人力资源档案对象 hrms_resources_files
 * 
 * @author ruoyi
 * @date 2022-01-03
 */
public class HrmsResourcesFiles extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private String ID;

    /** 一级机构 */
    @Excel(name = "一级机构")
    private String oneJjgou;

    /** 二级机构 */
    @Excel(name = "二级机构")
    private String twoJjgou;

    /** 三级机构 */
    @Excel(name = "三级机构")
    private String threeJjgou;

    /** 职位分类 */
    @Excel(name = "职位分类")
    private String ZWFL;

    /** 职位名称 */
    @Excel(name = "职位名称")
    private String ZWMC;

    /** 职称 */
    @Excel(name = "职称")
    private String ZC;

    /** 姓名 */
    @Excel(name = "姓名")
    private String NAME;

    /** 性别 */
    @Excel(name = "性别")
    private String SEX;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String EMAIL;

    /** 电话 */
    @Excel(name = "电话")
    private String PHONE;

    /** qq号 */
    @Excel(name = "qq号")
    private String QQ;

    /** 手机 */
    @Excel(name = "手机")
    private String mobilePhone;

    /** 地址 */
    @Excel(name = "地址")
    private String ADDRESS;

    /** 邮编 */
    @Excel(name = "邮编")
    private String POSTCODE;

    /** 国籍 */
    @Excel(name = "国籍")
    private String NATIONALITY;

    /** 出生地 */
    @Excel(name = "出生地")
    private String birthPlace;

    /** 生日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "生日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date BIRTHDAY;

    /** 民族 */
    @Excel(name = "民族")
    private String NATION;

    /** 宗教信仰 */
    @Excel(name = "宗教信仰")
    private String RELIGIOUS;

    /** 政治面貌 */
    @Excel(name = "政治面貌")
    private String POLITICAL;

    /** 身份证号码 */
    @Excel(name = "身份证号码")
    private String idNumber;

    /** 社会保障码 */
    @Excel(name = "社会保障码")
    private String SHBZM;

    /** 年龄 */
    @Excel(name = "年龄")
    private Long AGE;

    /** 学历 */
    @Excel(name = "学历")
    private String EDUCATION;

    /** 教育年限 */
    @Excel(name = "教育年限")
    private String educationYear;

    /** 学历专业 */
    @Excel(name = "学历专业")
    private String PROFESSIONAL;

    /** 薪酬标准 */
    @Excel(name = "薪酬标准")
    private String salaryStandard;

    /** 开户行 */
    @Excel(name = "开户行")
    private String openBank;

    /** 账号 */
    @Excel(name = "账号")
    private String ACCOUNT;

    /** 特长 */
    @Excel(name = "特长")
    private String SPECIALITY;

    /** 爱好 */
    @Excel(name = "爱好")
    private String HOBBY;

    /** 个人履历 */
    @Excel(name = "个人履历")
    private String RESUME;

    /** 家庭情况信息 */
    @Excel(name = "家庭情况信息")
    private String familyData;

    /** 备注 */
    @Excel(name = "备注")
    private String COMMENT;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createdBy;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private String createdTime;

    /** 更新人 */
    @Excel(name = "更新人")
    private String updatedBy;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private String updatedTime;

    private String beginTime;
    private String endTime;

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setID(String ID)
    {
        this.ID = ID;
    }

    public String getID() 
    {
        return ID;
    }
    public void setOneJjgou(String oneJjgou) 
    {
        this.oneJjgou = oneJjgou;
    }

    public String getOneJjgou() 
    {
        return oneJjgou;
    }
    public void setTwoJjgou(String twoJjgou) 
    {
        this.twoJjgou = twoJjgou;
    }

    public String getTwoJjgou() 
    {
        return twoJjgou;
    }
    public void setThreeJjgou(String threeJjgou) 
    {
        this.threeJjgou = threeJjgou;
    }

    public String getThreeJjgou() 
    {
        return threeJjgou;
    }
    public void setZWFL(String ZWFL) 
    {
        this.ZWFL = ZWFL;
    }

    public String getZWFL() 
    {
        return ZWFL;
    }
    public void setZWMC(String ZWMC) 
    {
        this.ZWMC = ZWMC;
    }

    public String getZWMC() 
    {
        return ZWMC;
    }
    public void setZC(String ZC) 
    {
        this.ZC = ZC;
    }

    public String getZC() 
    {
        return ZC;
    }
    public void setNAME(String NAME) 
    {
        this.NAME = NAME;
    }

    public String getNAME() 
    {
        return NAME;
    }
    public void setSEX(String SEX) 
    {
        this.SEX = SEX;
    }

    public String getSEX() 
    {
        return SEX;
    }
    public void setEMAIL(String EMAIL) 
    {
        this.EMAIL = EMAIL;
    }

    public String getEMAIL() 
    {
        return EMAIL;
    }
    public void setPHONE(String PHONE) 
    {
        this.PHONE = PHONE;
    }

    public String getPHONE() 
    {
        return PHONE;
    }
    public void setQQ(String QQ) 
    {
        this.QQ = QQ;
    }

    public String getQQ() 
    {
        return QQ;
    }
    public void setMobilePhone(String mobilePhone) 
    {
        this.mobilePhone = mobilePhone;
    }

    public String getMobilePhone() 
    {
        return mobilePhone;
    }
    public void setADDRESS(String ADDRESS) 
    {
        this.ADDRESS = ADDRESS;
    }

    public String getADDRESS() 
    {
        return ADDRESS;
    }
    public void setPOSTCODE(String POSTCODE) 
    {
        this.POSTCODE = POSTCODE;
    }

    public String getPOSTCODE() 
    {
        return POSTCODE;
    }
    public void setNATIONALITY(String NATIONALITY) 
    {
        this.NATIONALITY = NATIONALITY;
    }

    public String getNATIONALITY() 
    {
        return NATIONALITY;
    }
    public void setBirthPlace(String birthPlace) 
    {
        this.birthPlace = birthPlace;
    }

    public String getBirthPlace() 
    {
        return birthPlace;
    }
    public void setBIRTHDAY(Date BIRTHDAY) 
    {
        this.BIRTHDAY = BIRTHDAY;
    }

    public Date getBIRTHDAY() 
    {
        return BIRTHDAY;
    }
    public void setNATION(String NATION) 
    {
        this.NATION = NATION;
    }

    public String getNATION() 
    {
        return NATION;
    }
    public void setRELIGIOUS(String RELIGIOUS) 
    {
        this.RELIGIOUS = RELIGIOUS;
    }

    public String getRELIGIOUS() 
    {
        return RELIGIOUS;
    }
    public void setPOLITICAL(String POLITICAL) 
    {
        this.POLITICAL = POLITICAL;
    }

    public String getPOLITICAL() 
    {
        return POLITICAL;
    }
    public void setIdNumber(String idNumber) 
    {
        this.idNumber = idNumber;
    }

    public String getIdNumber() 
    {
        return idNumber;
    }
    public void setSHBZM(String SHBZM) 
    {
        this.SHBZM = SHBZM;
    }

    public String getSHBZM() 
    {
        return SHBZM;
    }
    public void setAGE(Long AGE) 
    {
        this.AGE = AGE;
    }

    public Long getAGE() 
    {
        return AGE;
    }
    public void setEDUCATION(String EDUCATION) 
    {
        this.EDUCATION = EDUCATION;
    }

    public String getEDUCATION() 
    {
        return EDUCATION;
    }
    public void setEducationYear(String educationYear) 
    {
        this.educationYear = educationYear;
    }

    public String getEducationYear() 
    {
        return educationYear;
    }
    public void setPROFESSIONAL(String PROFESSIONAL) 
    {
        this.PROFESSIONAL = PROFESSIONAL;
    }

    public String getPROFESSIONAL() 
    {
        return PROFESSIONAL;
    }
    public void setSalaryStandard(String salaryStandard) 
    {
        this.salaryStandard = salaryStandard;
    }

    public String getSalaryStandard() 
    {
        return salaryStandard;
    }
    public void setOpenBank(String openBank) 
    {
        this.openBank = openBank;
    }

    public String getOpenBank() 
    {
        return openBank;
    }
    public void setACCOUNT(String ACCOUNT) 
    {
        this.ACCOUNT = ACCOUNT;
    }

    public String getACCOUNT() 
    {
        return ACCOUNT;
    }
    public void setSPECIALITY(String SPECIALITY) 
    {
        this.SPECIALITY = SPECIALITY;
    }

    public String getSPECIALITY() 
    {
        return SPECIALITY;
    }
    public void setHOBBY(String HOBBY) 
    {
        this.HOBBY = HOBBY;
    }

    public String getHOBBY() 
    {
        return HOBBY;
    }
    public void setRESUME(String RESUME) 
    {
        this.RESUME = RESUME;
    }

    public String getRESUME() 
    {
        return RESUME;
    }
    public void setFamilyData(String familyData) 
    {
        this.familyData = familyData;
    }

    public String getFamilyData() 
    {
        return familyData;
    }
    public void setCOMMENT(String COMMENT) 
    {
        this.COMMENT = COMMENT;
    }

    public String getCOMMENT() 
    {
        return COMMENT;
    }
    public void setCreatedBy(String createdBy) 
    {
        this.createdBy = createdBy;
    }

    public String getCreatedBy() 
    {
        return createdBy;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("ID", getID())
            .append("oneJjgou", getOneJjgou())
            .append("twoJjgou", getTwoJjgou())
            .append("threeJjgou", getThreeJjgou())
            .append("ZWFL", getZWFL())
            .append("ZWMC", getZWMC())
            .append("ZC", getZC())
            .append("NAME", getNAME())
            .append("SEX", getSEX())
            .append("EMAIL", getEMAIL())
            .append("PHONE", getPHONE())
            .append("QQ", getQQ())
            .append("mobilePhone", getMobilePhone())
            .append("ADDRESS", getADDRESS())
            .append("POSTCODE", getPOSTCODE())
            .append("NATIONALITY", getNATIONALITY())
            .append("birthPlace", getBirthPlace())
            .append("BIRTHDAY", getBIRTHDAY())
            .append("NATION", getNATION())
            .append("RELIGIOUS", getRELIGIOUS())
            .append("POLITICAL", getPOLITICAL())
            .append("idNumber", getIdNumber())
            .append("SHBZM", getSHBZM())
            .append("AGE", getAGE())
            .append("EDUCATION", getEDUCATION())
            .append("educationYear", getEducationYear())
            .append("PROFESSIONAL", getPROFESSIONAL())
            .append("salaryStandard", getSalaryStandard())
            .append("openBank", getOpenBank())
            .append("ACCOUNT", getACCOUNT())
            .append("SPECIALITY", getSPECIALITY())
            .append("HOBBY", getHOBBY())
            .append("RESUME", getRESUME())
            .append("familyData", getFamilyData())
            .append("COMMENT", getCOMMENT())
            .append("createdBy", getCreatedBy())
            .append("createdTime", getCreatedTime())
            .append("updatedBy", getUpdatedBy())
            .append("updatedTime", getUpdatedTime())
            .toString();
    }
}
