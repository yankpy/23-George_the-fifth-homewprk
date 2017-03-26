package com.feint.test;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import com.feint.Factorial;
import com.feint.FactorialNumber;
import com.feint.FactroialExpression;

public class FactorialTest {
	Factorial expression;
	
	@Before
	public void createFactorialNumList(){
//		Factorial subA=new FactroialExpression();
//		Factorial subB=new FactroialExpression();
//		
//		expression=new FactroialExpression();
//		for(int i=1;i<5;i++)
//			subA.add(new FactorialNumber(i));
//		for(int i=5;i<10;i++)
//			subB.add(new FactorialNumber(i));
//		expression.add(subA);
//		expression.add(subB);
		Scanner scanner=new Scanner(System.in);
		int  max=scanner.nextInt();
		expression=new FactroialExpression();
		for(int i=1;i<=max;i++)
			expression.add(new FactorialNumber(i));
	}
	
	
	@Test
	public void testFactorial(){
		System.out.println(expression.multi());
	}
}
