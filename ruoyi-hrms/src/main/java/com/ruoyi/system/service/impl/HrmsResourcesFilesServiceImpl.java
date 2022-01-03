package com.ruoyi.system.service.impl;

import java.util.List;
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
        return hrmsResourcesFilesMapper.insertHrmsResourcesFiles(hrmsResourcesFiles);
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
