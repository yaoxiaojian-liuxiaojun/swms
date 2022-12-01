package com.swms.fms.config;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.util.Objects;
import java.util.Properties;

public class SysEnvironmentPostProcessor implements EnvironmentPostProcessor {
    public SysEnvironmentPostProcessor() {
    }

    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        String[] args = SpringContextHolder.arguments;
        YamlPropertiesFactoryBean yaml = new YamlPropertiesFactoryBean();
        if (args != null && args.length == 1) {
            String ymlPath = args[0];
            yaml.setResources(new Resource[]{new FileSystemResource(ymlPath)});
        } else {
            yaml.setResources(new Resource[]{this.getYml()});
        }

        MutablePropertySources propertySources = environment.getPropertySources();
        propertySources.addFirst(new PropertiesPropertySource("Config", (Properties) Objects.requireNonNull(yaml.getObject())));
    }

    private ClassPathResource getYml() {
        ClassPathResource classPathResource = new ClassPathResource("bootstrap.yml");
        return classPathResource;
    }
}
