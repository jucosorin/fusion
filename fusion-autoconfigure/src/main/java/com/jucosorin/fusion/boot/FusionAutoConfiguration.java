package com.jucosorin.fusion.boot;

import com.jucosorin.FusionApplicationRunner;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(FusionProperties.class)
@ConditionalOnClass(name = "com.jucosorin.FusionApplicationRunner")
@ConditionalOnProperty(value = "fusion.enabled", havingValue = "true")
public class FusionAutoConfiguration {

    @Bean
    public ApplicationRunner fusionVersionRunner(FusionProperties fusionProperties) {
        return new FusionApplicationRunner(fusionProperties.getVersion());
    }
}
