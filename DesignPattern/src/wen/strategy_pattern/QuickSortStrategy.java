package wen.strategy_pattern;

public class QuickSortStrategy implements SortStrategy{

	@Override
	public void sort(int[] array, int begin, int end) {
		
		if(end <= begin){
			return ;
		}
		int low = begin;
		int high = end;
		int mid = array[begin];
		while(low < high){
			while(low < high && array[high] > mid)
				high--;
			array[low] = array[high];
			while(low <high && array[low] <= mid)
				low++;
			array[high] = array[low];
		}
		array[low] = mid;
		sort(array,begin,low-1);
		sort(array,low+1,end);
	}

}
