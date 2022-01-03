package com.ruoyi.system.service.impl;

import java.util.List;
import java.util.UUID;

import com.ruoyi.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.HrmsSalaryStandardMapper;
import com.ruoyi.system.domain.HrmsSalaryStandard;
import com.ruoyi.system.service.IHrmsSalaryStandardService;
import com.ruoyi.common.core.text.Convert;

/**
 * 薪酬标准Service业务层处理
 *
 * @author ruoyi
 * @date 2022-01-03
 */
@Service
public class HrmsSalaryStandardServiceImpl implements IHrmsSalaryStandardService
{
    @Autowired
    private HrmsSalaryStandardMapper hrmsSalaryStandardMapper;

    /**
     * 查询薪酬标准
     *
     * @param ID 薪酬标准主键
     * @return 薪酬标准
     */
    @Override
    public HrmsSalaryStandard selectHrmsSalaryStandardByID(String ID)
    {
        return hrmsSalaryStandardMapper.selectHrmsSalaryStandardByID(ID);
    }

    /**
     * 查询薪酬标准列表
     *
     * @param hrmsSalaryStandard 薪酬标准
     * @return 薪酬标准
     */
    @Override
    public List<HrmsSalaryStandard> selectHrmsSalaryStandardList(HrmsSalaryStandard hrmsSalaryStandard)
    {
        return hrmsSalaryStandardMapper.selectHrmsSalaryStandardList(hrmsSalaryStandard);
    }

    /**
     * 新增薪酬标准
     *
     * @param hrmsSalaryStandard 薪酬标准
     * @return 结果
     */
    @Override
    public int insertHrmsSalaryStandard(HrmsSalaryStandard hrmsSalaryStandard)
    {
        if(StringUtils.isEmpty(hrmsSalaryStandard.getID())){
            String id = UUID.randomUUID().toString().replace("-", "");
            hrmsSalaryStandard.setID(id);
        }
        return hrmsSalaryStandardMapper.insertHrmsSalaryStandard(hrmsSalaryStandard);
    }

    /**
     * 修改薪酬标准
     *
     * @param hrmsSalaryStandard 薪酬标准
     * @return 结果
     */
    @Override
    public int updateHrmsSalaryStandard(HrmsSalaryStandard hrmsSalaryStandard)
    {
        return hrmsSalaryStandardMapper.updateHrmsSalaryStandard(hrmsSalaryStandard);
    }

    /**
     * 批量删除薪酬标准
     *
     * @param IDs 需要删除的薪酬标准主键
     * @return 结果
     */
    @Override
    public int deleteHrmsSalaryStandardByIDs(String IDs)
    {
        return hrmsSalaryStandardMapper.deleteHrmsSalaryStandardByIDs(Convert.toStrArray(IDs));
    }

    /**
     * 删除薪酬标准信息
     *
     * @param ID 薪酬标准主键
     * @return 结果
     */
    @Override
    public int deleteHrmsSalaryStandardByID(String ID)
    {
        return hrmsSalaryStandardMapper.deleteHrmsSalaryStandardByID(ID);
    }

    @Override
    public List<HrmsSalaryStandard> querySalaryPay() {
        return null;
    }

    @Override
    public List<HrmsSalaryStandard> querySalaryPayDetail(String param) {
        return null;
    }
}
