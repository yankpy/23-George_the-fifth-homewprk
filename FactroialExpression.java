package com.feint;

import java.util.ArrayList;
import java.util.List;

public class FactroialExpression implements Factorial{
	private List<Factorial> list=new ArrayList<>();
	
	@Override
	public void add(Factorial value) {
		// TODO Auto-generated method stub
		list.add(value);
	}
	
	@Override
	public int multi() {
		// TODO Auto-generated method stub
		int result=1;
		for(Factorial number:list){
			result*=number.multi();
		}
		
		return result;
	}
	
	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		
	}
}
