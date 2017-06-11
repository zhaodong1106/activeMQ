package com.zhao.activeMQ;



import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;


import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;
@Component
public class Productor{
 private JmsTemplate jmsTemplate;
 public void sendMessage(Destination destination,final String str){
	 System.out.println("向队列" + destination.toString() + "发送了消息------------" + str);
	 jmsTemplate.send(destination,new MessageCreator(){
		 public TextMessage createMessage(Session session) throws JMSException{
			 return session.createTextMessage(str);
		 }
	 });
 }
 public JmsTemplate getJmsTemplate() {  
     return jmsTemplate;  
 }   

 
 public void setJmsTemplate(JmsTemplate jmsTemplate) {  
     this.jmsTemplate = jmsTemplate;  
 } 
}
