package com.ruoyi.hrms.controller;

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
import com.ruoyi.hrms.domain.HrmsSalaryStandard;
import com.ruoyi.hrms.service.IHrmsSalaryStandardService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 薪酬标准Controller
 * 
 * @author ruoyi
 * @date 2022-01-03
 */
@Controller
@RequestMapping("/system/standard")
public class HrmsSalaryStandardController extends BaseController
{
    private String prefix = "system/standard";

    @Autowired
    private IHrmsSalaryStandardService hrmsSalaryStandardService;

    @GetMapping()
    public String standard()
    {
        return prefix + "/standard";
    }

    /**
     * 查询薪酬标准列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(HrmsSalaryStandard hrmsSalaryStandard)
    {
        startPage();
        List<HrmsSalaryStandard> list = hrmsSalaryStandardService.selectHrmsSalaryStandardList(hrmsSalaryStandard);
        return getDataTable(list);
    }

    /**
     * 导出薪酬标准列表
     */
    @Log(title = "薪酬标准", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(HrmsSalaryStandard hrmsSalaryStandard)
    {
        List<HrmsSalaryStandard> list = hrmsSalaryStandardService.selectHrmsSalaryStandardList(hrmsSalaryStandard);
        ExcelUtil<HrmsSalaryStandard> util = new ExcelUtil<HrmsSalaryStandard>(HrmsSalaryStandard.class);
        return util.exportExcel(list, "薪酬标准数据");
    }

    /**
     * 新增薪酬标准
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存薪酬标准
     */
    @Log(title = "薪酬标准", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(HrmsSalaryStandard hrmsSalaryStandard)
    {
        return toAjax(hrmsSalaryStandardService.insertHrmsSalaryStandard(hrmsSalaryStandard));
    }

    /**
     * 修改薪酬标准
     */
    @GetMapping("/edit/{ID}")
    public String edit(@PathVariable("ID") String ID, ModelMap mmap)
    {
        HrmsSalaryStandard hrmsSalaryStandard = hrmsSalaryStandardService.selectHrmsSalaryStandardByID(ID);
        mmap.put("hrmsSalaryStandard", hrmsSalaryStandard);
        return prefix + "/edit";
    }

    /**
     * 修改保存薪酬标准
     */
    @Log(title = "薪酬标准", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(HrmsSalaryStandard hrmsSalaryStandard)
    {
        return toAjax(hrmsSalaryStandardService.updateHrmsSalaryStandard(hrmsSalaryStandard));
    }

    /**
     * 删除薪酬标准
     */
    @Log(title = "薪酬标准", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(hrmsSalaryStandardService.deleteHrmsSalaryStandardByIDs(ids));
    }
}
