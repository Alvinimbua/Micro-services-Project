package com.imbuka.cards;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Cards microservice REST API Documentation",
                description = "Benki Cards microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Alvin Imbuka",
                        email = "imbuka@spring.com",
                        url = "https://www.imbuka.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.imbuka.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Benki Cards microservice REST API Documentation",
                url = "https://www.imbuka.com/swagger-ui.html"
        )
)
public class CardsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CardsApplication.class, args);
    }

}
