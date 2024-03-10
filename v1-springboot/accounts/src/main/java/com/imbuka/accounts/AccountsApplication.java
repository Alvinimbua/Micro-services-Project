package com.imbuka.accounts;

import com.imbuka.accounts.dto.AccountsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {AccountsContactInfoDto.class} )
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "Benki Accounts microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Alvin Imbuka",
						email = "imbuka@alvin.com",
						url = "https://www.imbuka.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.imbuka.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "Benki Accounts microservice REST API Documentation",
				url = "https://https://www.imbuka.com/swagger-ui.html"
		)
)

public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
