package com.pornhub.aigou.service;

import com.pornhub.aigou.domain.Brand;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pornhub.aigou.query.BrandQuery;
import com.pornhub.basic.util.PageList;

/**
 * <p>
 * 品牌信息 服务类
 * </p>
 *
 * @author "æ²§æµ·éæ²"
 * @since 2019-07-30
 */
public interface IBrandService extends IService<Brand> {
    /**
     * 分页查询
     * @param query
     * @return
     */
    PageList<Brand> queryPage(BrandQuery query);
}
