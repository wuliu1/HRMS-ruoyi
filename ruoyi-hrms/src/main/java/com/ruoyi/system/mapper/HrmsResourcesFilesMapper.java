package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.HrmsResourcesFiles;

/**
 * 人力资源档案Mapper接口
 * 
 * @author ruoyi
 * @date 2022-01-03
 */
public interface HrmsResourcesFilesMapper 
{
    /**
     * 查询人力资源档案
     * 
     * @param ID 人力资源档案主键
     * @return 人力资源档案
     */
    public HrmsResourcesFiles selectHrmsResourcesFilesByID(String ID);

    /**
     * 查询人力资源档案列表
     * 
     * @param hrmsResourcesFiles 人力资源档案
     * @return 人力资源档案集合
     */
    public List<HrmsResourcesFiles> selectHrmsResourcesFilesList(HrmsResourcesFiles hrmsResourcesFiles);

    /**
     * 新增人力资源档案
     * 
     * @param hrmsResourcesFiles 人力资源档案
     * @return 结果
     */
    public int insertHrmsResourcesFiles(HrmsResourcesFiles hrmsResourcesFiles);

    /**
     * 修改人力资源档案
     * 
     * @param hrmsResourcesFiles 人力资源档案
     * @return 结果
     */
    public int updateHrmsResourcesFiles(HrmsResourcesFiles hrmsResourcesFiles);

    /**
     * 删除人力资源档案
     * 
     * @param ID 人力资源档案主键
     * @return 结果
     */
    public int deleteHrmsResourcesFilesByID(String ID);

    /**
     * 批量删除人力资源档案
     * 
     * @param IDs 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHrmsResourcesFilesByIDs(String[] IDs);
}
