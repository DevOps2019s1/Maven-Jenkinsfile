package com.greg.gregtest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GregtestApplicationTests {

	@Test
	public void contextLoads() {
	assertThat("hello greg!").isEqualTo("hello greg!");
	
	}
}
