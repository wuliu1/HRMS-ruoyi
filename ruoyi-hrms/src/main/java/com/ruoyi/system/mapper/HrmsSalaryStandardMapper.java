package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.HrmsSalaryStandard;

/**
 * 薪酬标准Mapper接口
 * 
 * @author ruoyi
 * @date 2022-01-03
 */
public interface HrmsSalaryStandardMapper 
{
    /**
     * 查询薪酬标准
     * 
     * @param ID 薪酬标准主键
     * @return 薪酬标准
     */
    public HrmsSalaryStandard selectHrmsSalaryStandardByID(String ID);

    /**
     * 查询薪酬标准列表
     * 
     * @param hrmsSalaryStandard 薪酬标准
     * @return 薪酬标准集合
     */
    public List<HrmsSalaryStandard> selectHrmsSalaryStandardList(HrmsSalaryStandard hrmsSalaryStandard);

    /**
     * 新增薪酬标准
     * 
     * @param hrmsSalaryStandard 薪酬标准
     * @return 结果
     */
    public int insertHrmsSalaryStandard(HrmsSalaryStandard hrmsSalaryStandard);

    /**
     * 修改薪酬标准
     * 
     * @param hrmsSalaryStandard 薪酬标准
     * @return 结果
     */
    public int updateHrmsSalaryStandard(HrmsSalaryStandard hrmsSalaryStandard);

    /**
     * 删除薪酬标准
     * 
     * @param ID 薪酬标准主键
     * @return 结果
     */
    public int deleteHrmsSalaryStandardByID(String ID);

    /**
     * 批量删除薪酬标准
     * 
     * @param IDs 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHrmsSalaryStandardByIDs(String[] IDs);


    List<HrmsSalaryStandard> querySalaryPay();

    List<HrmsSalaryStandard> querySalaryPayDetail(String[] IDs);
}
