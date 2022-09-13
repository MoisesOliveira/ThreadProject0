package view;

public class ThreadArray extends Thread {

	private int[] array;
	private int number;
	
	public ThreadArray(int number, int[] array) {
		this.number = number;
		this.array = array;
	}
	
	@Override
	public void run() {
		
		long start = System.nanoTime();
		
		if((number % 2) == 0) {
			for(int i = 0; i < array.length;i++) {
				
			}
		}
		else {
			for(int j : array) {
				
			}
		}
		
		long end = System.nanoTime();
		
		double elapsed = end - start;
		
		elapsed = elapsed / Math.pow(10, 9);
		
		System.out.println("Time: " + elapsed);
	}

}
