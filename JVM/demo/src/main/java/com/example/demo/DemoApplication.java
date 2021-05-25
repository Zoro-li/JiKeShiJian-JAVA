package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		EdCipher edCipher = new EdCipher();
		byte[] a =  edCipher.decryptClass("D:\\JVMlianxi/GCLogAnalysis.classen");
		System.out.println(a);
		//SpringApplication.run(DemoApplication.class, args);
	}

}
