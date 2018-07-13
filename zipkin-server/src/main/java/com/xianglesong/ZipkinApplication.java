package com.xianglesong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import org.springframework.context.ConfigurableApplicationContext;

import zipkin.server.EnableZipkinServer;

/**
 * Created by rollin on 17/10/18.
 */
@EnableZipkinStreamServer
@SpringBootApplication
@EnableZipkinServer
public class ZipkinApplication {

    private static final Logger logger = LoggerFactory.getLogger(ZipkinApplication.class);

    public static void main(String[] args) {
        logger.info("start.");
        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(ZipkinApplication.class).run(args);
        context.addApplicationListener(new ApplicationPidFileWriter());
    }
}
