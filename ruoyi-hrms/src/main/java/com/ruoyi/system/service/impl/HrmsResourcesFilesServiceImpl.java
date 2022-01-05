package com.ruoyi.system.service.impl;

import java.util.List;
import java.util.UUID;

import com.ruoyi.common.core.domain.entity.SysDept;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.system.service.ISysDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.HrmsResourcesFilesMapper;
import com.ruoyi.system.domain.HrmsResourcesFiles;
import com.ruoyi.system.service.IHrmsResourcesFilesService;
import com.ruoyi.common.core.text.Convert;

/**
 * 人力资源档案Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-01-03
 */
@Service
public class HrmsResourcesFilesServiceImpl implements IHrmsResourcesFilesService 
{
    @Autowired
    private HrmsResourcesFilesMapper hrmsResourcesFilesMapper;

    @Autowired
    private ISysDeptService deptService;

    /**
     * 查询人力资源档案
     * 
     * @param ID 人力资源档案主键
     * @return 人力资源档案
     */
    @Override
    public HrmsResourcesFiles selectHrmsResourcesFilesByID(String ID)
    {
        return hrmsResourcesFilesMapper.selectHrmsResourcesFilesByID(ID);
    }

    /**
     * 查询人力资源档案列表
     * 
     * @param hrmsResourcesFiles 人力资源档案
     * @return 人力资源档案
     */
    @Override
    public List<HrmsResourcesFiles> selectHrmsResourcesFilesList(HrmsResourcesFiles hrmsResourcesFiles)
    {
        hrmsResourcesFiles.setOneJjgou(getJjgou(hrmsResourcesFiles.getOneJjgou()));
        hrmsResourcesFiles.setTwoJjgou(getJjgou(hrmsResourcesFiles.getTwoJjgou()));
        hrmsResourcesFiles.setThreeJjgou(getJjgou(hrmsResourcesFiles.getThreeJjgou()));
        return hrmsResourcesFilesMapper.selectHrmsResourcesFilesList(hrmsResourcesFiles);
    }

    /**
     * 新增人力资源档案
     * 
     * @param hrmsResourcesFiles 人力资源档案
     * @return 结果
     */
    @Override
    public int insertHrmsResourcesFiles(HrmsResourcesFiles hrmsResourcesFiles)
    {
        String ID = "HRMS2022";
        if(StringUtils.isEmpty(hrmsResourcesFiles.getID())){
            String id = UUID.randomUUID().toString().hashCode()+"";
            hrmsResourcesFiles.setID(ID + id);
        }
        if (StringUtils.isEmpty(hrmsResourcesFiles.getCreatedTime())){
            hrmsResourcesFiles.setCreatedTime(DateUtils.getDate());
        }
        hrmsResourcesFiles.setOneJjgou(getJjgou(hrmsResourcesFiles.getOneJjgou()));
        hrmsResourcesFiles.setTwoJjgou(getJjgou(hrmsResourcesFiles.getTwoJjgou()));
        hrmsResourcesFiles.setThreeJjgou(getJjgou(hrmsResourcesFiles.getThreeJjgou()));
        return hrmsResourcesFilesMapper.insertHrmsResourcesFiles(hrmsResourcesFiles);
    }

    private String getJjgou(String id){
        if (StringUtils.isEmpty(id)){
            return null;
        }
        SysDept sysDept = deptService.selectDeptById(Long.parseLong(id));
        if (sysDept == null){
            return null;
        }
        return sysDept.getDeptName();
    }

    /**
     * 修改人力资源档案
     * 
     * @param hrmsResourcesFiles 人力资源档案
     * @return 结果
     */
    @Override
    public int updateHrmsResourcesFiles(HrmsResourcesFiles hrmsResourcesFiles)
    {
        return hrmsResourcesFilesMapper.updateHrmsResourcesFiles(hrmsResourcesFiles);
    }

    /**
     * 批量删除人力资源档案
     * 
     * @param IDs 需要删除的人力资源档案主键
     * @return 结果
     */
    @Override
    public int deleteHrmsResourcesFilesByIDs(String IDs)
    {
        return hrmsResourcesFilesMapper.deleteHrmsResourcesFilesByIDs(Convert.toStrArray(IDs));
    }

    /**
     * 删除人力资源档案信息
     * 
     * @param ID 人力资源档案主键
     * @return 结果
     */
    @Override
    public int deleteHrmsResourcesFilesByID(String ID)
    {
        return hrmsResourcesFilesMapper.deleteHrmsResourcesFilesByID(ID);
    }
}
