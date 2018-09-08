package com.ruoyi.framework.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ruoyi.project.system.config.service.IConfigService;

/**
 * RuoYi首创 html调用 thymeleaf 实现参数管理
 *
 * @author Bob Simon
 */
@Component
public class ConfigService
{
    @Autowired
    private IConfigService configService;

    /**
     * 根据键名查询参数配置信息
     * 
     * @param configKey 参数名称
     * @return 参数键值
     */
    public String selectConfigByKey(String configKey) {

        return configService.selectConfigByKey(configKey);
    }

}
