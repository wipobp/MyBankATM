package com.bank.td.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-07-24T05:48:48.001Z")

@Configuration
public class SwaggerDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("MyBankATM")
            .description("Get all ATMs")
            .license("lic")
            .licenseUrl("www.wipro.com/licenses")
            .termsOfServiceUrl("www.wipro.com/myunit")
            .version("1.0")
            .contact(new Contact("","", "abc@xyz.com"))
            .build();
    }

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("com.bank.td.api"))
                    .build()
                .directModelSubstitute(java.time.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(java.time.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

}
