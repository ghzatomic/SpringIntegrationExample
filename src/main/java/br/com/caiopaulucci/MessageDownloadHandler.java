package br.com.caiopaulucci;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessagingException;

public class MessageDownloadHandler implements org.springframework.messaging.MessageHandler {

	@Override
	public void handleMessage(Message<?> message) throws MessagingException {
		String payload = (String) message.getPayload();
		System.out.println("Resp .:"+payload);
	}
	
}