package io.github.arlol;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

public class CustomOverrideRabbitProperties extends RabbitProperties {

	@NestedConfigurationProperty
	private CustomRabbitTemplateProperties template =
	        new CustomRabbitTemplateProperties();

	// Note that there are no getters or setters
	@NestedConfigurationProperty
	private final Ssl ssl = new Ssl();

	@Override
	public CustomRabbitTemplateProperties getTemplate() {
		return template;
	}

	public void setTemplate(CustomRabbitTemplateProperties template) {
		this.template = template;
	}

}
