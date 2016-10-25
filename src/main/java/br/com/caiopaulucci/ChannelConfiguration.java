package br.com.caiopaulucci;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.messaging.PollableChannel;

@Configuration
public class ChannelConfiguration {

	@Bean(name="defaultChannel")
	public PollableChannel defaultChannel() {
		return new QueueChannel(10);
	}

}
