package wen.simple_factory;

public class OperationFactory {
	
	public static Operation createOperation(String operate){
		Operation operation = null;
		switch(operate){
			case "+": operation = new AddOperation();break;
			case "-": operation = new SubOperation();break;
			case "*": operation = new MulOperation();break;
			case "/": operation = new DivOperation();break;
			default : operation = null;
		}
		return operation;
	}

}
