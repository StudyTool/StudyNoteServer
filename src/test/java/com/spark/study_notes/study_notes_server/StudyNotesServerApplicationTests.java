package com.spark.study_notes.study_notes_server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = StudyNotesServerApplication.class)
@WebAppConfiguration
public class StudyNotesServerApplicationTests {

	@Test
	public void contextLoads() {
	}

}
