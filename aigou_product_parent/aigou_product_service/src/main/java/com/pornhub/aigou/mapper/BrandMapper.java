package com.pornhub.aigou.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pornhub.aigou.domain.Brand;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pornhub.aigou.query.BrandQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 品牌信息 Mapper 接口
 * </p>
 *
 * @author "æ²§æµ·éæ²"
 * @since 2019-07-30
 */
@Mapper
public interface BrandMapper extends BaseMapper<Brand> {
    /**
     * 分页条件查询
     * @param page
     * @param query
     * @return
     */
    IPage<Brand> queryPage(Page page, @Param("query")BrandQuery query);
}
