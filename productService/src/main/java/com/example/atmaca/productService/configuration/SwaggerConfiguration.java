package com.example.atmaca.productService.configuration;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.atmaca.productService"))
                .paths(PathSelectors.any())
                .build()
    }

}
