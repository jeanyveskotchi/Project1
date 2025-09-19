
public class GenericPrint<T> {
	    private T[] array;

	    // Constructor to initialize the array
	    public GenericPrint(T[] array) {
	        this.array = array;
	    }

	    // Method to print the array elements separated by a space
	    public void printArray() {
	        for (T element : array) {
	            System.out.print(element + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Integer[] intArray = {14, 72, 83, 51, 9};
	        Double[] doubleArray = {1.56, 6.2, 31.3, 51.4, 7.9};
	        String[] stringArray = {"apple", "banana", "cherry"};

	        // Using GenericPrint class for 3 different types
	        GenericPrint<Integer> intPrinter = new GenericPrint<>(intArray);
	        GenericPrint<Double> doublePrinter = new GenericPrint<>(doubleArray);
	        GenericPrint<String> stringPrinter = new GenericPrint<>(stringArray);

	        // Testing printArray()
	        System.out.print("Array of Integers: ");
	        intPrinter.printArray();

	        System.out.print("Array of Doubles: ");
	        doublePrinter.printArray();

	        System.out.print("Array of Strings: ");
	        stringPrinter.printArray();
	    }
	}



