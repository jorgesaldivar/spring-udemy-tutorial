package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

	@Pointcut("execution(* com.spring.aop.Camera.snap(..))")
	public void cameraSnap() {
	}

	@Before("cameraSnap()")
	public void aboutToTakePhoto() {
		System.out.println("about to take photo");
	}

	@AfterReturning("cameraSnap()")
	public void aboutToTakePhotoReturn() {
		System.out.println("about to take photo");
	}

	@Around("cameraSnap()")
	public void aboutToTakePhotoReturn(ProceedingJoinPoint p) {
		System.out.println("about to take photo");
		try {
			p.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}

}
