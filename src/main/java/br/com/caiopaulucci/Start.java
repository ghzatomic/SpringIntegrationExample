package br.com.caiopaulucci;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.support.GenericMessage;

@Configuration
@EnableAutoConfiguration
@IntegrationComponentScan(basePackages = "br.com.caiopaulucci")
//@EnableAspectJAutoProxy
// @ComponentScan("br.com.caiopaulucci")
public class Start {

	public static void main(String[] args) throws InterruptedException {
		// ApplicationContext context = SpringApplication.run(Start.class,
		// args);
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:context.xml");

		MessageChannel input = (MessageChannel) context.getBean("input");
		PollableChannel output = (PollableChannel) context.getBean("output");

		/*PollableChannel channel = (PollableChannel) context.getBean("defaultChannel");
		channel.send(new GenericMessage<String>("hello"));
		Message<?> reply = channel.receive();
		System.out.println("received: " + reply);*/
		
		input.send(new GenericMessage<String>("Spring Integration eeeee"));
	    Message<?> reply = output.receive();
	    System.out.println("received: " + reply);

	}

}