package io.github.arlol;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties;

public class CustomRabbitTemplateProperties
        extends RabbitProperties.Template {

	private String exchange;

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

}
