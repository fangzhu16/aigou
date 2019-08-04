package com.pornhub.common;


import com.pornhub.basic.util.AjaxResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@FeignClient(value = "AIGOU-COMMON", fallbackFactory = StaticPageFallBackFactory.class)
public interface StaticPageClient {

    /**
     * 页面静态化
     *
     * @param map model数据 templatePath模板路径 targetPath目标文件路径
     * @return 结果
     */
    @PostMapping("/genStaticPage")
    public AjaxResult genStaticPage(@RequestBody Map<String, Object> map);
}
