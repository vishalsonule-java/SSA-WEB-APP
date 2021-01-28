package com.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	
	@Bean
	public Docket createDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("public-API")
				.apiInfo(createApiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.ashokit"))
				.paths(PathSelectors.any())
				.build();
	}
	

	private ApiInfo createApiInfo() {
		return new ApiInfoBuilder()
				.title("SSA-WEB- API")
				.description("Develop by Ashok it")
				.version("1.0")
				.build();
	}

}
