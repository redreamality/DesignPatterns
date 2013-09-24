package com.interpreter.calculator;

import java.util.HashMap;
import java.util.Stack;

/**
 * ��������װ��
 * @author gong_pibao
 */
public class Calculator {
	//�������ʽ
	private Expression expression; 
	//���췽�����β�����
	public Calculator(String expStr){
		//����һ��ջ������������Ⱥ�˳��
		Stack<Expression> stack = new Stack<Expression>();
		//����ʽ���Ϊ�ַ�����
		char [] charArray = expStr.toCharArray();
		//����
		Expression left = null;
		Expression right = null;
		for(int i=0; i<charArray.length; i++){
			switch (charArray[i])
			{
			case '+': //�ӷ�
					//�ӷ�����ŵ�ջ��
					left = stack.pop();
					right = new VarExpression(String.valueOf(charArray[++i]));
					stack.push(new AddExpression(left, right));
					break;
			case '-': //����
					left = stack.pop();
					right = new VarExpression(String.valueOf(charArray[++i]));
					stack.push(new SubExpression(left, right));
					break;
			default: //��ʽ�еı���
					stack.push(new VarExpression(String.valueOf(charArray[i])));
			}
		}
		//���������׳���
		this.expression = stack.pop();
	}
	//��ʼ����
	public int run(HashMap<String, Integer> var){
		
		return this.expression.interpreter(var);
	}
}