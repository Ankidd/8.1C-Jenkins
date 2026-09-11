package com.example.jenkins_project;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsProjectApplicationTests {

	@Test
	void contextLoads() {
	}

	int Sum(int a, int b){
			return a+b;
		}
	int subjact(int a, int b){
			return a-b;
		}
	int multiply(int a, int b){
			return a*b;
		}
}
