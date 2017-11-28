package cl.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationRestService {

  public static void main(String[] args) {
    SpringApplication.run(ApplicationRestService.class, args);
  }
}