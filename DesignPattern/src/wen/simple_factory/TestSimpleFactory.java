package wen.simple_factory;

import java.util.Scanner;

public class TestSimpleFactory {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String operate = null;
		double numberA, numberB;
		Operation operation = null;
		System.out.println("+、-、*、/");
		while(sc.hasNext()){
			operate = sc.next();
			System.out.println("two number:");
			numberA = sc.nextDouble();
			numberB = sc.nextDouble();
			operation = OperationFactory.createOperation(operate);
			operation.setNumberA(numberA);
			operation.setNumberB(numberB);
			System.out.println("result:"+operation.getResult());
			System.out.println("+、-、*、/");
		}

	}

}
