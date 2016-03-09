package com.spring.aop;

import org.springframework.stereotype.Component;

@Component("camera")
public class Camera implements PhotoSnapper {

	public void snap() {
		System.out.println("snap");
	}
	
}
