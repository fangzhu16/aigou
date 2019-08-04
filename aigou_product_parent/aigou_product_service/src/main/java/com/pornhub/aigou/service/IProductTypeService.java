package com.pornhub.aigou.service;

import com.pornhub.aigou.domain.ProductType;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 商品目录 服务类
 * </p>
 *
 * @author "æ²§æµ·éæ²"
 * @since 2019-07-30
 */
public interface IProductTypeService extends IService<ProductType> {

    /**
     * 加载类型树
     *
     * @return
     */
    List<ProductType> loadTypeTree();


    void genHomePage();
}
