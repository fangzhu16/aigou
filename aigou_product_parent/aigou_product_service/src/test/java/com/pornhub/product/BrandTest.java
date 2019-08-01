package com.pornhub.product;

import com.pornhub.aigou.ProductApplication;
import com.pornhub.aigou.service.IBrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=ProductApplication.class)
public class BrandTest {
    @Autowired
    private IBrandService brandService;

    @Test
    public void test(){
        brandService.list().forEach(e->{
            System.out.println(e);
        });
    }
}
