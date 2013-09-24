package com.flyweight.flyweight;

public class ConcreteFlyWeight1 extends Flyweight{
	//接受外部状态
	public ConcreteFlyWeight1(String Extrinsic) {
		super(Extrinsic);
	}
	//根据外部状态进行业务逻辑处理
	@Override
	public void operate() {
		//业务逻辑
	}

}
