package com.zhao.activeMQ;







import javax.jms.Destination;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lin.baseTest.SpringTestCase;

public class TestActiveMQ  extends SpringTestCase{
	@Autowired
	private Destination  destination;
	@Autowired
	private Destination  destination2;
	
	@Autowired
	private Productor productor;
	@Test
	public void testConsumer(){
		productor.sendMessage(destination, "dsadasdadasdds");
	}
	@Test
	public void testObjectMessage(){
		User user=new User();
		user.setName("zhao");
		user.setId("1233");
		productor.sendObjectMesssage(destination2, user);
	}
}
