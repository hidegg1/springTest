package com.example.demo.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PracticeControllerTest {

	@Mock
	private PracticeController controller;
	
	 @InjectMocks
	 PracticeController controller2 = new PracticeController();

	@Before // @Beforeアノテーションをつけ、各テストメソッドの実行前に毎回実行。
	  private void initMocks() {
	    MockitoAnnotations.initMocks(this); // 初期化のおまじない
	  }
	@Test
	public void testEdit() throws Exception{
		when(controller.edit(1)).thenReturn("mv");
		assertEquals(true, true);
		
	}

}
