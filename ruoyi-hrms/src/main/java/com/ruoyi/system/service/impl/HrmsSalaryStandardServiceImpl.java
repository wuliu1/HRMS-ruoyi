package com.ruoyi.system.service.impl;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

import com.ruoyi.common.utils.DateUtils;
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
        String ID = "HRMS2022";
        if(StringUtils.isEmpty(hrmsSalaryStandard.getID())){
            String id = UUID.randomUUID().toString().replace("-", "").hashCode()+"";
            hrmsSalaryStandard.setID(ID + id);
        }
        if (StringUtils.isEmpty(hrmsSalaryStandard.getCreatedTime().toString())){
            String date = DateUtils.getDate();
            hrmsSalaryStandard.setCreatedTime(date);
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
        List<HrmsSalaryStandard> list = hrmsSalaryStandardMapper.querySalaryPay();
        Map<String, List<HrmsSalaryStandard>> listMap = list.stream().collect(Collectors.groupingBy(HrmsSalaryStandard::getThreeJjgou));
        list.clear();
        int i = 0;
        for (String s : listMap.keySet()) {
            ++i;
            HrmsSalaryStandard standard = new HrmsSalaryStandard();
            List<HrmsSalaryStandard> standardList = listMap.get(s);
            int number = 0;
            String oneJjgou = "";
            String twoJjgou = "";
            String threeJjgou = "";
            String index = "XCFFD20220123";
            StringBuilder id = new StringBuilder();
            double totalAmount = 0;
            for (HrmsSalaryStandard hrmsSalaryStandard : standardList) {
                if (hrmsSalaryStandard.getTotalAmount() == null){
                    totalAmount += 0.00D;
                }else {
                    totalAmount += hrmsSalaryStandard.getTotalAmount().doubleValue();
                }
                oneJjgou = hrmsSalaryStandard.getOneJjgou();
                twoJjgou = hrmsSalaryStandard.getTwoJjgou();
                threeJjgou = hrmsSalaryStandard.getThreeJjgou();
                id.append(",").append(hrmsSalaryStandard.getID());
                ++number;
            }
            standard.setNumber(number);
            standard.setOneJjgou(oneJjgou);
            standard.setTwoJjgou(twoJjgou);
            standard.setThreeJjgou(threeJjgou);
            standard.setTotalAmount(BigDecimal.valueOf(totalAmount));
            standard.setID(id.toString());
            standard.setIndex(index+i);
            list.add(standard);
        }
        return list;
    }

    @Override
    public List<HrmsSalaryStandard> querySalaryPayDetail(String param) {
        if (param == null) {
            return new ArrayList<HrmsSalaryStandard>();
        }
        String[] ids = param.split(",");
        List<HrmsSalaryStandard> standardList = hrmsSalaryStandardMapper.querySalaryPayDetail(ids);
        return standardList;
    }

    @Override
    public List<HrmsSalaryStandard> querySalaryNameList() {
        List<HrmsSalaryStandard> standardList = hrmsSalaryStandardMapper.querySalaryNameList();
        return null;
    }
}
