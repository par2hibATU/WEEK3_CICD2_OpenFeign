package ie.atu.openfeign_lab3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.validation.annotation.Validated;

@EnableFeignClients
@SpringBootApplication

public class OpenFeignLab3Application {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeignLab3Application.class, args);
    }

}
