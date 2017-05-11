package com.cgs.demo.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	// http://localhost:8080/swagger-ui.html
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(
						new ApiInfo("API", "接口文档", "V1.0", "服务URL", "author",
								"license", "licenseUrl")).select() // 选择那些路径和api会生成document
				.apis(RequestHandlerSelectors.any()) // 对所有api进行监控
//				.apis(RequestHandlerSelectors.basePackage("com.cgs.demo.swagger.controller.TestController"))
				.paths(PathSelectors.ant("/rest/**")) // 对rest路径进行监控
				.build();
	}

}
