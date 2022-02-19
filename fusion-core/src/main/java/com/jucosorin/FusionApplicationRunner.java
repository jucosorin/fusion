package com.jucosorin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

@Slf4j
public record FusionApplicationRunner(String fusionVersion) implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        log.info("Loaded fusion technology with fusion version {}", fusionVersion);
    }
}
