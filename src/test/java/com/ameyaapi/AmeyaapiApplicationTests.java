package com.ameyaapi;

import com.ameyaapi.base.service.ITProductService;
import com.ameyaapi.base.service.impl.TProductServiceImpl;
import com.ameyaapi.slave.service.impl.TMfrServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class AmeyaapiApplicationTests {

    @Resource
    TProductServiceImpl productService;
    @Resource
    TMfrServiceImpl mfrService;
    @Test
    void contextLoads() {
        System.out.println(productService.getById("39d1bd525d60ae2692f1ef0760d76721"));
        System.out.println(mfrService.getById("528ec3866a30293d016a9b434db35068"));

    }

}
