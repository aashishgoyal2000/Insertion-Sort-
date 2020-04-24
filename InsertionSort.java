class InsertionSort {

	public static void sort(Comparable[] arr){
		for (int i = 0; i < arr.length; i++) { 
			for (int j = i ; j > 0; j--) {
				if (arr[j].compareTo(arr[j - 1]) < 0) {
					exch(arr, j, j - 1);
				}
			}
		}
	}

	public static void exch(Comparable[] arr, int a,int b){
		Comparable temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}	

}