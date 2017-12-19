package wen.strategy_pattern;

public class SortContext {
	
	SortStrategy sortStrategy;
	public SortContext(SortStrategy sortStrategy){
		this.sortStrategy = sortStrategy;
	}
	
	public void sort(int[] array, int begin, int end){
		sortStrategy.sort(array, begin, end);
	}

}
