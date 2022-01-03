package com.ruoyi.system.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.HrmsResourcesFiles;
import com.ruoyi.system.service.IHrmsResourcesFilesService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 人力资源档案Controller
 * 
 * @author ruoyi
 * @date 2022-01-03
 */
@Controller
@RequestMapping("/system/files")
public class HrmsResourcesFilesController extends BaseController
{
    private String prefix = "system/files";

    @Autowired
    private IHrmsResourcesFilesService hrmsResourcesFilesService;

    @RequiresPermissions("system:files:view")
    @GetMapping()
    public String files()
    {
        return prefix + "/files";
    }

    /**
     * 查询人力资源档案列表
     */
    @RequiresPermissions("system:files:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(HrmsResourcesFiles hrmsResourcesFiles)
    {
        startPage();
        List<HrmsResourcesFiles> list = hrmsResourcesFilesService.selectHrmsResourcesFilesList(hrmsResourcesFiles);
        return getDataTable(list);
    }

    /**
     * 导出人力资源档案列表
     */
    @RequiresPermissions("system:files:export")
    @Log(title = "人力资源档案", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(HrmsResourcesFiles hrmsResourcesFiles)
    {
        List<HrmsResourcesFiles> list = hrmsResourcesFilesService.selectHrmsResourcesFilesList(hrmsResourcesFiles);
        ExcelUtil<HrmsResourcesFiles> util = new ExcelUtil<HrmsResourcesFiles>(HrmsResourcesFiles.class);
        return util.exportExcel(list, "人力资源档案数据");
    }

    /**
     * 新增人力资源档案
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存人力资源档案
     */
    @RequiresPermissions("system:files:add")
    @Log(title = "人力资源档案", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(HrmsResourcesFiles hrmsResourcesFiles)
    {
        return toAjax(hrmsResourcesFilesService.insertHrmsResourcesFiles(hrmsResourcesFiles));
    }

    /**
     * 修改人力资源档案
     */
    @RequiresPermissions("system:files:edit")
    @GetMapping("/edit/{ID}")
    public String edit(@PathVariable("ID") String ID, ModelMap mmap)
    {
        HrmsResourcesFiles hrmsResourcesFiles = hrmsResourcesFilesService.selectHrmsResourcesFilesByID(ID);
        mmap.put("hrmsResourcesFiles", hrmsResourcesFiles);
        return prefix + "/edit";
    }

    /**
     * 修改保存人力资源档案
     */
    @RequiresPermissions("system:files:edit")
    @Log(title = "人力资源档案", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(HrmsResourcesFiles hrmsResourcesFiles)
    {
        return toAjax(hrmsResourcesFilesService.updateHrmsResourcesFiles(hrmsResourcesFiles));
    }

    /**
     * 删除人力资源档案
     */
    @RequiresPermissions("system:files:remove")
    @Log(title = "人力资源档案", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(hrmsResourcesFilesService.deleteHrmsResourcesFilesByIDs(ids));
    }
}
