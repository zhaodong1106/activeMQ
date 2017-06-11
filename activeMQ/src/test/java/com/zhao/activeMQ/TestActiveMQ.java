package com.zhao.activeMQ;







import javax.jms.Destination;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lin.baseTest.SpringTestCase;

public class TestActiveMQ  extends SpringTestCase{
	@Autowired
	private Destination  destination;
	@Autowired
	private Productor productor;
	@Test
	public void testConsumer(){
		productor.sendMessage(destination, "dsadasdadasdds");
	}
}
