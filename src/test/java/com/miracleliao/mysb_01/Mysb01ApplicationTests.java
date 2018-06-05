package com.miracleliao.mysb_01;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Mysb01ApplicationTests {

	@LocalServerPort
	private int port;
	private URL base;
	
	@Autowired
	private TestRestTemplate template;
	
	@Before
	public void setup() throws Exception {
		this.base = new URL("http://127.0.0.1:"+port+"/hello");
	}
	
	@Test
	public void contextLoads() {
		ResponseEntity<String> response = template.getForEntity(base.toString(),String.class);
		assertThat(response.getBody(),equalTo("Greetings from Spring Boot!!!"));
	}

}
