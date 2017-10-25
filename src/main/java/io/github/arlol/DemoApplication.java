package io.github.arlol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(DemoProperties.class)
public class DemoApplication {

	@Bean
	@ConfigurationProperties("demo.bean")
	public RabbitProperties rabbitProperties() {
		return new RabbitProperties();
	}

	@Bean
	@ConfigurationProperties("demo.bean.template")
	public CustomRabbitTemplateProperties customRabbitTemplateProperties() {
		return new CustomRabbitTemplateProperties();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
