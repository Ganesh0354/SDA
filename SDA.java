package singledimension;

public class singleDArray {
	int arr[];

	public singleDArray(int size) {
		arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}
	public void insertion(int index, int value) {
		try {
			if (arr[index] == Integer.MIN_VALUE) {
				arr[index] = value;
				System.out.println("the value" + value + "is inserted");
			} else {
				System.out.println("the cell is already filled");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid");
		}
	}

	public void traverse() {
		System.out.println("the value are:");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void searching(int search) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				System.out.println(" the value is present in the index of:" + i);
				return;
			}
		}
		System.out.println("the value is not present");
	}

	public void deletion(int index) {
		try {
			if (arr[index] != Integer.MIN_VALUE) {
				arr[index]=Integer.MIN_VALUE;
				System.out.println("deleted");
			}else {
				System.err.println("value didn't not add");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index");
		}
	}

	public static void main(String[] args) {
		singleDArray d =new singleDArray(5);
		d.insertion(0, 10);
		d.insertion(1, 30);
		d.insertion(2, 40);
		d.insertion(3, 60);
		d.insertion(4, 70);
		d.traverse();
		d.searching(30);
		d.deletion(4);
	}
}
