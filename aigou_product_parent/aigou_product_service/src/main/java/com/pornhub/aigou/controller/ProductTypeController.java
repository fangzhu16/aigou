package com.pornhub.aigou.controller;

import com.pornhub.aigou.query.ProductTypeQuery;
import com.pornhub.aigou.service.IProductTypeService;
import com.pornhub.aigou.domain.ProductType;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pornhub.basic.util.AjaxResult;
import com.pornhub.basic.util.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productType")
public class ProductTypeController {
    @Autowired
    public IProductTypeService productTypeService;


    /**
     * 加载类型树的数据
     *
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<ProductType> list() {

        return productTypeService.loadTypeTree();
    }

    /**
     * 保存和修改公用的
     *
     * @param productType 传递的实体
     * @return Ajaxresult转换结果
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public AjaxResult save(@RequestBody ProductType productType) {
        try {
            if (productType.getId() != null) {
                productTypeService.updateById(productType);
            } else {
                productTypeService.save(productType);
            }
            return AjaxResult.getAjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.getAjaxResult().setMessage("保存对象失败！" + e.getMessage());
        }
    }

    /**
     * 删除对象信息
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public AjaxResult delete(@PathVariable("id") Integer id) {
        try {
            productTypeService.removeById(id);
            return AjaxResult.getAjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.getAjaxResult().setMessage("删除对象失败！" + e.getMessage());
        }
    }

    //获取用户
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ProductType get(@RequestParam(value = "id", required = true) Long id) {
        return productTypeService.getById(id);
    }


    /**
     * 分页查询数据
     *
     * @param query 查询对象
     * @return PageList 分页对象
     */
    @RequestMapping(value = "/json", method = RequestMethod.POST)
    public PageList<ProductType> json(@RequestBody ProductTypeQuery query) {
        IPage<ProductType> page = productTypeService.page(new Page<ProductType>(query.getPageNum(), query.getPageSize()));
        return new PageList<>(page.getTotal(), page.getRecords());
    }

    /**
     * 生成主页面
     *
     * @return
     */
    @GetMapping("/genHomePage")
    public AjaxResult genHomePage() {
        try {
            productTypeService.genHomePage();
            return AjaxResult.getAjaxResult().setSuccess(true).setMessage("成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.getAjaxResult().setSuccess(false).setMessage("失败！" + e.getMessage());
        }
    }

}
