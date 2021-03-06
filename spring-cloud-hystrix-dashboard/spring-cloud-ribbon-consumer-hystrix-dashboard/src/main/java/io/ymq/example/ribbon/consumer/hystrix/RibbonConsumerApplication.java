package io.ymq.example.ribbon.consumer.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author liuyan
 */
@EnableHystrix
@EnableDiscoveryClient
@EnableHystrixDashboard
@SpringBootApplication
public class RibbonConsumerApplication {

    public static void main(String[] args) {

        SpringApplication.run(RibbonConsumerApplication.class, args);
    }

    @LoadBalanced
    @Bean
    RestTemplate restTemplate() {

        return new RestTemplate();
    }

}
