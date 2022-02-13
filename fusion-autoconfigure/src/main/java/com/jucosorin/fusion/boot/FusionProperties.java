package com.jucosorin.fusion.boot;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("fusion")
@Getter
@Setter
public class FusionProperties {

    /**
     * Fusion version
     */
    private String version;
}
