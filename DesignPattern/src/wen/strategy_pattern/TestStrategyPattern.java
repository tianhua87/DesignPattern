package wen.strategy_pattern;

public class TestStrategyPattern {

	public static void main(String[] args) {
		
		int[] array = new int[]{1,5,2,8,9,5,3,7,0};
		int begin = 0;
		int end = array.length-1;
		
		SortContext sortContext = new SortContext(new QuickSortStrategy());
		sortContext.sort(array, begin, end);
		
		for(int i=0; i<array.length; i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();

	}

}
