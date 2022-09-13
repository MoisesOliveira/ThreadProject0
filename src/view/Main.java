package view;

public class Main {

	public static void main(String[] args) {
		
		int[] array = generate();
		
		ThreadArray thread1 = new ThreadArray(1,array);
		Thread thread2 = new ThreadArray(2,array);
		
		thread1.start();
		thread2.start();
	}

	
	private static int[] generate() {
		int[] array = new int[100];
		
		for(int i = 0; i < 100; i++) {
			array[i] = i;
		}
		
		return array;
	}
}
