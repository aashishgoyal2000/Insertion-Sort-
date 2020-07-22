class recursiveInsertion {
	public static void recursiveInsertionSort (int[] arr, int n) {
		if (n < 1) {
			return;
		}
		
		recursiveInsertionSort(arr,n - 1);

		int key = arr[n];
		int i = n - 1;
		while (i >= 0 && key < arr[i] ) {
			arr[i + 1] = arr[i];
			i--;
		}
		arr[i + 1] = key;

	}
	public static void main(String[] args) {
		int[] arr = {4, 2, 9, 5, 8, 11, 3, 1};
		recursiveInsertionSort(arr, arr.length - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}