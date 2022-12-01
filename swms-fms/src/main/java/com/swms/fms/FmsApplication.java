package com.swms.fms;


import com.swms.fms.config.InterceptorConfig;
import com.swms.fms.config.SpringContextHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.Properties;

@EnableWebMvc
@SpringCloudApplication
@ComponentScans({@ComponentScan({"com.swms.fms.**"})})
@EnableDiscoveryClient
@EnableZuulProxy
@RefreshScope
@EnableAsync
@EnableTransactionManagement
public class FmsApplication {
    private static final Logger log = LoggerFactory.getLogger(FmsApplication.class);
    public static void main(String[] args) {

        SpringContextHolder.arguments = args;
        if (args.length > 0 && args[0].equals("version")) {
            org.springframework.core.io.Resource app = new ClassPathResource("bootstrap.yml");
            YamlPropertiesFactoryBean yamlPropertiesFactoryBean = new YamlPropertiesFactoryBean();
            yamlPropertiesFactoryBean.setResources(new org.springframework.core.io.Resource[]{app});
            Properties properties = yamlPropertiesFactoryBean.getObject();
            log.info("当前版本:v{}", properties.getProperty("version"));
        } else {
            SpringApplication.run(FmsApplication.class, args);
        }
    }
}
