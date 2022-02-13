package com.jucosorin.fusion.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(FusionProperties.class)
@Slf4j
public class FusionAutoConfiguration {

    @Bean
    public ApplicationRunner fusionVersionRunner(FusionProperties fusionProperties) {

        return args -> log.info("Fusion version {}", fusionProperties.getVersion());
    }
}
