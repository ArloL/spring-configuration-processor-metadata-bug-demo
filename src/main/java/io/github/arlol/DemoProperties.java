package io.github.arlol;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@ConfigurationProperties("demo")
public class DemoProperties {

	@NestedConfigurationProperty
	private RabbitProperties rabbit = new RabbitProperties();

	@NestedConfigurationProperty
	private final CustomRabbitProperties custom = new CustomRabbitProperties();

	@NestedConfigurationProperty
	private CustomOverrideRabbitProperties override =
	        new CustomOverrideRabbitProperties();

	public RabbitProperties getRabbit() {
		return rabbit;
	}

	public void setRabbit(RabbitProperties rabbit) {
		this.rabbit = rabbit;
	}

	public CustomRabbitProperties getCustom() {
		return custom;
	}

	public CustomOverrideRabbitProperties getOverride() {
		return override;
	}

	public void setOverride(CustomOverrideRabbitProperties override) {
		this.override = override;
	}

}
