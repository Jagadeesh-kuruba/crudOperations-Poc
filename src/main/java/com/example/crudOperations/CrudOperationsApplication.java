package com.example.crudOperations;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@OpenAPIDefinition(info = @Info(
		title = "CRUD Operations API",
		description = "This API gives you an idea about crud operations on Mysql database",
		version = "v1.0",
		contact = @Contact(
				name = "jagadeesh",
				email = "kurubajagadeesh29@gmail.com",
				url = "www.kuruba.com"
		),
		license = @License(
				name = "Jagadeesh",
				url = "www.kuruba.com"
		)
     )
)
@SpringBootApplication
public class CrudOperationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudOperationsApplication.class, args);
	}

}
