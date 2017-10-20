package io.github.arlol;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@ConfigurationProperties(prefix = "spring.rabbitmq")
public class CustomRabbitProperties extends RabbitProperties {

	@NestedConfigurationProperty
	private final CustomRabbitTemplateProperties template =
	        new CustomRabbitTemplateProperties();

	@Override
	public CustomRabbitTemplateProperties getTemplate() {
		return template;
	}

}
