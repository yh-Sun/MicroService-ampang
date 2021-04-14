package com.ampang.correct.controller;

import com.nepxion.discovery.common.constant.DiscoveryConstant;
import com.nepxion.discovery.plugin.framework.adapter.PluginAdapter;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/correct")
@Api(value = "correct", tags = "测试一下GateWay的路由策略")
@ConditionalOnProperty(name = DiscoveryConstant.SPRING_APPLICATION_NAME, havingValue = "correct-a")
public class CorrectController {

    @Autowired
    private PluginAdapter pluginAdapter;

    /**
     * http://localhost:6000/correct-a/correct/test
     * <br/>
     * Header:
     *      n-d-version-weight={"ampang-policy-a":"1.0=50;1.1=50"}
     *
     * @author  Sun
     * @date    2020/1/9 10:03
     * @return
     **/
    @GetMapping("/test")
    public String getName() {
        // 打印网关通过策略选择的实例
        String sss = pluginAdapter.getPluginInfo("sss");
        System.out.println(sss);
        return sss;
    }


}
