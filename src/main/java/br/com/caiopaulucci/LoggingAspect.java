package br.com.caiopaulucci;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(* br.com.caiopaulucci.Gritador.shout(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("teste : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}

}