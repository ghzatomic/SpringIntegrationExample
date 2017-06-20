package br.com.caiopaulucci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.integration.channel.PublishSubscribeChannel;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessages {
	
	@Autowired
	@Qualifier("p2p-pollable-channel")
	private MessageChannel canalNormal;
	//PublishSubscribeChannel
	
	@RequestMapping(method = RequestMethod.GET, value = "/digaoi", produces = MediaType.APPLICATION_JSON_VALUE)
    public void start() {
		canalNormal.send(new GenericMessage<String>("MANDANDO UM OI !"));
    }
	
}
